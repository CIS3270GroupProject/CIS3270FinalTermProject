package gui2;

import java.awt.BorderLayout;
import java.util.Scanner;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;

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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogIn extends JFrame {
	
	private JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTextField tfUser;
	private JPasswordField pfPswd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		
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
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
		});
	}	
	
	public void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn Frame = new LogIn();
					frame.setVisible(true);
				}
				catch (Exception e){
					e.printStackTrace();
				}
			}
			});
		}
//	MyConnection app = new MyConnection();
//	app.insertSQL(username_field.getUsername(), password_field.getPassword());
	/**
	 * Create the frame.
	 */
	public LogIn() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 450);
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
		btnNewButton_1.setBounds(509, 368, 95, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			//Opens registration page
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Registration acctCreate = new Registration();
				frame.dispose();
				open();
				
			}
	
		});
	
		btnNewButton_2.setBounds(338, 368, 123, 37);
		contentPane.add(btnNewButton_2);
		
		tfUser = new JTextField();
		tfUser.setBounds(325, 172, 279, 37);
		contentPane.add(tfUser);
		tfUser.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 19));
		lblUsername.setBounds(150, 152, 131, 51);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 19));
		lblPassword.setBounds(150, 249, 131, 37);
		contentPane.add(lblPassword);
		
		pfPswd = new JPasswordField();
		pfPswd.setBounds(325, 249, 279, 37);
		contentPane.add(pfPswd);
		
		JLabel lblAtlasAirlines = new JLabel("Atlas Airlines");
		lblAtlasAirlines.setVerticalAlignment(SwingConstants.TOP);
		lblAtlasAirlines.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAtlasAirlines.setHorizontalAlignment(SwingConstants.CENTER);
		lblAtlasAirlines.setFont(new Font("Gautami", Font.BOLD, 24));
		lblAtlasAirlines.setBounds(274, 65, 224, 51);
		contentPane.add(lblAtlasAirlines);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int customerId = isLoginCredentialsCorrect( tfUser.getText(),String.valueOf(pfPswd.getPassword()));
				if(customerId != -1)
				{
					JOptionPane.showMessageDialog(null, "Login Successful");
					MainMenu leMain = new MainMenu();
					dispose();
					leMain.open();
					LogIn.customerId = customerId;
					//Flights.openAvailable();
					
				} else
				{
					JOptionPane.showMessageDialog(null, "Invalid Credentials. Please Try Again...");
				}
			}
		});
		btnNewButton.setBounds(180, 368, 113, 37);
		contentPane.add(btnNewButton);
		
	}
	
	public static int customerId = -1;
	private void insertQuery(String username, String password) {
		String updateSQL = "INSERT INTO customer VALUES(0,0,\"\",\"\",\"\",\"\",\"\",0,\"username\",\"password\",00000,\"\",\"\");";
		try {
		java.sql.Connection conn = MyConnection.getConnection();
		PreparedStatement prstm= conn.prepareStatement(updateSQL);
		prstm.setString(9, username);
		prstm.setString(10, password);
		prstm.executeUpdate();
		}
		catch(Exception e){
			System.out.println("Insert failed");
		}
		
	}
	
	private int isLoginCredentialsCorrect(String username, String password) {
		String selectQuery = "Select * from customer where username_field = '"+username+"' and password_field = '"+password+"';";
		
		java.sql.Connection conn = null;
		PreparedStatement prstm= null;
		ResultSet rs  = null;
		
		try {
			 conn = MyConnection.getConnection();
			 prstm= conn.prepareStatement(selectQuery);
			 rs = prstm.executeQuery();
			 if(rs.next()) {
				//rs.beforeFirst();
				return rs.getInt(1);
			}
			return -1;
		}
		catch(Exception e) {
			return -1;
		}
		finally {
			if(rs != null) {
				try {
					rs.close();
				}
				catch(Exception ioe) {
					
				}
			}
			if(prstm != null) {
				try {
					prstm.close();
				}
				catch(Exception ioe) {
					
				}
			}
			if(conn != null) {
				try {
					conn.close();
				}
				catch(Exception ioe) {
					
				}
			}
		}
		
	}
}
