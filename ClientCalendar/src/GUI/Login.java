package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Login  extends JFrame{
	
	public static void main(String[]args){
		Login frameTabel = new Login();
		
	}
		JButton btnlogin = new JButton("Login");
		JPanel panel = new JPanel();
		JTextField txtUser = new JTextField(15);
		JPasswordField password = new JPasswordField(15);
		JLabel UN = new JLabel("Username");
		JLabel PW = new JLabel ("Password");
		Login(){
			super("Login Autentification");
			setSize(1000,1000);
			setLocation(500,280);
			panel.setLayout(null);
			
			
			txtUser.setBounds(440,108,150,20);
			password.setBounds(440,140,150,20);
			btnlogin.setBounds(473,195,80,20);
			UN.setBounds(255, 111, 90, 15);
			PW.setBounds(255, 135, 115, 30);
			
			
			panel.add(btnlogin);
			panel.add(txtUser);
			panel.add(password);
			panel.add(UN);
			panel.add(PW);
			
			getContentPane().add(panel);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			actionlogin();
			
		}
			public void actionlogin(){
				btnlogin.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event){
						String uname = txtUser.getText();
						String pword = password.getText();
						if(uname.equals("kare12ac")&&pword.equals("5678")){
							Calendar calendar= new Calendar();
							calendar.setVisible(true);
							dispose();
						}else{
							
							JOptionPane.showMessageDialog(null, "Wrong Password or Username");
							txtUser.setText("");
							password.setText("");
							txtUser.requestFocus();
						}
					}
				});
			}


}
