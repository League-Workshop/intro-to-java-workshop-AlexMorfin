package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
int score= 0;
		// 2.  Ask the user a question 
String answer=JOptionPane.showInputDialog("Who plays Pam in the Office?");		
		// 3.  Use an if statement to check if their answer is correct
if(answer.equals("Jenna Fischer")){ JOptionPane.showMessageDialog(null,"Nice Job You Are Correct!");
}else JOptionPane.showMessageDialog(null,"Sorry, You Are Incorrect");
		// 4.  if the user's answer was correct, add one to their score 
if(answer.equals("Jenna Fischer")){ System.out.println("You have 1 point!");
}else System.out.println("You have 0 points");
}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
	
		// 6.  After all the questions have been asked, print the user's score 
	
	}


