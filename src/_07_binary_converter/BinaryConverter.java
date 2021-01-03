package _07_binary_converter;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BinaryConverter implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	String text;
	JTextField answer = new JTextField(20);
	JLabel output = new JLabel();
	
	public void showButton() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.add(answer);
		JButton button = new JButton("convert");
		panel.add(button);
		frame.add(panel);
		frame.pack();
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.pack();
		frame.repaint();
	}
	

String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    	}
	}

}

