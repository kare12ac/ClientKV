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
			
			addCalendar.setBounds(300, 4, 390, 150);
			panel.add(addCalendar);
			
			addEvent.setBounds(300, 4, 390, 150);
			panel.add(addEvent);
			
			addNote.setBounds(300, 4, 390, 150);
			panel.add(addNote);
			
			share.setBounds(300, 4, 390, 150);
			panel.add(share);
			
			getContentPane().add(panel);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			

			
		}
	
	
}
