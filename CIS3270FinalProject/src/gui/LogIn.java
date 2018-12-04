package gui;

import javax.swing.*;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.ShellEvent;

public class LogIn {
	private JFrame yerr;
	private static Text UserName;
	private static Text Pswd;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label LUser = new Label(shell, SWT.NONE);
		LUser.setBounds(83, 35, 55, 15);
		LUser.setText("Username:");
		
		Label LPswd = new Label(shell, SWT.NONE);
		LPswd.setBounds(83, 77, 55, 15);
		LPswd.setText("Password:");
		
		UserName = new Text(shell, SWT.BORDER);
		UserName.setBounds(222, 29, 76, 21);
		
		Pswd = new Text(shell, SWT.BORDER);
		Pswd.setBounds(222, 74, 76, 21);
		
		Button btnSignIn = new Button(shell, SWT.NONE);

		btnSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				abstract class button1 implements ActionListener
				{
					LogIn type;
					char[] cCheck, cPassword={'1','0','1','7','!','\0'};
					JFrame f;
					String sCheck,sCheck1="yeerrr";

					public button1(LogIn type)
					{
						this.type = type;
					
				
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
			}
		}
		);
		btnSignIn.setBounds(150, 146, 75, 25);
		btnSignIn.setText("Sign In");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	public static void open() {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					LogIn window = new LogIn();
					window.yerr.setVisible(true);
				} catch (Exception e){
					System.out.println("You got an error, fam");
				}
			}
		});
	
		
	}

}
