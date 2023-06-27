package com.obitko.travelingSalesman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Route {
    private boolean isFitnessChanged = true;
//  Fitness of this route
    private double fitness = 0;
    private ArrayList<City> cities = new ArrayList<City>();

// Constructor for Route initialized with a genetic algorithm.
    public Route(GeneticAlgorithm geneticAlgorithm){
        geneticAlgorithm.getInitialRoute().forEach(x -> cities.add(null));
    }
// Constructor for Route initialized with a list of cities.
    public Route(ArrayList<City> cities){
        this.cities.addAll(cities);
        Collections.shuffle(this.cities);
    }
// Calculate and return the fitness value of the route.
    public double getFitness(){
        if (isFitnessChanged) {
            fitness = (1/totalDistance())*1000;
            return fitness;
        }
        return fitness;
    }
// Calculate and return the total distance of the route.
    public double totalDistance() {
        int numOfCities = this.cities.size();
        int sum = 0;

        for (int cityIndex = 0; cityIndex < numOfCities; cityIndex++) {
            double returnValue = 0;
            City currentCity = this.cities.get(cityIndex);

            if (cityIndex < numOfCities - 1) {
                City nextCity = this.cities.get(cityIndex + 1);
                returnValue = currentCity.measureDistance(nextCity);
            }
            sum += returnValue;
        }
        // Add the distance between the first and last cities to complete the loop.
        City firstCity = this.cities.get(0);
        City lastCity = this.cities.get(numOfCities - 1);
        sum += firstCity.measureDistance(lastCity);

        return sum;
    }
// Return a string representation of the route.
    @Override
    public String toString(){
        return Arrays.toString(cities.toArray());
    }
// Get the list of cities in the route.
    public ArrayList<City> getCities(){
        isFitnessChanged = true;
        return cities;
    }
}
