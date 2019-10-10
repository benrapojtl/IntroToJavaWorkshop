package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String input=JOptionPane.showInputDialog("Answer this Question");
		JOptionPane.showMessageDialog(null, "How many states are there in america");
		JOptionPane.showInputDialog("");
		
			
		
		// 3.  Use an if statement to check if their answer is correct
		if(input.equalsIgnoreCase("50")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score=score+1;
	}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String Input=JOptionPane.showInputDialog("Answer this Question");
		JOptionPane.showMessageDialog(null, "What is a toddlers age to be a toddler");
		JOptionPane.showInputDialog("");
		if(input.equalsIgnoreCase("2")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score=score+1;
		}
		String ball=JOptionPane.showInputDialog("Answer this Question");
		JOptionPane.showMessageDialog(null, "How many inches are in a foot");
		JOptionPane.showInputDialog("");
		if(ball.equalsIgnoreCase("12")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score=score+1;
		}
	
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, score);
	}
}
