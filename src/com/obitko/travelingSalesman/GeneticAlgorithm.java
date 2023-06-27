package com.obitko.travelingSalesman;

import java.util.ArrayList;
import java.util.stream.IntStream;
// GeneticAlgorithm class is responsible for the evolving process
public class GeneticAlgorithm {
// // Stores the initial route for the genetic algorithm.
    private ArrayList<City> initialRoute;
//  constructor for setting initialRoute
    public GeneticAlgorithm(ArrayList<City> initialRoute) {
        this.initialRoute = initialRoute;
    }
    public ArrayList<City> getInitialRoute() {
        return initialRoute;
    }
//  Evolve given population.
    public Population evolve(Population population) {
        return mutatePopulation(crossoverPopulation(population));
    }
//  Randomly mutate each route in the given population.
//  Skip elite clones - NUMB_OF_ELITE_CHROMOSOMES.
    private Population mutatePopulation(Population population) {
        population.getRoutes().stream().filter(x -> population.getRoutes().indexOf(x) >= Settings.NUMB_OF_ELITE_ROUTES).forEach(x -> mutateRoute(x));
        return population;
    }
//  Take one route and randomly swap two cities, based on the MUTATION_RATE.
    private void mutateRoute(Route route){
        route.getCities().stream().filter(x -> Math.random() < Settings.MUTATION_RATE).forEach(cityX -> {
            int y = (int) (route.getCities().size()*Math.random());
            City cityY = route.getCities().get(y);
            route.getCities().set(route.getCities().indexOf(cityX), cityY);
            route.getCities().set(y, cityX);
        });
    }
//  Perform crossover on the given population.
    private Population crossoverPopulation(Population population) {
        Population crossoverPopulation = new Population(population.getRoutes().size(), this);
        // Copy elite routes from the original population to the crossover population
        IntStream.range(0, Settings.NUMB_OF_ELITE_ROUTES).forEach(x -> crossoverPopulation.getRoutes().set(x, population.getRoutes().get(x)));
        // Copy elite routes from the original population to the crossover population
        IntStream.range(Settings.NUMB_OF_ELITE_ROUTES, crossoverPopulation.getRoutes().size()).forEach(x -> {
            Route route1 = tournamentSelection(population).getRoutes().get(0);
            Route route2 = tournamentSelection(population).getRoutes().get(0);
            // Perform crossover between the selected routes and add the resulting route to the crossover population
            crossoverPopulation.getRoutes().set(x, crossoverRoute(route1, route2));
        });
        return crossoverPopulation;
    }

// Perform tournament selection on a given population.
    private Population tournamentSelection(Population population) {
        // Create a new population for the tournament.
        Population tournamentPopulation = new Population(Settings.TOURNAMENT_SELECTION_SIZE, this);
        // Randomly select routes from the original population to form the tournament population.
        IntStream.range(0, Settings.TOURNAMENT_SELECTION_SIZE).forEach(x -> {
            int randomIndex = (int) (Math.random() * population.getRoutes().size());
            // Get the route at the randomly selected index from the original population.
            Route selectedRoute = population.getRoutes().get(randomIndex);
            // Set the selected route in the tournament population.
            tournamentPopulation.getRoutes().set(x, selectedRoute);
        });
        tournamentPopulation.sortRoutesByFitness();
        return tournamentPopulation;
    }
// Performs crossover between two routes.
    private Route crossoverRoute(Route route1, Route route2) {
        Route crossoverRoute = new Route(this);
        // Determine the parent routes for crossover based on a random probability.
        Route tempRoute1 = route1;
        Route tempRoute2 = route2;
        if (Math.random() < 0.5) {
            tempRoute1 = route2;
            tempRoute2 = route1;
        }
        // Copy the first half of cities from the selected parent route to the crossover route.
        for (int x = 0; x < crossoverRoute.getCities().size() / 2; x++) {
            crossoverRoute.getCities().set(x, tempRoute1.getCities().get(x));
        }
        // Fill the remaining null cities in the crossover route with cities from the other parent route.
        return fillNulls(crossoverRoute, tempRoute2);
    }
// Fill null cities in the crossover route with cities from the other route.
    private Route fillNulls(Route crossoverRoute, Route route) {
        route.getCities().stream().filter(x -> !crossoverRoute.getCities().contains(x)).forEach(cityX -> {
            // Find the first null city in the crossover route and replace it with the city from the other route.
            for (int y = 0; y < route.getCities().size(); y++) {
                if (crossoverRoute.getCities().get(y) == null) {
                    crossoverRoute.getCities().set(y, cityX);
                    break;
                }
            }
        });
        return crossoverRoute;
    }
}
