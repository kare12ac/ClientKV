package GUI;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Calendar extends JFrame{
	public static void main (String []args){
		Calendar frameTabel = new Calendar();
	}
		JLabel welcome = new JLabel("Welcome to CBS Calendar");
		JPanel panel = new JPanel();
		JButton addCalendar = new JButton("Add Calendar");
		JButton addEvent = new JButton("Add Event");
		JButton addNote = new JButton("Add Note");
		JButton share = new JButton("Share...");
		
		Calendar(){
			super("CBS Calendar");
			setSize(1000,1000);
			setLocation(500,280);
			getContentPane().setLayout(null);
			panel.setBounds(0, 0, 1000, 978);
			panel.setLayout(null);
			welcome.setForeground(SystemColor.textHighlight);
			welcome.setFont(new Font("Apple Braille", Font.PLAIN, 28));
			
			welcome.setBounds(344,6,392,160);
			panel.add(welcome);
			
			getContentPane().add(panel);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			getContentPane().add(addCalendar);
			getContentPane().add(addEvent);
			getContentPane().add(addNote);
			getContentPane().add(share);
			
		}
	
	
}
