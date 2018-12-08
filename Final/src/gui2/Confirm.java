package gui2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Confirm extends JFrame {
	private JFrame frame;
	private JPanel contentPane;
	
	public Confirm() throws IOException {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMenu = new JButton("Main Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu leMain = new MainMenu();
				leMain.setVisible(true);
				dispose();
				
			}
		});
		btnMenu.setBounds(233, 364, 107, 46);
		contentPane.add(btnMenu);
		
		JLabel lblHeader = new JLabel("Thank you for flying with Atlas Airlines!");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Gautami", Font.BOLD, 20));
		lblHeader.setBounds(99, 44, 385, 40);
		contentPane.add(lblHeader);
		
		JLabel lblReview = new JLabel(Customer.getCustomer() + " is reserved for Flight " 
				+ flight_num + " on " + departureDate.getDate());
		lblReview.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblReview.setHorizontalAlignment(SwingConstants.CENTER);
		lblReview.setBounds(99, 95, 421, 25);
		contentPane.add(lblReview);
		
		JLabel lblDepartcity = new JLabel(getString(Depart_City));
		lblDepartcity.setBounds(99, 186, 58, 25);
		contentPane.add(lblDepartcity);
		
		JLabel lblDeparttime = new JLabel(getString(Depart_Time));
		lblDeparttime.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeparttime.setBounds(99, 222, 58, 25);
		contentPane.add(lblDeparttime);
		
		JLabel lblArrivcity = new JLabel(getString(Arriv_City));
		lblArrivcity.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrivcity.setBounds(426, 186, 58, 25);
		contentPane.add(lblArrivcity);
		
		JLabel lblArrivTime = new JLabel(getString(Arriv_Time));
		lblArrivTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrivTime.setBounds(426, 222, 58, 25);
		contentPane.add(lblArrivTime);
		
		JLabel lblArrow = new JLabel("");
		lblArrow.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrow.setBounds(251, 199, 73, 40);
		ImageIcon arrow = new ImageIcon(ImageIO.read(getClass().getResource("img/long-arrow-pointing-to-the-right.png")));
		lblArrow.setIcon(new ImageIcon(Confirm.class.getResource("/img/long-arrow-pointing-to-the-right.png")));
		contentPane.add(lblArrow);
		
		
	}

}
