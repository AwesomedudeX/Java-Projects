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

public class ClickCounter implements ActionListener {
	
	int count = 1;
	//Creates the variable "count", and assigns it the value 1.
	
	//Assigns keywords to these methods and makes them private (not viewable by the user)
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public ClickCounter() {
		
		frame = new JFrame();
		//Creates an object for the frame of the GUI
		panel = new JPanel();
		//Creates an object for the interactive panel for the GUI
		label = new JLabel("Clicks: 0");
		//Creates an object for the label
		
		//Button Setup
		button = new JButton("Click me");
		//Creates objects for the button;
		button.addActionListener(this);
		//Tells the button to listen for an action (in this case, a click)
		
		//Panel Setup
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		//Sets the GUI border(measured in pixels); top, bottom, left, right
		panel.setLayout(new GridLayout(3, 2));
		//Sets the layout to a grid layout; rows, columns
		panel.add(label);
		//Adds a label to the panel
		panel.add(button);
		//Adds the button to the panel
		
		//Regular setup commands
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
		new ClickCounter();
		//Calls the ClickCounter constructor
	}


	public void actionPerformed(ActionEvent e) /*Defines the response to the action performed*/ {
		label.setText("Clicks: " + count);
		//Sets the label to display "Number of clicks:", and the value of the "count" variable
		count++;
		//Increases the value of the "count" variable
			
			
		}

}

