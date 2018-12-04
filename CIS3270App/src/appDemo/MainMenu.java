package appDemo;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class MainMenu extends JFrame {

	 JPanel contentPane;
	 JTextField UserName;
	 JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		boolean passCheck = true;
		
		JPanel Login = new JPanel();
		contentPane.add(Login);
		
		JLabel UserLabel = new JLabel("Username");
		Login.add(UserLabel);
		
		UserName = new JTextField();
		Login.add(UserName);
		UserName.setColumns(10);
		
		JLabel passLabel = new JLabel("Password");
		Login.add(passLabel);
		
		passwordField = new JPasswordField();
		Login.add(passwordField);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setAction(button1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Login.add(btnNewButton);
		//1000330
	}

	class button1 implements ActionListener
	{
		MainMenu type;
		char[] cCheck, cPassword={'a','d','m','i','n','\0'};
		JFrame f;
		String sCheck,sCheck1="admin";

		public button1(MainMenu type)
		{
			this.type = type;
		}
		public void actionPerformed(ActionEvent e)
		{
			cCheck=type.passwordField.getPassword();
			sCheck = type.UserName.getText();
			if ((sCheck1.equals(sCheck)) && check())
			{
				type.Login.add(type.LDomesticFlight1);

				type.Login.remove(type.UserLabel);
				type.Login.remove(type.UserName);
				type.Login.remove(type.passLabel);
				type.Login.remove(type.passwordField);
				type.Login.remove(type.BLogin );

				type.c.repaint();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
			}
		}
		public boolean check()
		{
			if (cCheck.length >= 6 || cCheck.length < 4)
				return false;
			for(int i=0;i<=4;i++)
			{
				if(cCheck[i]!=cPassword[i])
					return false;
			}
			return true;
		}
	}
	class mouse1 extends MouseAdapter
	{
		MainMenu type;
		boolean passCheck;

		public mouse1(MainMenu type, boolean pCheck)
		{
			this.type = type;
			this.passCheck = pCheck;
		}
		public void mouseEntered(MouseEvent e)
		{
			type.LDomesticFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			type.LInternationalFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		}
		public void mouseClicked(MouseEvent e)
		{
			if(passCheck)
				type.pCheck = true;
			else
				type.pCheck = false;
			type.LEconomic.setVisible(true);
			type.LBusiness1.setVisible(true);
			type.LEconomic1.setVisible(false);
			type.LBusiness.setVisible(false);

			type.JSP1.setVisible(false);
			type.JSP2.setVisible(false);
			type.JSP3.setVisible(false);
			type.JSP4.setVisible(false);
			if(bCheck)
				type.JSP1.setVisible(true);
			else
				type.JSP2.setVisible(true);
		}
	}

}
