import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGUI extends JFrame{
	
	private String username;
	private String password;
	private String IpAddress;
	
	private JTextField userText;
	private JPasswordField passwordText;
	private JTextField IpText;
	
	private JButton SignIn;
	private JButton SignUp;
	
	private JLabel userlabel;
	private JLabel passwordlabel;
	private JLabel iplabel;
	
	private Rectangle bounds;
	
	public LoginGUI(){
		super("My Drop Box");
		setLayout(new FlowLayout());
				
		username = "";
		password = "";
		IpAddress = "";
		
		//adding username
		userlabel = new JLabel("USERNAME");
		add(userlabel);
		
		userText = new JTextField(15);
		add(userText);
		
		
		//adding password field
		passwordlabel = new JLabel("PASSWORD");
		add(passwordlabel);
		
		passwordText = new JPasswordField(15);
		add(passwordText);
		
		//add IpAddress
		iplabel = new JLabel("IP ADDRESS OF SERVER");
		add(iplabel);
		
		IpText = new JTextField(10);
		add(IpText);
		
		//sign In button
		SignIn = new JButton("SIGN IN");
		add(SignIn);
		SignIn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				/*
				 * This is are for unimplemented part of sign in
				 */
				
				username = userText.getText();
				password = passwordText.getText();
				IpAddress = IpText.getText();
				System.out.println(username + "\t" + password + "\t" + IpAddress);
				
				setVisible(false);
			}
		});

		
		//SignUp button 
		SignUp = new JButton("SIGN UP");
		add(SignUp);
		SignUp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				/*
				 * This is are for unimplemented part of sign in
				 */
				
				username = userText.getText();
				password = passwordText.getText();
				IpAddress = IpText.getText();
				System.out.println(username + "\t" + password + "\t" + IpAddress);
				
				setVisible(false);				
			}
		});
		
		
		//Customisations of frame
		bounds = new Rectangle(300,200);
		setMaximizedBounds(bounds);
		setVisible(true);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}