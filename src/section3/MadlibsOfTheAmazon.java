package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		// Get the user to enter an adjective
String adjective=JOptionPane.showInputDialog("Choose An Adjective");
		// Get the user to enter a type of liquid
String typeofliquid=JOptionPane.showInputDialog("Choose A Type Of Liquid");
		// Get the user to enter a body part
String bodypart=JOptionPane.showInputDialog("Choose A Body Part");
		// Get the user to enter a verb
String verb=JOptionPane.showInputDialog("Choose A Verb");
		// Get the user to enter a place
String place=JOptionPane.showInputDialog("Choose A Place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, "Piranhas are more "+adjective+" during the day, so cross the river at \n night. Piranhas are attracted to fresh "+typeofliquid+" and will most \n likely take a bite out of your "+bodypart+" if you "+verb+". Whatever \n you do, if you have an open wound, try to find another way to get \n back to the "+place+". Good Luck! ");

	}
}

