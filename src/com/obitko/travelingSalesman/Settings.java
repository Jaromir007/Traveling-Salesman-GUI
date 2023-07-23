package com.obitko.travelingSalesman;

// This object stores all important variables for the animation and genetic algorithm.
// All variables can be set from the GUI panel and will affect the algorithm in real time
// I mean right after you set them

public class Settings {
    public static int POPULATION_SIZE = 10;
//  How many routes are in one population
//  Increase it with growing number of cities
//  The more routes in one population, the fewer generations you will need
//  But generally, it's better to have more generations
    public static int NUM_OF_CITIES = 10;
//  How many cities are generated when you press random button
//  It doesn't affect anything else, it's just for the animation
    public static int NUMB_OF_ELITE_ROUTES = 1;
//  Those rotes can't be mutated
//  Should increase with more cities, but keep it between 1 and 6
    public static int GENERATION_LIMIT = 30;
//  How many generations are evolved before the algorithm ends
    public static double MUTATION_RATE = 0.05;
//  Usually works the best around 4 to 8 percent
    public static int TOURNAMENT_SELECTION_SIZE = 4;
//  The maximum for TOURNAMENT_SELECTION_SIZE in the GUI is 10 to avoid errors when NUMB_OF_CITIES has minimum 10
//  However for larger amount of cities (30 and more) is better to have this value higher than 10
//  So feel free to adjust the limit in GraphicDriver, but then always select higher NUMB_OF_CITIES than TOURNAMENT_SELECTION_SIZE
    public static int DELAY = 20;
//  !Alert! don't set the DELAY under 20!
//  The Genetic algorithm is fast
//  But not fast enough for such a short animation delay
//  So the AnimationPanel would update before the algorithm generates new values
//  And this creates error
//  Therefore,
//  Just don't set it under 20
}
