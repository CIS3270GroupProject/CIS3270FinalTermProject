package gui2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainMenu extends JFrame {
	
	private JFrame frame = new JFrame();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome!");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Gautami", Font.BOLD, 20));
		lblWelcome.setBounds(167, 38, 129, 32);
		contentPane.add(lblWelcome);
		
		JButton btnAvailableFlights = new JButton("Available Flights");
		btnAvailableFlights.setBounds(47, 96, 129, 47);
		contentPane.add(btnAvailableFlights);
		btnAvailableFlights.addActionListener(new ActionListener() {
			@Override
			//Opens registration page
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Flights.openAvailable();
				frame.dispose();
				open();
				
			}
	
		});
		
		
		JButton btnMyBookedFlights = new JButton("My Booked Flights");
		btnMyBookedFlights.setBounds(279, 96, 129, 47);
		contentPane.add(btnMyBookedFlights);
		btnMyBookedFlights.addActionListener(new ActionListener() {
			@Override
			//Opens registration page
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Registration acctCreate = new Registration();
				frame.dispose();
				open();
			}
			
		});
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				LogIn loginWin = new LogIn();
				loginWin.open();
			}
		});
		btnLogOut.setBounds(167, 176, 129, 47);
		contentPane.add(btnLogOut);
	}

}
