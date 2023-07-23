# Traveling Salesman Problem Solver using Genetic Algorithm

A visualisation of the Genetic Algorithm solving the Traveling Salesman Problem (TSP). The program includes a GUI that allows you to set various variables for the algorithm and animation properties.

## How to Run

1. Make sure you have Java installed on your system.
2. Clone this repository to your local machine.
3. Open the project in your favorite Java IDE.
4. Locate the `Main` class and run it.

## Algorithm Settings

The following are the available settings that you can modify to adjust the behavior of the Genetic Algorithm:

- ** Population Size**

The number of routes in one population. As the number of cities grows, it's recommended to increase the population size. A larger population size generally requires fewer generations to find a solution. 

### Number of Cities

The number of cities generated when you press the random button in the GUI. This setting only affects the animation and doesn't impact the algorithm's execution.

### Number of Elite Routes 

Elite routes are the best routes in each generation and are immune to mutation. It's suggested to increase this value with more cities, but keep it between 1 and 6.

### Generation Limit 

The maximum number of generations the algorithm will evolve before terminating. Adjust this value based on the complexity of the problem and the time it takes to find a satisfactory solution.

### Mutation Rate 

The probability that a route will undergo mutation. A rate between 4 to 8 percent typically works best.

### Tournament Selection Size 

The number of routes that participate in the tournament selection process. The maximum allowed value in the GUI is 10, but for larger numbers of cities (30 and more), it's better to have a higher value. You can adjust the limit in the `GraphicDriver` class, but always select a higher `NUMB_OF_CITIES` than `TOURNAMENT_SELECTION_SIZE`.

### Animation Delay 

**Important:** Do not set the delay below 20!

The Genetic Algorithm is fast, but not fast enough to handle an animation delay shorter than 20 milliseconds. A very short animation delay can lead to the AnimationPanel updating before the algorithm generates new values, resulting in errors. 

## Usage

1. Run the program, and the GUI will appear.
2. Adjust the algorithm settings on the right panel. Select your own cities or press random to create them. 
3. Press the "Start" button to initiate the Genetic Algorithm with the specified settings.
4. Observe the beautiful animation as the algorithm progresses. (You can make real time changes with adjusting the variables.)
5. Once the algorithm reaches the specified generation limit, it will stop, and the best route will be displayed.
