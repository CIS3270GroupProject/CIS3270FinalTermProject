package gui;

import java.awt.Graphics2D;
import java.util.ArrayList;

import javafx.scene.input.MouseEvent;

public class GuiPanel {
	
	private ArrayList<GuiButton>buttons;
	
	public GuiPanel() {
		buttons = new ArrayList<GuiButton>();
	}
	
	public void update() {
		for(GuiButton button: buttons)
			button.update();
		
	}
	public void render(Graphics2D g) {
		for(GuiButton button: buttons) {
			button.render(g);
		}
	}
	public void add(GuiButton button) {
		buttons.add(button);
	}
	
	public void remove(GuiButton button) {
		buttons.remove(button);
	}
	public void mousePressed(MouseEvent e) {
		for(GuiButton button: buttons) {
			button.mousePressed(e);
		}
	}
	public void mouseReleased(MouseEvent e) {
		for(GuiButton button: buttons) {
			button.mouseReleased(e);
		}
	}
	public void mouseDragged(MouseEvent e) {
		for(GuiButton button: buttons) {
			button.mouseDragged(e);
		}
	}
	public void mouseMoved(MouseEvent e) {
		for(GuiButton button: buttons) {
			button.mouseMoved(e);
		}
	}
}

