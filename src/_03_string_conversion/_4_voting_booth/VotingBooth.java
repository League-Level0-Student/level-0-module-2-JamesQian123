package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int ageAsInt = Integer.parseInt(age);
		// TODO Auto-generated method stub
		if(ageAsInt >= 18) {
			JOptionPane.showInputDialog("Who do you think the next president should be?");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Nobody cares about what you think. L bozo");
		}
	}

}
