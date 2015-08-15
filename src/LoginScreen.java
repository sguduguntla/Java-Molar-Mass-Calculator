import javax.swing.*;

import java.awt.*;

public class LoginScreen extends JFrame{

	private static final long serialVersionUID = 1L;

	private JTextField username;

	private JPasswordField password;

	public LoginScreen() {

		super("Login Screen");

		setVisible(true);

		setLayout(new FlowLayout());

		for (int i = 0; i < 45; i++) {

			add(new JLabel());

		}

		JLabel title = new JLabel("WELCOME TO THE MOLAR MASS CALCULATOR!");

		add(title);

		for (int i = 0; i < 146; i++) {

			add(new JLabel());

		}

		JLabel userText = new JLabel("Username: ");

		add(userText);

		username = new JTextField(15);

		add(username);

		for (int i = 0; i < 150; i++) {

			add(new JLabel());

		}

		JLabel passwordText = new JLabel("Password: ");

		add(passwordText);

		password = new JPasswordField(15);

		add(password);

		for (int i = 0; i < 102; i++) {

			add(new JLabel());

		}

	}
	
	public String getUserName(){
		return username.getText();
				
	}
	
	public JPasswordField getPassword(){
		return password;
	}

}
