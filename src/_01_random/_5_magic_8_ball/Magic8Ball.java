//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {
		JOptionPane.showInputDialog("What is a question for the 8 ball to answer");
		Random ran = new Random();
		int num = ran.nextInt(4);
		if(num == 0) {
			System.out.println("Yes");
		}
		else if(num == 1) {
			System.out.println("No");
		}
		else if(num == 2) {
			System.out.println("Maybe you should as Google");
		}
		else if(num == 3) {
			System.out.println("Try Again");
		}
	}
	// 2. Get the user to enter a question for the 8 ball to answer
	

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3

	
	// 4. If the random number is 0

	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

}
