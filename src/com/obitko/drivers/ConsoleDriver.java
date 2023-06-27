package com.obitko.drivers;

import com.obitko.components.FileReader;
import com.obitko.travelingSalesman.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

// ConsoleDriver reads a file path, initializes a genetic algorithm, and prints the resulting values to the console.
public class ConsoleDriver {
    private final ArrayList<City> initialRoute;
// Constructor accepting a file path as a string.
    public ConsoleDriver(String input) throws IOException {
        FileReader reader = new FileReader(input);
        initialRoute = reader.read();
    }
// Constructor accepting a File object.
    public ConsoleDriver(File inputFile) throws IOException{
        FileReader reader = new FileReader(inputFile);
        initialRoute = reader.read();
    }
// Constructor accepting a Path object.
    public ConsoleDriver(Path inputPath) throws IOException {
        FileReader reader = new FileReader(inputPath);
        initialRoute = reader.read();
    }
//  Start the genetic algorithm and print the values.
    public void print(){
        Population population = new Population(Settings.POPULATION_SIZE, initialRoute);
        population.sortRoutesByFitness();
        printHeading(0);
        printPopulation(population);

        int generationNumber = 1;
        GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(initialRoute);
        while (generationNumber < Settings.GENERATION_LIMIT){
            printHeading(generationNumber++);
            population = geneticAlgorithm.evolve(population);
            population.sortRoutesByFitness();
            printPopulation(population);
        }
        System.out.println("The Best Rout So Far: " + population.getRoutes().get(0));
        System.out.println("w/ a distance of: " + String.format("%.2f", population.getRoutes().get(0).totalDistance()) + "km");
    }
// A special method for printing the heading of the population.
// Fits on any number of cities.
    private void printHeading(int generationNumber) {
        System.out.print("> Generation # "+generationNumber);
        String headingColumn = "Route";
        String remainingHeadingColumns = "Fitness | Distance";
        // Calculate the total length required for city names in the initial route.
        int cityNamesLength = 0;
        for (City city : initialRoute) cityNamesLength += city.getName().length();
        // Calculate the total length required for the output array.
        int arrayLength = cityNamesLength + initialRoute.size()*2;
        // Calculate the length of spaces needed on each side of the heading column
        int partialLength = (arrayLength - headingColumn.length() - remainingHeadingColumns.length())/2;
        for (int x=0; x < partialLength; x++)System.out.print(" ");
        System.out.print(headingColumn);
        for (int x=0; x < partialLength; x++)System.out.print(" ");
        if ((arrayLength % 2) == 1)System.out.print(" ");
        System.out.println(" | "+ remainingHeadingColumns);
        // Calculate the total length for the line of dashes
        cityNamesLength += remainingHeadingColumns.length() + 3;
        for (int x=0; x < cityNamesLength+initialRoute.size()*2; x++)System.out.print("-");
        System.out.println();
    }
// Print the population table with route details, fitness, and distance.
    private void printPopulation(Population population){
        population.getRoutes().forEach(x -> {
            System.out.println(Arrays.toString(x.getCities().toArray()) + " | " +
                    String.format("%.4f", x.getFitness()) + " | " + String.format("%.2f", x.totalDistance()));
        });
        System.out.println();
    }
}
