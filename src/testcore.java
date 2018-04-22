import javax.swing.JOptionPane;

public class testcore {
	public static void main(String[] args) {
		String S = JOptionPane.showInputDialog("what is your test score");
		Double Q = Double.parseDouble(S);
		if (Q == 100) {
			JOptionPane.showMessageDialog(null, "good job");
		} else if (Q >= 70) {
			JOptionPane.showMessageDialog(null, "you did good");

		} else if (Q <= 70) {
			JOptionPane.showMessageDialog(null, "you need to study");

		}
	}

}
