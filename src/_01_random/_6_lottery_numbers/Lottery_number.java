package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_number {

	public static void main(String[] args) {
		Random ran = new Random();
		// TODO Auto-generated method stub
		
		int number1 = ran.nextInt(100);
		int number2 = ran.nextInt(100);
		int number3 = ran.nextInt(100);
		int number4 = ran.nextInt(100);
		int number5 = ran.nextInt(100);
		int number6 = ran.nextInt(100);
		String lott = number1 + " "+ number2 +" "+ number3 + " "+ number4 + " " + number5 + " " + number6;
		
		JOptionPane.showMessageDialog(null, lott);
	}

}
