import javax.swing.JOptionPane;

public class ONWADVENTURE {
	static int wood = 0;

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "you saw a tree");
		int tree = JOptionPane.showOptionDialog(null, "do you want to chop it", "tree", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "leave it ", "chop it ", "whatever" }, null);
		if (tree == 1) {
			JOptionPane.showMessageDialog(null, "to bad, you need an ax");
		}
		JOptionPane.showMessageDialog(null, "you kept walking and you found an ax on the way");
		for (int i = 0; i <= 678575434; i++) {
			JOptionPane.showMessageDialog(null, "you saw a tree, again");
			int trees = JOptionPane.showOptionDialog(null, "do you want to chop it", "tree", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "leave it ", "chop it ", "whatever" }, null);
			if (trees == 1) {
				wood();
			} else {
				JOptionPane.showMessageDialog(null, "you kept waking");
			}
			if (wood >= 10000) {
				JOptionPane.showMessageDialog(null, "you have to much wood");
				break;
			}
		}
	}

	public static void wood() {
		wood = wood + 40;
		JOptionPane.showMessageDialog(null, "have " + wood + " wood");
	}
}
