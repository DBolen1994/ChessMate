package Board;

import java.awt.Color;
import javax.swing.JFrame;

public class BoardGUI {

	public static void main(String[] args) {

		// creates new JFrame
		JFrame frame = new JFrame();
		// sets the size of the GUI
		frame.setSize(600, 600);
		// creates title for GUI
		frame.setTitle("ChessMate");
		// gets information from Board class
		frame.getContentPane().add(new Board());
		// sets background color
		frame.setBackground(Color.GRAY);
		// defines what is done when closed
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// makes GUI visible
		frame.setVisible(true);
	}
}
