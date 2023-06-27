package com.obitko.travelingSalesman;

// This object stores all important variables for the animation and genetic algorithm.

public class Settings {
    public static int POPULATION_SIZE = 10;
    public static int NUM_OF_CITIES = 10;
    public static int NUMB_OF_ELITE_ROUTES = 1;
    public static int GENERATION_LIMIT = 30;
    public static double MUTATION_RATE = 0.05;
    public static int TOURNAMENT_SELECTION_SIZE = 4;
//  !Alert! don't set this value under 20! (Just don't do it please)
    public static int DELAY = 20;
}
