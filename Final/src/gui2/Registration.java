package gui2;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import javafx.scene.control.ComboBox;

import javax.swing.JPasswordField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.*;
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

public class Registration extends JFrame {
	
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
	private JLabel header;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel lblStreetAddress;
	private JLabel lblCity;
	private JLabel lblState;
	private JLabel lblZipCode;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JComboBox comboBox;
	private String [] states = new String[3];
	private String selectedState;
	int index;
	Statement ps1;
	
	
	/**
	 * Create the frame.
	 */
	public Registration() {
		final JFrame frame = new JFrame();
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0,0,screenSize.width, screenSize.height);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel header = new JLabel("New User Registration");
		header.setHorizontalAlignment(SwingConstants.CENTER);
		header.setFont(new Font("Gautami", Font.BOLD, 20));
		header.setBounds(281, 37, 409, 23);
		contentPane.add(header);
		
		contentPane.add(header);
		tfFirst = new JTextField();
		tfFirst.setBounds(153, 95, 258, 30);
		contentPane.add(tfFirst);
		tfFirst.setColumns(10);
		
		tfLast = new JTextField();
		tfLast.setColumns(10);
		tfLast.setBounds(671, 102, 180, 23);
		contentPane.add(tfLast);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(27, 96, 123, 20);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(492, 105, 131, 19);
		contentPane.add(lblLastName);
		
		JLabel lblStreetAddress = new JLabel("Street:");
		lblStreetAddress.setBounds(27, 156, 76, 23);
		contentPane.add(lblStreetAddress);
		
		tfStreet = new JTextField();
		tfStreet.setBounds(131, 149, 280, 30);
		contentPane.add(tfStreet);
		tfStreet.setColumns(10);
		
		tfCity = new JTextField();
		tfCity.setBounds(669, 155, 182, 23);
		contentPane.add(tfCity);
		tfCity.setColumns(10);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setBounds(537, 156, 58, 23);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State: ");
		lblState.setBounds(27, 203, 76, 19);
		contentPane.add(lblState);
		
		tfState = new JTextField();
		tfState.setBounds(131, 199, 191, 30);
		contentPane.add(tfState);
		tfState.setColumns(10);
		
		tfZip = new JTextField();
		tfZip.setColumns(10);
		tfZip.setBounds(671, 199, 180, 23);
		contentPane.add(tfZip);
		
		JLabel lblZipCode = new JLabel("Zip Code:");
		lblZipCode.setBounds(514, 200, 109, 19);
		contentPane.add(lblZipCode);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(13, 309, 109, 19);
		contentPane.add(lblUsername);
		
		tfUsername = new JTextField();
		tfUsername.setColumns(10);
		tfUsername.setBounds(131, 306, 191, 23);
		contentPane.add(tfUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(380, 309, 113, 19);
		contentPane.add(lblPassword);
		
		tfPswd = new javax.swing.JPasswordField();
		tfPswd.setBounds(514, 303, 180, 30);
		contentPane.add(tfPswd);
			
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(131, 365, 191, 23);
		contentPane.add(tfEmail);
		
		tfSSN = new JTextField();
		tfSSN.setColumns(10);
		tfSSN.setBounds(514, 362, 180, 30);
		contentPane.add(tfSSN);
		
		JLabel lblEmailAddress = new JLabel("Email:");
		lblEmailAddress.setBounds(46, 368, 76, 19);
		contentPane.add(lblEmailAddress);
		
		JLabel lblSsn = new JLabel("SSN:");
		lblSsn.setHorizontalAlignment(SwingConstants.CENTER);
		lblSsn.setBounds(401, 368, 76, 19);
		contentPane.add(lblSsn);
		
		JLabel lblNewLabel = new JLabel("Security Question:");
		lblNewLabel.setBounds(372, 487, 190, 19);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.desktop);
		separator.setBounds(37, 260, 832, 9);
		contentPane.add(separator);
		
		JLabel lblSecurityAnswer = new JLabel("Security Answer:");
		lblSecurityAnswer.setBounds(87, 615, 246, 23);
		contentPane.add(lblSecurityAnswer);
		
		tfAnswer = new JTextField();
		tfAnswer.setColumns(10);
		tfAnswer.setBounds(298, 611, 368, 30);
		contentPane.add(tfAnswer);

		JButton btnNewCancelButton = new JButton("Cancel");
		btnNewCancelButton.setBounds(546, 695, 120, 29);
		contentPane.add(btnNewCancelButton);
		btnNewCancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				dispose();
			}
		});
		
		comboBox = new JComboBox();
		comboBox.setBounds(298,548,360,30);
		contentPane.add(comboBox);
		
		states[0] = "Whats your mothers maiden name?";
		states[1] = "What street did you grow up on?";
		states[2] = "Where did your parents meet?";
		
		for (int j= 0 ; j< 3; j++) {
			
			comboBox.addItem(states[j]);
		
			comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Object selectedStateobj = comboBox.getSelectedItem();
				selectedState = String.valueOf(selectedStateobj);
				index = comboBox.getSelectedIndex();
			}
		});
		
		
	}
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setBounds(704, 695, 120, 29);
		contentPane.add(btnCreateAccount);
		btnCreateAccount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				String fname = tfFirst.getText();
				String lname = tfLast.getText();
				String uname = tfUsername.getText();
				String pass = String.valueOf(((JPasswordField) tfPswd).getPassword());
				String address = tfStreet.getText();
				String city = tfCity.getText();
				String state = tfState.getText();
				String zip = tfZip.getText();
				String securityQuestion = comboBox.getSelectedItem().toString();
				String securityAnswer = tfAnswer.getText();
				String ssn = tfSSN.getText().toString();
				
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
				else if(ssn.equals("")){
					JOptionPane.showMessageDialog(null, "Add SSN");
				}
				else {
				
				PreparedStatement ps = null;
				String query = "INSERT INTO customer (first_name, last_name, username_field, password_field, street,"
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
					ps.setString(9,  ssn);
					ps.setString(10, securityQuestion);
					ps.setString(11, securityAnswer);
					
					if(ps.executeUpdate() > 0) {
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									
									JOptionPane.showMessageDialog(null, "Account Creation Successful!");
									LogIn frame = new LogIn();
									frame.setVisible(true);
									dispose();
								}
								catch (Exception e){
									e.printStackTrace();
								}
							}
							});
					}
					
					ps.close();
				}
				
				catch(SQLException ex){
				Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
				}	
				}
				
			}	
			
				
			
		});	
	}
		
}
