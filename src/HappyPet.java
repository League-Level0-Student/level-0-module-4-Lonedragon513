import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String J = JOptionPane.showInputDialog("what pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int qwryt = 0; qwryt < 123456789; qwryt++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "what to do", "hi", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "food", "water", "walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				food();
			} else if (task == 1) {
				water();
			} else if (task == 2) {
				walk();
			}

			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
			if (happinessLevel >= 400) {
				JOptionPane.showMessageDialog(null, "your " + J + " is happy");
				break;
			}
		}
	}
	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	public static void food() {
		JOptionPane.showMessageDialog(null, "MARFFFFFFF");

		happinessLevel = happinessLevel + 29;
		System.out.println(happinessLevel);

	}

	public static void walk() {
		JOptionPane.showMessageDialog(null, "woof");

		happinessLevel = happinessLevel + 54;
		System.out.println(happinessLevel);
	}

	public static void water() {
		JOptionPane.showMessageDialog(null, "wang wang");

		happinessLevel = happinessLevel + 11;
		System.out.println(happinessLevel);
	}
}