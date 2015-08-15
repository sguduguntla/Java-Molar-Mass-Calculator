import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Driver extends JFrame {
	private static final long serialVersionUID = 1L;

	static SplashScreen start = new SplashScreen();

	private static JButton startButton;
	private static JButton login;
	public static TerminalWindow window;
	public static LoginScreen screen;

	public static void main(String[] args) {
		Icon title = new ImageIcon(
				"/Users/dguduguntla/Desktop/Sriharsha/SaiJava/workspace/MolarMassCalculator/src/guititletwo.png");
		start.add(new JLabel(title), BorderLayout.NORTH);
		Icon na = new ImageIcon(
				"/Users/dguduguntla/Desktop/Sriharsha/SaiJava/workspace/MolarMassCalculator/src/na.png");
		start.add(new JLabel(na), BorderLayout.WEST);
		Icon h = new ImageIcon(
				"/Users/dguduguntla/Desktop/Sriharsha/SaiJava/workspace/MolarMassCalculator/src/h.png");
		start.add(new JLabel(h), BorderLayout.EAST);
		Icon uup = new ImageIcon(
				"/Users/dguduguntla/Desktop/Sriharsha/SaiJava/workspace/MolarMassCalculator/src/uup.png");
		start.add(new JLabel(uup), BorderLayout.SOUTH);
		Icon startPic = new ImageIcon(
				"/Users/dguduguntla/Desktop/Sriharsha/SaiJava/workspace/MolarMassCalculator/src/startbutton.png");
		startButton = new JButton(startPic);
		startButton.setOpaque(true);
		startButton.setBorderPainted(false);
		startButton.setBackground(Color.BLACK);
		startButton.setActionCommand("start");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String source = e.getActionCommand();
				if (source.equals("start")) {
					
					screen = new LoginScreen();
					screen.setSize(800,150);
					screen.setDefaultCloseOperation(EXIT_ON_CLOSE);
					screen.setVisible(true);
					screen.setResizable(true);
					login = new JButton("Login");
					login.setActionCommand("login");
					login.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (e.getActionCommand().equals("login")) {
								GUI frame = new GUI();
								frame.setVisible(true);
								frame.setSize(1200, 800);
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								frame.setResizable(false);
								frame.getContentPane().setBackground(Color.black);

								window = new TerminalWindow();
								window.setVisible(true);
								window.setSize(400, 200);
								window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								window.setResizable(false);
							}
						}
					});
					screen.add(login);
					screen.getPassword().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(e.getSource() == screen.getPassword()){
								GUI frame = new GUI();
								frame.setVisible(true);
								frame.setSize(1200, 800);
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								frame.setResizable(false);
								frame.getContentPane().setBackground(Color.black);

								window = new TerminalWindow();
								window.setVisible(true);
								window.setSize(400, 200);
								window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								window.setResizable(false);
							}
						}
					});
					start.setVisible(false);
				}
			}
		});

		start.setVisible(true);
		start.setSize(1200, 800);
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.setResizable(false);
		start.getContentPane().setBackground(Color.black);
		start.add(startButton, BorderLayout.CENTER);

	}

}