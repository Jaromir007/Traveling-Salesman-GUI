package com.obitko;
import com.obitko.drivers.ConsoleDriver;
import com.obitko.drivers.GraphicsDriver;

import java.io.IOException;
// main to call GraphicsDriver or ConsoleDriver
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
//  Create new GraphicDriver, everything after that happens on the GUI
    new GraphicsDriver();

//    Create new consoleDriver, the .print() method will start the genetic algorithm
//    ConsoleDriver consoleDriver = new ConsoleDriver("in.txt");
//    consoleDriver.print();
    }
}

// No one will probably ever use the ConsoleDriver, but in case you are curious how it works:
// It takes the "in.txt" file with the cities and coordinates
// Then creates the same genetic algorithm as for the graphicDriver
// Then it will print all information about the process into your console
// To set algorithm variables, go to travelingSalesman/Settings