package gui2;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import javafx.scene.control.ComboBox;

import javax.swing.JPasswordField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Registration extends JFrame implements ActionListener {
	
	private JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTextField tfFirst;
	private JTextField tfLast;
	private JTextField tfStreet;
	private JTextField tfCity;
	private JTextField tfState;
	private JTextField tfZip;
	private JTextField tfUsername;
	private JTextField tfPswd;
	private JTextField tfEmail;
	private JTextField tfSSN;
	private JTextField tfAnswer;

	/**
	 * Launch the application.
	 */
	public void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel header = new JLabel("New User Registration");
		header.setHorizontalAlignment(SwingConstants.CENTER);
		header.setFont(new Font("Gautami", Font.BOLD, 20));
		header.setBounds(165, 52, 246, 39);
		contentPane.add(header);
		
		tfFirst = new JTextField();
		tfFirst.setBounds(104, 102, 113, 23);
		contentPane.add(tfFirst);
		tfFirst.setColumns(10);
		
		tfLast = new JTextField();
		tfLast.setColumns(10);
		tfLast.setBounds(340, 102, 113, 23);
		contentPane.add(tfLast);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(27, 105, 67, 20);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(268, 106, 54, 19);
		contentPane.add(lblLastName);
		
		JLabel lblStreetAddress = new JLabel("Street Address:");
		lblStreetAddress.setBounds(27, 156, 76, 20);
		contentPane.add(lblStreetAddress);
		
		tfStreet = new JTextField();
		tfStreet.setBounds(131, 155, 191, 23);
		contentPane.add(tfStreet);
		tfStreet.setColumns(10);
		
		tfCity = new JTextField();
		tfCity.setBounds(409, 155, 86, 23);
		contentPane.add(tfCity);
		tfCity.setColumns(10);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setBounds(353, 159, 46, 14);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State: ");
		lblState.setBounds(27, 203, 46, 14);
		contentPane.add(lblState);
		
		tfState = new JTextField();
		tfState.setBounds(131, 199, 191, 23);
		contentPane.add(tfState);
		tfState.setColumns(10);
		
		tfZip = new JTextField();
		tfZip.setColumns(10);
		tfZip.setBounds(409, 199, 86, 23);
		contentPane.add(tfZip);
		
		JLabel lblZipCode = new JLabel("Zip Code:");
		lblZipCode.setBounds(353, 203, 46, 14);
		contentPane.add(lblZipCode);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(27, 270, 67, 19);
		contentPane.add(lblUsername);
		
		tfUsername = new JTextField();
		tfUsername.setColumns(10);
		tfUsername.setBounds(104, 268, 113, 23);
		contentPane.add(tfUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(278, 270, 61, 19);
		contentPane.add(lblPassword);
		
		tfPswd = new JPasswordField("*", 10);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(tfPswd);
		pack();
		setVisible(true);
			
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(131, 311, 191, 23);
		contentPane.add(tfEmail);
		
		tfSSN = new JTextField();
		tfSSN.setColumns(10);
		tfSSN.setBounds(409, 311, 86, 23);
		contentPane.add(tfSSN);
		
		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setBounds(27, 313, 76, 19);
		contentPane.add(lblEmailAddress);
		
		JLabel lblSsn = new JLabel("SSN:");
		lblSsn.setHorizontalAlignment(SwingConstants.CENTER);
		lblSsn.setBounds(353, 315, 46, 14);
		contentPane.add(lblSsn);
		
		String[] securityQuestions =  {"What is your mother's maiden name?", "What street did you grow up on?", "What was your first pet's name?"};
		@SuppressWarnings("rawtypes")
		JComboBox <String> comboBoxSecurityQues = new JComboBox<>(securityQuestions);
		comboBoxSecurityQues.setSelectedIndex(0);
		comboBoxSecurityQues.addActionListener((ActionListener) this);
		comboBoxSecurityQues.setBounds(131, 359, 208, 23);
		contentPane.add(comboBoxSecurityQues);
		
		JLabel lblNewLabel = new JLabel("Security Question:");
		lblNewLabel.setBounds(27, 361, 94, 19);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.desktop);
		separator.setBounds(39, 246, 468, 2);
		contentPane.add(separator);
		
		JLabel lblSecurityAnswer = new JLabel("Security Answer:");
		lblSecurityAnswer.setBounds(27, 409, 94, 14);
		contentPane.add(lblSecurityAnswer);
		
		tfAnswer = new JTextField();
		tfAnswer.setColumns(10);
		tfAnswer.setBounds(131, 405, 191, 23);
		contentPane.add(tfAnswer);
		
		JButton btnNewButton = new JButton("Create Account");
		JButton btnNewCancelButton = new JButton("Cancel");
		btnNewCancelButton.setBounds(375, 399, 120, 29);
		contentPane.add(btnNewCancelButton);
	}
			public void actionPerformed(ActionEvent e) {
				String fname = tfFirst.getText();
				String lname = tfLast.getText();
				String uname = tfUsername.getText();
				String pass = String.valueOf(((JPasswordField) tfPswd).getPassword());
				String address = tfStreet.getText();
				String city = tfCity.getText();
				String state = tfState.getText();
				String zip = tfZip.getText();
				JComboBox cb = (JComboBox)e.getSource();
				String securityQuestion = (String)cb.getSelectedItem().toString();
				String securityAnswer = tfAnswer.getText();
				
				if(uname.equals("")) {
					JOptionPane.showMessageDialog(null, "Add a username");
				}
				else if (pass.equals("")) {
					JOptionPane.showMessageDialog(null, "Add a password");
				}
				else if (fname.equals("")) {
					JOptionPane.showMessageDialog(null, "Add first name");
				}
				else if (lname.equals("")) {
					JOptionPane.showMessageDialog(null, "Add a last name");
				}
				else if (address.equals("")) {
					JOptionPane.showMessageDialog(null, "Add street address");
				}
				else if(city.equals("")) {
					JOptionPane.showMessageDialog(null,"Add city");
				}
				else if(state.equals("")) {
					JOptionPane.showMessageDialog(null, "Add state");
				}
				else if(zip.equals("")) {
					JOptionPane.showMessageDialog(null, "Add zip");
				}
				else if(securityQuestion.equals("")) {
					JOptionPane.showMessageDialog(null, "Add state");
				}
				else if(securityAnswer.equals("")){
					JOptionPane.showMessageDialog(null, "Add security answer");
				}
				else {
				
				PreparedStatement ps;
				String query = "INSERT INTO customer ('first_name', last_name, username_field, password_field, street,"
								+ " city, state, zip, ssn, security_question, security_answer) VALUES (?, ?, ?, ?, ?, ?,?,?,?,?,?)";
				try {
					ps = MyConnection.getConnection().prepareStatement(query);
					
					ps.setString(1, fname);
					ps.setString(2, lname);
					ps.setString(3, uname);
					ps.setString(4, pass);
					ps.setString(5, address);
					ps.setString(6, city);
					ps.setString(7, state);
					ps.setString(8, zip);
					ps.setString(9, securityQuestion);
					ps.setString(10, securityAnswer);
				
					if(ps.executeUpdate() > 0) {
						JOptionPane.showMessageDialog(null, "Account Creation Successful");
					}
				}
				
				catch(SQLException ex){
				Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
				}	
				}
			}	
			private void toLoginPage(java.awt.event.MouseEvent evt) {
				LogIn login = new LogIn();
				login.setVisible(true);
				login.pack();
				login.setLocationRelativeTo(null);
				login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.dispose();
				
	}
}
