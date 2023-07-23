package com.obitko.drivers;

import com.obitko.travelingSalesman.Settings;
import com.obitko.visualization.AnimationPanel;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class GraphicsDriver extends javax.swing.JFrame {

    public GraphicsDriver() {
        initComponents();
    }

//  Method for initialising components and building the JFrame.
    private void initComponents() {
//      Creating new instance of each variable
        settingsLabel1 = new javax.swing.JLabel();
        settingsLabel2 = new javax.swing.JLabel();
        settingsLabel3 = new javax.swing.JLabel();
        settingsLabel4 = new javax.swing.JLabel();
        settingsLabel5 = new javax.swing.JLabel();
        settingsLabel6 = new javax.swing.JLabel();
        settingsLabel7 = new javax.swing.JLabel();

        settingsBox1 = new javax.swing.JComboBox<>();
        settingsBox2 = new javax.swing.JComboBox<>();
        settingsBox3 = new javax.swing.JComboBox<>();
        settingsBox4 = new javax.swing.JComboBox<>();
        settingsBox5 = new javax.swing.JComboBox<>();
        settingsBox6 = new javax.swing.JComboBox<>();
        settingsBox7 = new javax.swing.JComboBox<>();

        leftPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        panel1 = new AnimationPanel();
        buttonsPanel = new javax.swing.JPanel();
        settingsPanel = new javax.swing.JPanel();
        explanatoryPanel = new javax.swing.JPanel();

        divider1 = new javax.swing.JSeparator();
        divider2 = new javax.swing.JSeparator();
        divider3 = new javax.swing.JSeparator();
        divider4 = new javax.swing.JSeparator();

        generationLabel = new java.awt.Label();
        totalDistanceLabel = new java.awt.Label();
        fitnessLabel = new java.awt.Label();
        populationNumber = new JLabel();

        titleLabel = new javax.swing.JLabel();
        copyrightLabel = new javax.swing.JLabel();

        randomButton = new javax.swing.JButton();
        selectButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();

        citiesLabel = new javax.swing.JLabel();
        routesLabel = new javax.swing.JLabel();
        bestRouteLabel = new javax.swing.JLabel();

        image1 = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        image3 = new javax.swing.JLabel();

//      Basic settings for the JFrame
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.BLACK);
        setMinimumSize(new java.awt.Dimension(1360, 765));
        setPreferredSize(new java.awt.Dimension(1360, 765));
        ImageIcon icon = new ImageIcon("src/com/obitko/images/face.png");
        setIconImage(icon.getImage());
        setTitle("Traveling salesman problem");

//      Settings for the header panel.
        headerPanel.setBackground(new java.awt.Color(51, 51, 51));

//      Labels that display values from the genetic algorithm.

//      Label for displaying the current generation number.
        generationLabel.setFont(new java.awt.Font("Segoe UI", 0, 18));
        generationLabel.setForeground(new java.awt.Color(249, 249, 249));
        generationLabel.setText("Generation: 000");

//      Label for displaying best total distance.
        totalDistanceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18));
        totalDistanceLabel.setForeground(new java.awt.Color(249, 249, 249));
        totalDistanceLabel.setText("Best total distance: 00000");

//      Label for displaying the highest fitness.
        fitnessLabel.setFont(new java.awt.Font("Segoe UI", 0, 18));
        fitnessLabel.setForeground(new java.awt.Color(249, 249, 249));
        fitnessLabel.setText("Highest fitness: 0.000");

//      Create new layout for the header panel.
        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addComponent(generationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(80, 80, 80)
                                .addComponent(totalDistanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(80, 80, 80)
                                .addComponent(fitnessLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(totalDistanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fitnessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(generationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        leftPanel.setBackground(Color.BLACK);
        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
                leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
                leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftPanelLayout.createSequentialGroup()
                                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

//      Settings of the right panel
        rightPanel.setBackground(new java.awt.Color(249, 249, 249));
        rightPanel.setFont(new java.awt.Font("Segoe UI", 0, 25));

//      Set the title label - Traveling Salesman
        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 25));
        titleLabel.setText("Traveling Salesman");
        titleLabel.setToolTipText("");

//      Buttons settings and actionEvent
        buttonsPanel.setBackground(new java.awt.Color(249, 249, 249));

//      "Random" button - generate random cities.
        randomButton.setBackground(new java.awt.Color(0, 0, 255));
        randomButton.setFont(new java.awt.Font("Segoe UI", 0, 18));
        randomButton.setForeground(new java.awt.Color(255, 255, 255));
        randomButton.setText("Random");
        randomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomButtonActionPerformed(evt);
            }
        });

//      "Select" button - allows the user to select cities.
        selectButton.setBackground(new java.awt.Color(0, 0, 255));
        selectButton.setFont(new java.awt.Font("Segoe UI", 0, 18));
        selectButton.setForeground(new java.awt.Color(255, 255, 255));
        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });
//      "Start" button - starts the animation.
        startButton.setBackground(new java.awt.Color(0, 122, 61));
        startButton.setFont(new java.awt.Font("Segoe UI", 0, 18));
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

//      Create new layout for the buttonsPanel.
        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
                buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)
                                .addComponent(randomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)
                                .addComponent(selectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonsPanelLayout.setVerticalGroup(
                buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(randomButton)
                                        .addComponent(selectButton)
                                        .addComponent(startButton))
                                .addContainerGap(8, Short.MAX_VALUE))
        );

//      Settings for the explanatoryPanel - text and images.
        explanatoryPanel.setBackground(new java.awt.Color(249, 249, 249));

        citiesLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        citiesLabel.setText("Cities");
        ImageIcon icon1 = new ImageIcon("src/com/obitko/images/dot.png");
        image1.setIcon(icon1);

        bestRouteLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bestRouteLabel.setText("The best route so far");
        ImageIcon icon2 = new ImageIcon("src/com/obitko/images/bestroute.png");
        image2.setIcon(icon2);

        ImageIcon icon3 = new ImageIcon("src/com/obitko/images/route.png");
        image3.setIcon(icon3);
        routesLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        routesLabel.setText("Possible routes");

//       Create new layout for the explanatory panel.
        javax.swing.GroupLayout explanatoryPanelLayout = new javax.swing.GroupLayout(explanatoryPanel);
        explanatoryPanel.setLayout(explanatoryPanelLayout);
        explanatoryPanelLayout.setHorizontalGroup(
                explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(explanatoryPanelLayout.createSequentialGroup()
                                .addGroup(explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(image2)
                                                .addComponent(image3))
                                        .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(routesLabel)
                                        .addComponent(bestRouteLabel)
                                        .addComponent(citiesLabel)))
        );
        explanatoryPanelLayout.setVerticalGroup(
                explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(explanatoryPanelLayout.createSequentialGroup()
                                .addGroup(explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(image1)
                                        .addComponent(citiesLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bestRouteLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(image2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(explanatoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(explanatoryPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(routesLabel))
                                        .addGroup(explanatoryPanelLayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(image3))))
        );

//      Settings for the SettingsPanel (where the user can select the algorithm's variables).
        settingsPanel.setBackground(new java.awt.Color(249, 249, 249));

//      Settings and actionListener for the first label with combo box - Number of cities.
        settingsLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18));
        settingsLabel1.setText("Number of cities");

        settingsBox1.setFont(new java.awt.Font("Segoe UI", 0, 15));
        settingsBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "12", "15", "20", "25", "30", "40", "50" }));
        settingsBox1.setSelectedItem("10");
        settingsBox1.addActionListener(e -> {
            Settings.NUM_OF_CITIES = Integer.parseInt((String) settingsBox1.getSelectedItem());
        });

//      Settings for the populationNumber, that appears instead of settingLabel after the "Select" button is pressed.
        populationNumber.setFont(new java.awt.Font("Segoe UI", 0, 15));
        populationNumber.setText("000");

//      Settings and actionListener for the second label with combo box - Population size.
        settingsLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18));
        settingsLabel2.setText("Population size");

        settingsBox2.setFont(new java.awt.Font("Segoe UI", 0, 15));
        settingsBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "8", "10", "15", "30", "40", "50" }));
        settingsBox2.setSelectedItem("10");
        settingsBox2.addActionListener(e -> {
            Settings.POPULATION_SIZE = Integer.parseInt((String) settingsBox2.getSelectedItem());
        });

//      Settings and actionListener for the third label with combo box - Number of generations.
        settingsLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18));
        settingsLabel3.setText("Number of generations");

        settingsBox3.setFont(new java.awt.Font("Segoe UI", 0, 15));
        settingsBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "30", "50", "100", "200", "300", "500", "800", "1000"}));
        settingsBox3.setSelectedItem("30");
        settingsBox3.addActionListener(e -> {
            Settings.GENERATION_LIMIT = Integer.parseInt((String) settingsBox3.getSelectedItem());
        });

//      Settings and actionListener for the fourth label with combo box - Mutation rate.
        settingsLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18));
        settingsLabel4.setText("Mutation rate");

        settingsBox4.setFont(new java.awt.Font("Segoe UI", 0, 15));
        settingsBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "2%", "3%", "5%", "6%", "8%", "10%", "50%", "100%" }));
        settingsBox4.setSelectedItem("5%");
        settingsBox4.addActionListener(e -> {
            String selectedItem = (String) settingsBox4.getSelectedItem();
            // Convert percents to double values.
            double setValue;
            switch (selectedItem){
                case "0%": setValue = 0;
                break;
                case "2%": setValue = 0.02;
                    break;
                case "3%": setValue = 0.03;
                    break;
                case "5%": setValue = 0.05;
                break;
                case "6%": setValue = 0.06;
                    break;
                case "8%": setValue = 0.08;
                    break;
                case "10%": setValue = 0.1;
                break;
                case "50%": setValue = 0.50;
                break;
                case "100%": setValue = 1;
                break;
                default: setValue = 0.05;
            }
            Settings.MUTATION_RATE = setValue;
        });

//      Settings and actionListener for the fifth label with combo box - Tournament selection.
        settingsLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18));
        settingsLabel5.setText("Tournament selection");

        settingsBox5.setFont(new java.awt.Font("Segoe UI", 0, 15));
        settingsBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        settingsBox5.setSelectedItem("4");
        settingsBox5.addActionListener(e -> {
            Settings.TOURNAMENT_SELECTION_SIZE = Integer.parseInt((String) settingsBox5.getSelectedItem());
        });
//      Settings and actionListener for the sixth label with combo box - Elite routes.
        settingsLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18));
        settingsLabel6.setText("Elite routes");

        settingsBox6.setFont(new java.awt.Font("Segoe UI", 0, 15));
        settingsBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        settingsBox6.setSelectedItem("1");
        settingsBox6.addActionListener(e -> {
            Settings.NUMB_OF_ELITE_ROUTES = Integer.parseInt((String) settingsBox6.getSelectedItem());
        });
//      Settings and actionListener for the seventh label with combo box - Animation speed.
        settingsLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18));
        settingsLabel7.setText("Animation speed");

        settingsBox7.setFont(new java.awt.Font("Segoe UI", 0, 15));
        settingsBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10%", "20%", "30%", "50%", "60%", "70%", "80%", "90%", "100%" }));
        settingsBox7.setSelectedItem("100%");
        settingsBox7.addActionListener(e -> {
            String selectedItem = (String) settingsBox7.getSelectedItem();
            // Convert percents to animation delay - the higher the speed, the lower the delay.
            // The delay shouldn't be under 20 because the animation can't be faster than the algorithm processing
            // It would just throw errors
            int setValue;
            switch (selectedItem){
                case "10%": setValue = 1000;
                    break;
                case "20%": setValue = 900;
                    break;
                case "30%": setValue = 800;
                    break;
                case "40%": setValue = 700;
                    break;
                case "50%": setValue = 500;
                    break;
                case "60%": setValue = 400;
                    break;
                case "70%": setValue = 300;
                    break;
                case "80%": setValue = 200;
                    break;
                case "90%": setValue = 100;
                    break;
                case "100%": setValue = 20;
                    break;
                default: setValue = 100;
            }
            Settings.DELAY = setValue;
        });

//      Create new layout for the settingsPanel.
        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
                settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(settingsPanelLayout.createSequentialGroup()
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(settingsPanelLayout.createSequentialGroup()
                                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(settingsLabel4)
                                                                .addComponent(settingsLabel5)
                                                                .addComponent(settingsLabel3)
                                                                .addComponent(settingsLabel2)
                                                                .addComponent(settingsLabel6))
                                                        .addComponent(settingsLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(10, 10, 10))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                                                .addComponent(settingsLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(populationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        settingsPanelLayout.setVerticalGroup(
                settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(settingsPanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(settingsBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(populationNumber)
                                        .addComponent(settingsLabel1))
                                .addGap(20, 20, 20)
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(settingsLabel2)
                                        .addComponent(settingsBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(settingsBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsLabel3))
                                .addGap(20, 20, 20)
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(settingsLabel4)
                                        .addComponent(settingsBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(settingsBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsLabel5))
                                .addGap(20, 20, 20)
                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(settingsPanelLayout.createSequentialGroup()
                                                .addComponent(settingsBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(settingsBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(settingsLabel7)))
                                        .addComponent(settingsLabel6))
                                .addGap(0, 0, 0))
        );
        copyrightLabel.setText("Copyright © 2023 Jaromir Obitko");

//      Create new layout for the right panel.
        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(divider4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(divider3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(divider2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(divider1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(titleLabel)))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(explanatoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addComponent(copyrightLabel)))
                                .addContainerGap(49, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(titleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(divider1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(divider2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(explanatoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(divider3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(divider4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(copyrightLabel)
                                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        //remove the populationNumber, because default operation is random.
        settingsPanel.remove(populationNumber);
        repaint();
        setVisible(true);
    }

// Start animation
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Stop current thread.
        panel1.gaThread.stop();
        panel1.setIsSelecting(false);
        // Start the animation (with new thread).
        panel1.startAnimation();
    }

//  Start randomCities function
    private void randomButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Stop the thread.
        panel1.gaThread.stop();
        // if the "Select" button was clicked before, remove the population number.
        if (selectButtonClicked){
            settingsPanel.remove(populationNumber);
            settingsPanel.add(settingsBox1);
            // Set the population size to default value.
            settingsBox1.setSelectedItem("10");
            Settings.POPULATION_SIZE = 10;
            selectButtonClicked = false;
            settingsPanel.repaint();
        }
        panel1.setIsSelecting(false);
        // Start randomCities method.
        panel1.randomCities();
    }

//  Start the selectCities function.
    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Stop the thread.
        panel1.gaThread.stop();
        selectButtonClicked = true;
        // Remove settings box for the population number
        settingsPanel.remove(settingsBox1);
        // Add label that display how many cities were selected.
        settingsPanel.add(populationNumber);
        settingsPanel.repaint();
        panel1.setIsSelecting(true);
        // Start selectCities method
        panel1.selectCities();
    }

//  Variables declaration

//  RightPanel and its components
    private javax.swing.JPanel rightPanel;

//  Title (Traveling salesman)
    private javax.swing.JLabel titleLabel;

//  divider lines
    private javax.swing.JSeparator divider1;
    private javax.swing.JSeparator divider2;
    private javax.swing.JSeparator divider3;
    private javax.swing.JSeparator divider4;

//  Buttons panel with start,random and select.
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton randomButton;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel copyrightLabel;

//  Explanatory panel with information about  the animation
    private javax.swing.JPanel explanatoryPanel;
    private javax.swing.JLabel bestRouteLabel;
    private javax.swing.JLabel citiesLabel;
    private javax.swing.JLabel routesLabel;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image3;

//  Panel for animation settings
    public static javax.swing.JPanel settingsPanel;
//  Population number appears when the select button is pressed.
    public static javax.swing.JLabel populationNumber;
//  Settings texts
    private javax.swing.JLabel settingsLabel1;
    private javax.swing.JLabel settingsLabel2;
    private javax.swing.JLabel settingsLabel3;
    private javax.swing.JLabel settingsLabel4;
    private javax.swing.JLabel settingsLabel5;
    private javax.swing.JLabel settingsLabel6;
    private javax.swing.JLabel settingsLabel7;
//  Settings boxes
    private javax.swing.JComboBox<String> settingsBox1;
    private javax.swing.JComboBox<String> settingsBox2;
    private javax.swing.JComboBox<String> settingsBox3;
    private javax.swing.JComboBox<String> settingsBox4;
    private javax.swing.JComboBox<String> settingsBox5;
    private javax.swing.JComboBox<String> settingsBox6;
    private javax.swing.JComboBox<String> settingsBox7;

//  Left panel and its components
    private javax.swing.JPanel leftPanel;
//  Header with fitness, generation number and best total distance values.
    private javax.swing.JPanel headerPanel;
    public static java.awt.Label fitnessLabel;
    public static java.awt.Label generationLabel;
    public static java.awt.Label totalDistanceLabel;

//  Canvas for the animation
    private AnimationPanel panel1;
//  Boolean value to record, whether the selectButton were clicked.
    private boolean selectButtonClicked = false;
}