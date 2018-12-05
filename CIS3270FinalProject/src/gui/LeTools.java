package gui;
import javax.swing.*;
import java.awt.*;

//The look & feel for the GUI is established
public class LeTools 
{
	public static void setNativeLookAndFeel() 
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e)
		{
			System.out.println("Error setting native LAF: " + e);
		}
	}
//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//UIManager.setLookAndFeel( "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
}