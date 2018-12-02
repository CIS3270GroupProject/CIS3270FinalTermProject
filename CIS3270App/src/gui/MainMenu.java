package gui;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import mainClass.Application;
import mainClass.Main;


public class MainMenu extends GuiPanel {
	
	private Font titleFont = Main.main.deriveFont(100f);
	private Font registrationFont = Main.main.deriveFont(24f);
	private Font loginFont = Main.main.deriveFont(24f);
	private String title = "Main Menu";
	private String registration = "Registration";
	private String login = "Login";
	private int buttonWidth = 220;
	private int spacing = 90;
	private int buttonHeight = 60;
	
	public MainMenu() {
		super();
		GuiButton registrationButton = new GuiButton(Application.WIDTH/2-buttonWidth/ 2, 220, buttonWidth, buttonHeight);
		GuiButton loginButton = new GuiButton(Application.WIDTH/2-buttonWidth/ 2, registrationButton.getY() + spacing, buttonWidth, buttonHeight);
		GuiButton quitButton = new GuiButton(Application.WIDTH/2-buttonWidth/ 2, loginButton.getY() + spacing, buttonWidth, buttonHeight);
	
	registrationButton.setText("Registration");
	loginButton.setText("Login");
	quitButton.setText("Quit Application");
	
	registrationButton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			GuiScreen.getInstance().setCurrentPanel("Registration");	
		}
	});
	loginButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			GuiScreen.getInstance().setCurrentPanel("Login");
			
		}
	});
	quitButton.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}
	});
	
	add(registrationButton);
	add(loginButton);
	add(quitButton);
	}

	@Override
	public void render(Graphics2D g) {
		super.render(g);
		g.setFont(titleFont);
		g.setColor(Color.black);
		g.drawString(title, Application.WIDTH / 2 - DrawUtils.getMessageWidth(title, titleFont, g) / 2, 150);
		g.setFont(titleFont);
		g.drawString(MainMenu, 20, Application.HEIGHT - 10);
	}
	
}
