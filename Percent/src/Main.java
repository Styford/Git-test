import javax.swing.JFrame;


public class Main {
	
	public static void main(String[] args) {
		Reader r = new Reader("Styford");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(200, 300);
		r.setResizable(false);
		r.setLocationRelativeTo(null);

	}

}
