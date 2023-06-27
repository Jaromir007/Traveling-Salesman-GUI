package com.obitko.travelingSalesman;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Population {
// Create a new ArrayList to store routes.
    private ArrayList<Route> routes = new ArrayList<>(Settings.POPULATION_SIZE);

// Constructor for population initialized with a genetic algorithm.
    public Population(int populationSize, GeneticAlgorithm geneticAlgorithm) {
        IntStream.range(0, populationSize).forEach(x -> routes.add(new Route(geneticAlgorithm.getInitialRoute())));
    }
// Constructor for population initialized with a list of cities.
    public Population(int populationSize, ArrayList<City> cities) {
        IntStream.range(0, populationSize).forEach(x -> routes.add(new Route(cities)));
    }
// Sort the routes in the population by their fitness values.
    public void sortRoutesByFitness() {
        routes.sort((route1, route2) -> {
            int flag = 0;
            if (route1.getFitness() > route2.getFitness())
                flag = -1;
            else if (route1.getFitness() < route2.getFitness())
                flag = 1;
            return flag;
        });
    }
    // Get the ArrayList of routes in the population.
    public ArrayList<Route> getRoutes() {
        return routes;
    }
}
