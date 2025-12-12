package mvc;

import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JPanel;

public class DrawingView extends JPanel {
	// jedini izuzetak od početne MVC strukturu, kako bi se sprečio model null
	DrawingModel model = new DrawingModel();
	
	public void paint(Graphics g) {
		Iterator<Point> it = model.getShapes().iterator();
		while(it.hasNext())
			it.next().draw(g);
	}

	public void setModel(DrawingModel model) {
		this.model = model;
	}

}
