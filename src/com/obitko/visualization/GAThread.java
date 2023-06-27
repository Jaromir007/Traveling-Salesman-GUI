package com.obitko.visualization;
import com.obitko.drivers.GraphicsDriver;
import com.obitko.travelingSalesman.*;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class GAThread implements Runnable {
    //  Format pattern for rounding doubles
    private final DecimalFormat DF = new DecimalFormat("#.###");
    private Thread gaThread;
//  Arraylist of cities, storing the first route.
//  The initial route contains cities with the same name as their index.
    public ArrayList<City> initialRoute;
    public Population population;
//  instance of the AnimationPanel for drawing the animation
    private AnimationPanel panel;
//  Boolean value that indicates, whether the thread is running
    public boolean running = false;
    private int generationNumber = 1;
//  constructor creating new AnimationPanel
    public GAThread(AnimationPanel panel){
        this.panel = panel;
    }
//  Start method check if the population exists. If so, it creates new thread and starts it.
    public void start() {
        if (population == null) return;
        generationNumber = 0;
        running = true;
        gaThread = new Thread(this);
        gaThread.start();
    }
//  Stop method check if the thread exists. If so, it interrupts the existing thread and setting it to null.
    public void stop() {
        if (gaThread == null) return;
        running = false;
        gaThread.interrupt();
        gaThread = null;
    }
//  Whole process of the genetic algorithm:
    @Override
    public void run() {
        if(!running) return;
//      Create a new GeneticAlgorithm instance with the initial route
        GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(initialRoute);
//      Main loop that runs until the generation limit is reached or the algorithm is stopped
        while (running && generationNumber < Settings.GENERATION_LIMIT+1) {
            GraphicsDriver.generationLabel.setText("Generation: " + generationNumber++);
            population = geneticAlgorithm.evolve(population);
            population.sortRoutesByFitness();
            GraphicsDriver.fitnessLabel.setText("Highest Fitness :" + DF.format(population.getRoutes().get(0).getFitness()));
            GraphicsDriver.totalDistanceLabel.setText(" Best total distance: " + population.getRoutes().get(0).totalDistance());
            panel.repaint();
//          Pause the thread for the specified delay
            try {
                Thread.sleep(Settings.DELAY);
            } catch (InterruptedException e) {
            }
        }
        running = false;
        panel.repaint();
    }
}
