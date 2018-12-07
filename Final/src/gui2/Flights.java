package gui2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Flights extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public void openBooked() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flights frame = new Flights();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void openAvailable() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flights frame = new Flights();
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
	public Flights() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(170, 31, 476, 440);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Book Flight");
		btnNewButton.setBounds(20, 100, 127, 38);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Available Flights");
		rdbtnNewRadioButton.setBounds(20, 31, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnBookedFlights = new JRadioButton("Booked Flights");
		rdbtnBookedFlights.setBounds(20, 57, 109, 23);
		contentPane.add(rdbtnBookedFlights);
		
		JButton btnRemoveFlight = new JButton("Remove Flight");
		btnRemoveFlight.setBounds(20, 149, 127, 38);
		contentPane.add(btnRemoveFlight);
		
		JPanel panel = new JPanel();
		panel.setVisible(false);
		panel.setBounds(20, 275, 127, 166);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAddFlight = new JButton("Add Flight");
		btnAddFlight.setBounds(0, 11, 127, 38);
		panel.add(btnAddFlight);
		
		JButton btnUpdateFlight = new JButton("Update Flight");
		btnUpdateFlight.setBounds(0, 60, 127, 38);
		panel.add(btnUpdateFlight);
		
		JButton btnDeleteFlight = new JButton("Delete Flight");
		btnDeleteFlight.setBounds(0, 109, 127, 38);
		panel.add(btnDeleteFlight);
	}
}
