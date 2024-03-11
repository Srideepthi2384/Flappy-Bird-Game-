package FlappyBirdGame;

import javax.swing.JFrame;

public class MainBird {
	
	public MainBird() {
		 JFrame window = new JFrame("Graphics");
		  window.setSize(600, 800);
		  window.setLocationRelativeTo(null);
		  window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		  window.setVisible(true);
		  window.setTitle("FlappyBird");
		  window.setResizable(false);
	}

	public static void main(String[] args) {
		MainBird mb = new MainBird();

	}

}
