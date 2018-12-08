package gui2;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import java.awt.event.ActionEvent;
public class Flights extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private final ButtonGroup flightMenuGroup = new ButtonGroup();
	private boolean isAdmin = false;
	private int menuType = 0;

	/**
	 * Launch the application.
	 */
	
	private void openBooked() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flights frame = new Flights();
					frame.setVisible(true);
					frame.menuType = 1;
					//frame.flightMenuGroup.setSelected(rdbtnAvail, arg1);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void openAvailable() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flights frame = new Flights();
					frame.setVisible(true);
					frame.menuType = 2;
				
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
		setBounds(500, 500, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Vector rows = new Vector();
		Vector<String> headers = new Vector();
		headers.addElement("Flight Number");
		headers.addElement("Departure Time");
		headers.addElement("Arrival Time");
		headers.addElement("Departure City");
		headers.addElement("Arrival City");
		headers.addElement("Seats Available");
;

JButton btnRemove = new JButton("Remove Flight");
btnRemove.setBounds(20, 149, 127, 38);
contentPane.add(btnRemove);

		
		table = new JTable(rows, headers);
		table.setBounds(300, 300, 600, 600);
		contentPane.add(table);
		//test
		JButton btnBook = new JButton("Book Flight");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();	
				
						menuType = 2;
					btnRemove.setEnabled(false);
					btnBook.setEnabled(true);
					
					bookFlight(selectedRow);
			}
		});
		btnBook.setBounds(20, 100, 127, 38);
		contentPane.add(btnBook);
		
		
		JPanel panelAdmin = new JPanel();
		panelAdmin.setVisible(false);
		panelAdmin.setBounds(20, 217, 127, 166);
		contentPane.add(panelAdmin);
		panelAdmin.setLayout(null);
		
		JButton btnAdd = new JButton("Add Flight");
		btnAdd.setBounds(0, 11, 127, 38);
		panelAdmin.add(btnAdd);
		
		
		JButton btnUpdate = new JButton("Update Flight");
		btnUpdate.setBounds(0, 60, 127, 38);
		panelAdmin.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete Flight");
		btnDelete.setBounds(0, 109, 127, 38);
		panelAdmin.add(btnDelete);
		
		JRadioButton rdbtnAvail = new JRadioButton("Available Flights");
		rdbtnAvail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuType = 2;
				btnRemove.setEnabled(false);
				btnBook.setEnabled(true);
				
				queryAvailableFlights();
			}
		});
		flightMenuGroup.add(rdbtnAvail);
		rdbtnAvail.setBounds(20, 31, 109, 23);
		contentPane.add(rdbtnAvail);
		
		JRadioButton rdbtnBooked = new JRadioButton("Booked Flights");
		rdbtnBooked.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuType = 1;
				btnRemove.setEnabled(true);
				btnBook.setEnabled(false);
			}
		});
		flightMenuGroup.add(rdbtnBooked);
		rdbtnBooked.setBounds(20, 57, 109, 23);
		contentPane.add(rdbtnBooked);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu leMain = new MainMenu();
				leMain.open();
				dispose();
			}
		});
		btnMainMenu.setBounds(20, 394, 127, 38);
		contentPane.add(btnMainMenu);		
	}
	
	private void queryAvailableFlights() {
		String selectQuery = "Select * from flights;";
		
		java.sql.Connection conn = null;
		PreparedStatement prstm= null;
		ResultSet rs  = null;
		
		try {
			 conn = MyConnection.getConnection();
			 prstm= conn.prepareStatement(selectQuery);
			 rs = prstm.executeQuery();
			
			 DefaultTableModel model = (DefaultTableModel) table.getModel();
			 while(rs.next()) {
				model.addRow( new Object[] {rs.getFloat(0), rs.getTime(1), rs.getTime(2), rs.getString(3), rs.getString(4), rs.getFloat(5)});
			 }
			
		}
		catch(Exception e) {
			
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
	
	private void bookFlight(int selectedRow) {
		java.sql.Connection conn = null;
		PreparedStatement prstm= null;
		ResultSet rs  = null;
		String insertQuery = "INSERT INTO BOOKINGS (customerId, flight_num) values(?, ?);";
		try {
			 conn = MyConnection.getConnection();
			 prstm= conn.prepareStatement(insertQuery);
			 prstm.setInt(1, (int) table.getValueAt(selectedRow, 0));
			 prstm.setInt(2, (int) LogIn.customerId);
			 rs = prstm.executeQuery();
			
		
		}
		catch(Exception e) {
			
		}
				
	}
}

		
