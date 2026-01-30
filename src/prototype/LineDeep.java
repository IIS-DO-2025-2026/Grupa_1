package prototype;

import java.awt.Color;
import java.awt.Graphics;

import mvc.Point;
import mvc.Shape;

//2. način - deep copy način prototype obrasca
public class LineDeep extends Shape{
	private Point startPoint = new Point();
	private Point endPoint = new Point();
	private Color color;
	
	public LineDeep() {};

	public LineDeep(Point startPoint, Point endPoint, Color color) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.color = color;
	}



	@Override
	public void draw(Graphics g) {
		// logika za crtanje
		
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	//prototype
	public LineDeep clone() {
		LineDeep lineDeep = new LineDeep();
		
		lineDeep.getStartPoint().setX(this.getStartPoint().getX());
		lineDeep.getStartPoint().setY(this.getStartPoint().getY());
		lineDeep.getEndPoint().setX(this.getEndPoint().getX());
		lineDeep.getEndPoint().setY(this.getEndPoint().getY());
		lineDeep.setColor(this.getColor());
		
		return lineDeep;
	}
	

}
