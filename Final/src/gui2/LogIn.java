package gui2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LogIn extends JFrame {
	
	private JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTextField TFUser;
	private JPasswordField PFPswd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//native system look implemented
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogIn() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		//If user cancels log in, the window closes
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(429, 251, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Registration");
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			//Opens registration page
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Registration acctCreate = new Registration();
				acctCreate.open();
				
			}

		});
		btnNewButton_2.setBounds(276, 251, 99, 23);
		contentPane.add(btnNewButton_2);
		
		TFUser = new JTextField();
		TFUser.setBounds(180, 84, 279, 37);
		contentPane.add(TFUser);
		TFUser.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Gautami", Font.BOLD, 16));
		lblUsername.setBounds(63, 89, 81, 26);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Gautami", Font.BOLD, 16));
		lblPassword.setBounds(63, 172, 81, 26);
		contentPane.add(lblPassword);
		
		PFPswd = new JPasswordField();
		PFPswd.setBounds(180, 161, 279, 37);
		contentPane.add(PFPswd);
		
		JLabel lblAtlasAirlines = new JLabel("Atlas Airlines");
		lblAtlasAirlines.setVerticalAlignment(SwingConstants.TOP);
		lblAtlasAirlines.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAtlasAirlines.setHorizontalAlignment(SwingConstants.CENTER);
		lblAtlasAirlines.setFont(new Font("Gautami", Font.BOLD, 24));
		lblAtlasAirlines.setBounds(204, 35, 209, 38);
		contentPane.add(lblAtlasAirlines);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(TFUser.getText().equals("test") && PFPswd.getText().equals("works"))
				{
					JOptionPane.showMessageDialog(null, "Login Successful");
					MainMenu leMain = new MainMenu();
					dispose();
					leMain.open();
					
				} else
				{
					JOptionPane.showMessageDialog(null, "Invalid Credentials. Please Try Again...");
				}
			}
		});
		btnNewButton.setBounds(132, 251, 89, 23);
		contentPane.add(btnNewButton);
		
	}
}
