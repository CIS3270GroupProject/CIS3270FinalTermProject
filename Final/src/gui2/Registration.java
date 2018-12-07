package gui2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration extends JFrame {
	
	private JFrame frame = new JFrame();

	private JPanel contentPane;
	private JTextField TFFirst;
	private JTextField TFLast;
	private JTextField TFStreet;
	private JTextField TFCity;
	private JTextField TFState;
	private JTextField TFZip;
	private JTextField TFUser;
	private JTextField TFPswd;
	private JTextField TFEmail;
	private JTextField TFssn;
	private JTextField TFAnswer;

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
		
		TFFirst = new JTextField();
		TFFirst.setBounds(104, 102, 113, 23);
		contentPane.add(TFFirst);
		TFFirst.setColumns(10);
		
		TFLast = new JTextField();
		TFLast.setColumns(10);
		TFLast.setBounds(340, 102, 113, 23);
		contentPane.add(TFLast);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(27, 105, 67, 20);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(268, 106, 54, 19);
		contentPane.add(lblLastName);
		
		JLabel lblStreetAddress = new JLabel("Street Address:");
		lblStreetAddress.setBounds(27, 156, 76, 20);
		contentPane.add(lblStreetAddress);
		
		TFStreet = new JTextField();
		TFStreet.setBounds(131, 155, 191, 23);
		contentPane.add(TFStreet);
		TFStreet.setColumns(10);
		
		TFCity = new JTextField();
		TFCity.setBounds(409, 155, 86, 23);
		contentPane.add(TFCity);
		TFCity.setColumns(10);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setBounds(353, 159, 46, 14);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State: ");
		lblState.setBounds(27, 203, 46, 14);
		contentPane.add(lblState);
		
		TFState = new JTextField();
		TFState.setBounds(131, 199, 191, 23);
		contentPane.add(TFState);
		TFState.setColumns(10);
		
		TFZip = new JTextField();
		TFZip.setColumns(10);
		TFZip.setBounds(409, 199, 86, 23);
		contentPane.add(TFZip);
		
		JLabel lblZipCode = new JLabel("Zip Code:");
		lblZipCode.setBounds(353, 203, 46, 14);
		contentPane.add(lblZipCode);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(27, 270, 67, 19);
		contentPane.add(lblUsername);
		
		TFUser = new JTextField();
		TFUser.setColumns(10);
		TFUser.setBounds(104, 268, 113, 23);
		contentPane.add(TFUser);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(278, 270, 61, 19);
		contentPane.add(lblPassword);
		
		TFPswd = new JTextField();
		TFPswd.setColumns(10);
		TFPswd.setBounds(340, 268, 113, 23);
		contentPane.add(TFPswd);
		
		TFEmail = new JTextField();
		TFEmail.setColumns(10);
		TFEmail.setBounds(131, 311, 191, 23);
		contentPane.add(TFEmail);
		
		TFssn = new JTextField();
		TFssn.setColumns(10);
		TFssn.setBounds(409, 311, 86, 23);
		contentPane.add(TFssn);
		
		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setBounds(27, 313, 76, 19);
		contentPane.add(lblEmailAddress);
		
		JLabel lblSsn = new JLabel("SSN:");
		lblSsn.setHorizontalAlignment(SwingConstants.CENTER);
		lblSsn.setBounds(353, 315, 46, 14);
		contentPane.add(lblSsn);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"What is your mother's maiden name?", "What street did you grow up on?", "What was your first pet's name?"}));
		comboBox.setBounds(131, 359, 208, 23);
		contentPane.add(comboBox);
		
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
		
		TFAnswer = new JTextField();
		TFAnswer.setColumns(10);
		TFAnswer.setBounds(131, 405, 191, 23);
		contentPane.add(TFAnswer);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				JOptionPane.showMessageDialog(null, "Account Creation Successful");
				dispose();
				LogIn login = new LogIn();
				login.open();
			}
		});
		btnNewButton.setBounds(375, 359, 120, 29);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				LogIn login = new LogIn();
				login.open();
				
			}
		});
		btnCancel.setBounds(375, 399, 120, 29);
		contentPane.add(btnCancel);
	}
}
