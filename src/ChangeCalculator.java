//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String ANS = JOptionPane.showInputDialog("how many nickels they have");
		// Convert their answer to an int using Integer.parseInt()
		int ANSt =  Integer.parseInt(ANS);
		// Ask the user how many dimes they have, and convert their answer
		String ANSs = JOptionPane.showInputDialog("how many dime they have");
		int ANSst =  Integer.parseInt(ANSs);
		// Ask the user how many quarters they have, and convert their answer
		String ANSa = JOptionPane.showInputDialog("how many qurter they have");
		int ANSat =  Integer.parseInt(ANSa);
		// Calculate how much money the user has and save it in a double variable 
		int QWERTY = (ANSat * 25) + (ANSst * 10) + (ANSt * 5);
		System.out.println(QWERTY);
		double QWERTYU = (double)QWERTY/100;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "you have $ " + QWERTYU );
	}
}

