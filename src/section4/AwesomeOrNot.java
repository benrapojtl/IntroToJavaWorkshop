package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int shark=new Random().nextInt(4);
	// 3. Print out this variable
	System.out.println(shark);
	// 4. Get the user to enter something that they think is awesome
JOptionPane.showInputDialog("Say something you think is awsome");
	// 5. If the random number is 0
if(shark==0) {
	JOptionPane.showInputDialog("awsome");
}
	// 6. If the random number is 1
if(shark==1) {
	JOptionPane.showInputDialog("ok");
}
	// 7. If the random number is 2
if(shark==2) {
	JOptionPane.showInputDialog("boring");
}
	// 8. If the random number is 3
if(shark==3) {
	JOptionPane.showInputDialog("radical");
}
	// -- write your own answer
	}
}


