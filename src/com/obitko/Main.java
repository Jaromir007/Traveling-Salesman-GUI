package com.obitko;
import com.obitko.drivers.ConsoleDriver;
import com.obitko.drivers.GraphicsDriver;

import java.io.IOException;
// main to call GraphicsDriver or ConsoleDriver
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
    new GraphicsDriver();
//    ConsoleDriver consoleDriver = new ConsoleDriver("in.txt");
//    consoleDriver.print();
    }
}  