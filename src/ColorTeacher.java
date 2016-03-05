import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();
	ColorTeacher () {
		JFrame window = new JFrame("Color Teacher");
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.add(yellow);
		panel.add(red);
		panel.add(blue);
		panel.add(green);
		window.add(panel);
		panel.setLayout(null);
		window.setSize(400, 100);
		makeButtonWork(yellow);
		yellow.setBounds(0,0,100,50);
		yellow.setBackground(Color.YELLOW);
		makeButtonWork(red);
		red.setBounds(100,0,100,50);
		red.setBackground(Color.RED);
		makeButtonWork(blue);
		blue.setBounds(200,0,100,50);
		blue.setBackground(Color.BLUE);
		makeButtonWork(green);
		green.setBounds(300,0,100,50);
		green.setBackground(Color.GREEN);
	}
	public static void main (String [] args) {
		new ColorTeacher();
	}
	
	void makeButtonWork (JButton button) {
		button.addActionListener(this);
		button.setOpaque(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(yellow)) {
			speak("yellow");
		}
		else if (e.getSource().equals(red)) {
			speak("red");
		}
		else if (e.getSource().equals(blue)) {
			speak("blue");
		}
		else if (e.getSource().equals(green)) {
			speak("green");
		}
	}
	
	void speak (String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
