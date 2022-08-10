//Method used: "Swing"
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
//Imports tools from the "Swing" library

import java.awt.BorderLayout;
import java.awt.GridLayout;
//Imports the layouts

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Imports the action-related tools
import java.util.Random;


public class SupercarStatsGUI implements ActionListener {
	
	public static void printS(String s) {
		System.out.println(s);
	}// Prints a string

	int[] topSpeeds = {319, 320, 325, 325, 329, 330, 335, 340, 348, 350, 351, 354, 355, 400, 403, 407, 439, 447, 483, 560};
	
	//Assigns keywords to these methods and makes them private (not viewable by the user)
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button10;
	private JButton button11;
	private JButton button12;
	private JButton button13;
	private JButton button14;
	private JButton button15;
	private JButton button16;
	private JButton button17;
	private JButton button18;
	private JButton button19;
	private JButton button20;
	private JButton button21;
	private JButton button22;
	private JButton button23;
	private JButton button24;
	private JButton button25;
	private JButton button26;
	private JButton button27;
	
	
	public SupercarStatsGUI() {
		
		frame = new JFrame();
		//Creates an object for the frame of the GUI
		panel = new JPanel();
		//Creates an object for the interactive panel for the GUI
		label = new JLabel("Select a button to begin.");
		//Creates an object for the label
		
		//Button Setup
		button1 = new JButton("Highest RPM");
		button2 = new JButton("Lowest RPM");
		button3 = new JButton("Highest HP");
		button4 = new JButton("Lowest HP");
		button5 = new JButton("Fastest");
		button6 = new JButton("Fastest Acceleration");
		button7 = new JButton("Random");
		button8 = new JButton("Chevrolet Camaro ZL1");
		button9 = new JButton("Lamborghini Asterion");
		button10 = new JButton("Lamborghini Huracan");
		button11 = new JButton("Lamborghini Terzo Millenio");
		button12 = new JButton("McLaren 12C Spider");
		button13 = new JButton("Nissan GT-R Nismo");
		button14 = new JButton("McLaren Senna");
		button15 = new JButton("Porsche 918 Spyder");
		button16 = new JButton("Ford GT");
		button17 = new JButton("Lamborghini Sián FKP 37");
		button18 = new JButton("Lamborghini Aventador");
		button19 = new JButton("Aston Martin One-77");
		button20 = new JButton("Lamborghini Veneno");
		button21 = new JButton("Bugatti Veyron");
		button22 = new JButton("McLaren Speedtail");
		button23 = new JButton("Koenigsegg Gemera");
		button24 = new JButton("Bugatti Chiron Super Sport");
		button25 = new JButton("Koenigsegg Agera RS");
		button26 = new JButton("Koenigsegg Jesko");
		button27 = new JButton("Devel 16");
		//Creates objects for the buttons;
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		button13.addActionListener(this);
		button14.addActionListener(this);
		button15.addActionListener(this);
		button16.addActionListener(this);
		button17.addActionListener(this);
		button18.addActionListener(this);
		button19.addActionListener(this);
		button20.addActionListener(this);
		button21.addActionListener(this);
		button22.addActionListener(this);
		button23.addActionListener(this);
		button24.addActionListener(this);
		button25.addActionListener(this);
		button26.addActionListener(this);
		button27.addActionListener(this);
		//Tells the buttons to listen for an action (in this case, a click)
		
		//Panel Setup
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		//Sets the GUI border(measured in pixels); top, bottom, left, right
		panel.setLayout(new GridLayout(3, 2));
		//Sets the layout to a grid layout; rows, columns
		panel.add(label);
		//Adds a label to the panel

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		panel.add(button16);
		panel.add(button17);
		panel.add(button18);
		panel.add(button19);
		panel.add(button20);
		panel.add(button21);
		panel.add(button22);
		panel.add(button23);
		panel.add(button24);
		panel.add(button25);
		panel.add(button26);
		panel.add(button27);
		//Adds the buttons to the panel
		
		//Regular frame setup commands
		frame.add(panel, BorderLayout.CENTER);
		//Sets the constraints according to the center of the border layout
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Sets the default close operation to exit upon closing the GUI
		frame.setTitle("My GUI");
		//Sets the title of the GUI
		frame.pack();
		frame.setVisible(true);
		//Sets the visibility of the GUI
	
	}
	
	
	public static void main(String[] args) {
		new SupercarStatsGUI();
		//Calls the SupercarStatsGUI constructor
	}


	@Override
	public void actionPerformed(ActionEvent e) /*Defines the response to the action performed*/ {
		label.setText("Select a button to begin.");
		//Sets the label to display "Select a button to begin."
				
		if (e.getSource() == button1) {			
			printS("\nPorsche 918 Spyder:" + "\n\nTop Speed: " + topSpeeds[7] + "km/h" + "\nAcceleration Speed: 2.3 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 8700" + "\nHorsePower: 887" + "\nMileage: 695km/Fully Charged Battery and Full Gas Tank (10L/100km of gas and 31kwh/100km)" + "\nDefining Features: Side Exhausts, Optional Convertible, Sleek Design");							
		} else if (e.getSource() == button2) {			
			printS("\nChevrolet Camaro ZL1:" + "\n\nTop Speed: " + topSpeeds[0] + "km/h" + "\nAcceleration Speed: 3.6 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6400" + "\nHorsePower: 650" + "\nMileage: 15L/100km" + "\nDefining Features: Powerful Engine, Strong, Stylish and Iconic Design");
		} else if (e.getSource() == button3) {			
			printS("\nDevel 16: " + "\n\nTop Speed: " + topSpeeds[19] + "km/h" + "\nAcceleration Speed: 2 seconds to 100 km/h" + "\nEngine Type: V16" + "\nRPM: 6900" + "\nHorsePower: 5000" + "\nMileage: Unknown" + "\nDefining Features: Futuristic, Sleek and Low Design, Lamborghini Veneno-like Front, 2 Large Rocket-Like Exhausts");
		} else if (e.getSource() == button4) {	
			printS("\nMcLaren 12C Spider:" + "\n\nTop Speed: " + topSpeeds[4] + "km/h" + "\nAcceleration Speed: 3.1 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 7000" + "\nHorsePower: 616" + "\nMileage: 21L/100km" + "\nDefining Features: Rocket-Like Engines, Sleek Exterior");							
		} else if (e.getSource() == button5) {			
			printS("\nDevel 16: " + "\n\nTop Speed: " + topSpeeds[19] + "km/h" + "\nAcceleration Speed: 2 seconds to 100 km/h" + "\nEngine Type: V16" + "\nRPM: 6900" + "\nHorsePower: 5000" + "\nMileage: Unknown" + "\nDefining Features: Futuristic, Sleek and Low Design, Lamborghini Veneno-like Front, 2 Large Rocket-Like Exhausts");
		} else if (e.getSource() == button6) {			
			printS("\nKoenigsegg Gemera:" + "\n\nTop Speed:" + topSpeeds[13] + "km/h" + "\nAcceleration Speed: 1.9 seconds to 100km/h" + "\nEngine Type: TFG(3-Cylinder Engine)" + "\nRPM: 8500" + "\nHorsePower: 1700" + "\nMileage: 13/L and 50km/full battery" + "Defining Features: Sleek, Exotic Look, Extremely Powerful Engine, Dual Oval-Shaped, Angled (Outward) Exhausts at Rear Windshield Area");
		} else if (e.getSource() == button7) {
			
			int[] carNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
			Random randomNum = new Random();
			int randomCarNum = randomNum.nextInt(carNum.length);			
			
			switch (randomCarNum) {
			
				case 1:
					printS("\nChevrolet Camaro ZL1:" + "\n\nTop Speed: " + topSpeeds[0] + "km/h" + "\nAcceleration Speed: 3.6 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6400" + "\nHorsePower: 650" + "\nMileage: 15L/100km" + "\nDefining Features: Powerful Engine, Strong, Stylish and Iconic Design");
					break;
					
				case 2:
					printS("\nLamborghini Asterion:" + "\n\nTop Speed: " + topSpeeds[1] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V10" + "\nRPM: 8250" + "\nHorsePower: 897" + "\nMileage: 4L/100km, 50km/Fully Charged Battery" + "\nDefining Features: Bulky, Sleek and Subtle Design, Powerful Engine, Hexagonal Dual Twin Exhausts");
					break;
					
				case 3:
					printS("\nLamborghini Huracan:" + "\n\nTop Speed: " + topSpeeds[2] + "km/h" + "\nAcceleration Speed: 2.9 seconds to 100km/h" + "\nEngine Type: V10" + "\nRPM: 8000" + "\nHorsePower: 630" + "\nMileage: 15L/100km" + "\nDefining Features: Optional Convertible, Sleek and Stylish Design, Exhausts on Sides of License Plate");
					break;
					
				case 4:
					printS("\nLamborghini Terzo Millenio:" + "\n\nTop Speed: " + topSpeeds[3] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8000" + "\nHorsePower: 630" + "\nMileage: 350km/Fully Charged Battery" + "\nDefining Features: Self-Driving on Race Tracks, Separate Engines on Each Wheel, Futuristic Design, Can Fix Itself If It Is Damaged");
					break;
			
				case 5:
					printS("\nMcLaren 12C Spider:" + "\n\nTop Speed: " + topSpeeds[4] + "km/h" + "\nAcceleration Speed: 3.1 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 7000" + "\nHorsePower: 616" + "\nMileage: 21L/100km" + "\nDefining Features: Rocket-Like Engines, Sleek Exterior");
					break;
					
				case 6:
					printS("\nNissan GT-R Nismo:" + "\n\nTop Speed: " + topSpeeds[5] + "km/h" + "\nAcceleration Speed: 2.6 seconds to 100km/h" + "\nEngine Type: V6" + "\nRPM: 6800" + "\nHorsePower: 600" + "\nMileage: 13L/100km" + "\nDefining Features: Powerful Engine, Dual Twin Exhausts, Signature GT-R Circular Taillights, Bulky, Tough, Compact Design");												
				
				case 7:
					printS("\nMcLaren Senna:" + "\n\nTop Speed: " + topSpeeds[6] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 7250" + "\nHorsePower: 789" + "\nMileage: 15L/100km" + "\nDefining Features: Sleek, Streamlined Design, Powerful Engine, Linear Taillights, 2 \'Pockets\' on Front Bumper, Tri-Exhausts at Top Rear");
					break;
					
				case 8:
					printS("\nPorsche 918 Spyder:" + "\n\nTop Speed: " + topSpeeds[7] + "km/h" + "\nAcceleration Speed: 2.3 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 8700" + "\nHorsePower: 887" + "\nMileage: 695km/Fully Charged Battery and Full Gas Tank (10L/100km of gas and 31kwh/100km)" + "\nDefining Features: Side Exhausts, Optional Convertible, Sleek Design");
					break;

				case 9:
					printS("\nFord GT" + "\n\nTop Speed: " + topSpeeds[8] + "km/h" + "\nAcceleration Speed: 3.1 seconds to 100km/h" + "\nEngine Type: V6" + "\nRPM: 6500" + "\nHorsePower: 660" + "\nMileage: 17L/100km" + "\nDefining Features: Sleek and Strong Design, Circular Taillights, 2 Small Rocket-Like Exhausts");
					break;
				
				case 10:
					printS("\nLamborghini Sián FKP 37" + "\n\nTop Speed: " + topSpeeds[9] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8500" + "\nHorsePower: 774" + "\nMileage: 2800L/100km's Equivalent of Battery and Gas Usage (Hybrid)" + "\nDefining Features: Strong, Sleek and Racecar-Like Design, Unique Headlight and Taillight Design, 2 Large Flipped, Pentagonal Exhausts");
					break;

				case 11:
					printS("\nLamborghini Aventador:" + "\n\nTop Speed: " + topSpeeds[10] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8500" + "\nHorsePower: 759" + "\nMileage: 20L/100km" + "\nDefining Features: Single, Wide Rear Exhaust, Sleek and Stylish Design");
					break;
			
				case 12:
					printS("\nAston Martin One-77:" + "\n\nTop Speed: " + topSpeeds[11] + "km/h" + "\nAcceleration Speed: 3.6 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 6500" + "\nHorsePower: 750" + "\nMileage: 17L/100km" + "\nDefining Features: Sleek and Compact Design");
					break;

				case 13:
					printS("\nLamborghini Veneno:" + "\n\nTop Speed: " + topSpeeds[12] + "km/h" + "\nAcceleration Speed: 2.9 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8400" + "HorsePower: 750" + "\nMileage: 18L/100km" + "\nDefining Features: Sharp, Spiky Front, Futuristic and Strong Design, Tough, Solid and Sleek Exterior");
					break;

				case 14:
					printS("\nKoenigsegg Gemera:" + "\n\nTop Speed:" + topSpeeds[13] + "km/h" + "\nAcceleration Speed: 1.9 seconds to 100km/h" + "\nEngine Type: TFG(3-Cylinder Engine)" + "\nRPM: 8500" + "\nHorsePower: 1700" + "\nMileage: 6L/100km and 50km/full battery" + "Defining Features: Sleek, Exotic Look, Extremely Powerful Engine, Dual Oval-Shaped, Angled (Outward) Exhausts at Rear Windshield Area");
					break;
	
				case 15:
					printS("\nMcLaren Speedtail:" + "\n\nTop Speed:" + topSpeeds[14] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6500" + "\nHorsePower: 747" + "\nMileage: 16L/100km" + "\nDefining Features: Aerodynamic, Sleek, Wide, Futuristic look, Powerful Engine, Dual Hidden Circular Exhausts, Linear Taillight From Rear to Roof, Digital Rearview Cameras Replacing Sideview Mirrors");
					break;
					
				case 16:
					printS("\nBugatti Veyron:" + "\n\nTop Speed: " + topSpeeds[15] + "km/h" + "\nAcceleration Speed: 2.5 seconds to 100km/h" + "\nEngine Type: W16 (Equal to 2 V8 engines combined)" + "\nRPM: 6400" + "\nHorsePower: 1184" + "\nMileage: 25L/100km" + "\nDefining Features: Bulky Design, Extremely Powerful Engine, Single Large Exhaust, Circular Taillights");
					break;
					
				case 17:
					printS("\nBugatti Chiron Super Sport" + "\n\nTop Speed: " + topSpeeds[16] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: W16" + "\nRPM: 7100" + "\nHorsePower: 1577" + "\nMileage: Unknown" + "\nDefining Features: Wide, Low and Sleek Design, Extremely Powerful Engine, Quickly Burns Through Gas, 2 Large Exhausts, Single Line Taillight");
					break;
			
				case 18:
					printS("\nKoenigsegg Agera RS" + "\n\nTop Speed: " + topSpeeds[17] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6900" + "\n949" + "\nMileage: 12.5L/100km" + "\nDefining Features: Sleek and Low Design, Very Innovative V8 Engine, Single, Large, Flipped Trapezoid-Shaped Exhaust");
					break;

				case 19:
					printS("\nKoenigsegg Jesko:" + "\n\nTop Speed: " + topSpeeds[18] + "km/h" + "\nAcceleration Speed: 2.6 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 8500" + "\nHorsePower: 1280" + "\nMileage: Unknown" + "\nDefining Features: Sleek, Futuristic Design, Very Innovative V8 Engine, Wide and Low Body, Single, Wide Rocket-Like Exhaust");
					break;
			
				case 20:
					printS("\nDevel 16: " + "\n\nTop Speed: " + topSpeeds[19] + "km/h" + "\nAcceleration Speed: 2 seconds to 100 km/h" + "\nEngine Type: V16" + "\nRPM: 6900" + "\nHorsePower: 5000" + "\nMileage: Unknown" + "\nDefining Features: Futuristic, Sleek and Low Design, Lamborghini Veneno-like Front, 2 Large Rocket-Like Exhausts");
					break;
			}
		} else if (e.getSource() == button8) {			
			printS("\nChevrolet Camaro ZL1:" + "\n\nTop Speed: " + topSpeeds[0] + "km/h" + "\nAcceleration Speed: 3.6 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6400" + "\nHorsePower: 650" + "\nMileage: 15L/100km" + "\nDefining Features: Powerful Engine, Strong, Stylish and Iconic Design");
		} else if (e.getSource() == button9) {
			printS("\nLamborghini Asterion:" + "\n\nTop Speed: " + topSpeeds[1] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V10" + "\nRPM: 8250" + "\nHorsePower: 897" + "\nMileage: 4L/100km, 50km/Fully Charged Battery" + "\nDefining Features: Bulky, Sleek and Subtle Design, Powerful Engine, Hexagonal Dual Twin Exhausts");
		} else if (e.getSource() == button10) {
			printS("\nLamborghini Huracan:" + "\n\nTop Speed: " + topSpeeds[2] + "km/h" + "\nAcceleration Speed: 2.9 seconds to 100km/h" + "\nEngine Type: V10" + "\nRPM: 8000" + "\nHorsePower: 630" + "\nMileage: 15L/100km" + "\nDefining Features: Optional Convertible, Sleek and Stylish Design, Exhausts on Sides of License Plate");
		} else if (e.getSource() == button11) {
			printS("\nLamborghini Terzo Millenio:" + "\n\nTop Speed: " + topSpeeds[3] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8000" + "\nHorsePower: 630" + "\nMileage: 350km/Fully Charged Battery" + "\nDefining Features: Self-Driving on Race Tracks, Separate Engines on Each Wheel, Futuristic Design, Can Fix Itself If It Is Damaged");
		} else if (e.getSource() == button12) {
			printS("\nMcLaren 12C Spider:" + "\n\nTop Speed: " + topSpeeds[4] + "km/h" + "\nAcceleration Speed: 3.1 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 7000" + "\nHorsePower: 616" + "\nMileage: 21L/100km" + "\nDefining Features: Rocket-Like Engines, Sleek Exterior");
		} else if (e.getSource() == button13) {
			printS("\nNissan GT-R Nismo:" + "\n\nTop Speed: " + topSpeeds[5] + "km/h" + "\nAcceleration Speed: 2.6 seconds to 100km/h" + "\nEngine Type: V6" + "\nRPM: 6800" + "\nHorsePower: 600" + "\nMileage: 13L/100km" + "\nDefining Features: Powerful Engine, Dual Twin Exhausts, Signature GT-R Circular Taillights, Bulky, Tough, Compact Design");							
		} else if (e.getSource() == button14) {
			printS("\nMcLaren Senna:" + "\n\nTop Speed: " + topSpeeds[6] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 7250" + "\nHorsePower: 789" + "\nMileage: 15L/100km" + "\nDefining Features: Sleek, Streamlined Design, Powerful Engine, Linear Taillights, 2 \'Pockets\' on Front Bumper, Tri-Exhausts at Top Rear");
		} else if (e.getSource() == button15) {
			printS("\nPorsche 918 Spyder:" + "\n\nTop Speed: " + topSpeeds[7] + "km/h" + "\nAcceleration Speed: 2.3 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 8700" + "\nHorsePower: 887" + "\nMileage: 695km/Fully Charged Battery and Full Gas Tank (10L/100km of gas and 31kwh/100km)" + "\nDefining Features: Side Exhausts, Optional Convertible, Sleek Design");
		} else if (e.getSource() == button16) {
			printS("\nFord GT" + "\n\nTop Speed: " + topSpeeds[8] + "km/h" + "\nAcceleration Speed: 3.1 seconds to 100km/h" + "\nEngine Type: V6" + "\nRPM: 6500" + "\nHorsePower: 660" + "\nMileage: 17L/100km" + "\nDefining Features: Sleek and Strong Design, Circular Taillights, 2 Small Rocket-Like Exhausts");
		} else if (e.getSource() == button17) {
			printS("\nLamborghini Sián FKP 37" + "\n\nTop Speed: " + topSpeeds[9] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8500" + "\nHorsePower: 774" + "\nMileage: 2800L/100km's Equivalent of Battery and Gas Usage (Hybrid)" + "\nDefining Features: Strong, Sleek and Racecar-Like Design, Unique Headlight and Taillight Design, 2 Large Flipped, Pentagonal Exhausts");
		} else if (e.getSource() == button18) {
			printS("\nLamborghini Aventador:" + "\n\nTop Speed: " + topSpeeds[10] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8500" + "\nHorsePower: 759" + "\nMileage: 20L/100km" + "\nDefining Features: Single, Wide Rear Exhaust, Sleek and Stylish Design");
		} else if (e.getSource() == button19) {
			printS("\nAston Martin One-77:" + "\n\nTop Speed: " + topSpeeds[11] + "km/h" + "\nAcceleration Speed: 3.6 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 6500" + "\nHorsePower: 750" + "\nMileage: 17L/100km" + "\nDefining Features: Sleek and Compact Design");
		} else if (e.getSource() == button20) {
			printS("\nLamborghini Veneno:" + "\n\nTop Speed: " + topSpeeds[12] + "km/h" + "\nAcceleration Speed: 2.9 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8400" + "\nHorsePower: 750" + "\nMileage: 18L/100km" + "\nDefining Features: Sharp, Spiky Front, Futuristic and Strong Design, Tough, Solid and Sleek Exterior");
		} else if (e.getSource() == button21) {
			printS("\nKoenigsegg Gemera:" + "\n\nTop Speed:" + topSpeeds[13] + "km/h" + "\nAcceleration Speed: 1.9 seconds to 100km/h" + "\nEngine Type: TFG(3-Cylinder Engine)" + "\nRPM: 8500" + "\nHorsePower: 1700" + "\nMileage: 13/L and 50km/full battery" + "Defining Features: Sleek, Exotic Look, Extremely Powerful Engine, Dual Oval-Shaped, Angled (Outward) Exhausts at Rear Windshield Area");
		} else if (e.getSource() == button22) {			
			printS("\nMcLaren Speedtail:" + "\n\nTop Speed:" + topSpeeds[14] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6500" + "\nHorsePower: 747" + "\nMileage: 16L/100km" + "\nDefining Features: Aerodynamic, Sleek, Wide, Futuristic look, Powerful Engine, Dual Hidden Circular Exhausts, Linear Taillight From Rear to Roof, Digital Rearview Cameras Replacing Sideview Mirrors");
		} else if (e.getSource() == button23) {
			printS("\nBugatti Veyron:" + "\n\nTop Speed: " + topSpeeds[15] + "km/h" + "\nAcceleration Speed: 2.5 seconds to 100km/h" + "\nEngine Type: W16 (Equal to 2 V8 engines combined)" + "\nRPM: 6400" + "\nHorsePower: 1184" + "\nMileage: 25L/100km" + "\nDefining Features: Bulky Design, Extremely Powerful Engine, Single Large Exhaust, Circular Taillights");
		} else if (e.getSource() == button24) {
			printS("\nBugatti Chiron Super Sport" + "\n\nTop Speed: " + topSpeeds[16] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: W16" + "\nRPM: 7100" + "\nHorsePower: 1577" + "\nMileage: Unknown" + "\nDefining Features: Wide, Low and Sleek Design, Extremely Powerful Engine, Quickly Burns Through Gas, 2 Large Exhausts, Single Line Taillight");
		} else if (e.getSource() == button25) {
			printS("\nKoenigsegg Agera RS" + "\n\nTop Speed: " + topSpeeds[17] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6900" + "\n949" + "\nMileage: 12.5L/100km" + "\nDefining Features: Sleek and Low Design, Very Innovative V8 Engine, Single, Large, Flipped Trapezoid-Shaped Exhaust");
		} else if (e.getSource() == button26) {
			printS("\nKoenigsegg Jesko:" + "\n\nTop Speed: " + topSpeeds[18] + "km/h" + "\nAcceleration Speed: 2.6 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 8500" + "\nHorsePower: 1280" + "\nMileage: Unknown" + "\nDefining Features: Sleek, Futuristic Design, Very Innovative V8 Engine, Wide and Low Body, Single, Wide Rocket-Like Exhaust");
		} else if (e.getSource() == button27) {
			printS("\nDevel 16: " + "\n\nTop Speed: " + topSpeeds[19] + "km/h" + "\nAcceleration Speed: 2 seconds to 100 km/h" + "\nEngine Type: V16" + "\nRPM: 6900" + "\nHorsePower: 5000" + "\nMileage: Unknown" + "\nDefining Features: Futuristic, Sleek and Low Design, Lamborghini Veneno-like Front, 2 Large Rocket-Like Exhausts");			
		}
	}
}
