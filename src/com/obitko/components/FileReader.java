package com.obitko.components;

import com.obitko.travelingSalesman.City;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
//  Read input data from a file and convert it into an ArrayList of City objects.
public class FileReader {
    private final File file;
// Constructor accepting a file path as a string.
    public FileReader(String input) throws IOException {
        File inputAsFile = new File(input);
        if (!inputAsFile.exists()) {
            throw new IOException("File doesn't exist.");
        }
        this.file = inputAsFile;
    }
// Constructor accepting a File object.
    public FileReader(File inputFile) throws IOException {
        if (!inputFile.exists()) {
            throw new IOException("File doesn't exist.");
        }
        this.file = inputFile;
    }
// Constructor accepting a Path object.
    public FileReader(Path inputPath) throws IOException {
        File inputFile = inputPath.toFile();
        if (!inputFile.exists()) {
            throw new IOException("File doesn't exist.");
        }
        file = inputFile;
    }
// Read the contents of the file and return an ArrayList of cities.
    public ArrayList<City> read() {
        ArrayList<City> initialRoute = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ", 3);
                int x = Integer.parseInt(parts[0]);
                int y = Integer.parseInt(parts[1]);
                String cityName = parts[2];
                initialRoute.add(new City(cityName, x, y));
            }
            return initialRoute;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
