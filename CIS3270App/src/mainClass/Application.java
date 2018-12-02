package mainClass;

import java.awt.Graphics2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import gui.GuiScreen;

public class Application implements Runnable, KeyListener, MouseListener, MouseMotionListener {
	
	public static final Font main = new Font("Calibri", Font.PLAIN, 28);
		
	private GuiScreen screen;
	screen.add("Main Menu", new MainMenu());
	screen.setCurrentPanel("MainMenu");
	
	public Application() {
		setFocusable(true);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);

	}
	
	screen = GuiScreen.getInstance();
	
	private void update() {
		screen.update();
		Keyboard.update();
		
	}
	private void render() {
		Graphics2D g = (Graphics2D) image.getGraphics();
		g.setColor(Color.white);
		g.fillBox(0, 0, WIDTH, HEIGHT);
		screen.render(g);
		g.dispose();
		
		Graphics2D g2d = (Graphics2D)getGraphics();
		g2d.drawImage(image, 0, 0, null);
		g2d.dispose();
	}
	screen.add("Main Menu", new MainMenu());
	screen.setCurrentPanel("Menu");
	
	screen = GuiScreen.getInstance();
	
	

	@Override
	public void mouseDragged(MouseEvent e) {
		screen.mouseDragged(e);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		screen.mouseMoved(e);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		
	}

	@Override
	public void mouseExited(MouseEvent e) {

		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		screen.mousePressed(e);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		screen.mouseReleased(e);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Keyboard.keyPressed(e);
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		Keyboard.keyReleased(e);
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		Keyboard.keyTyped(e);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
