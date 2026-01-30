package prototype;

import java.awt.Color;

import mvc.Point;

public class TestPrototype {

	public static void main(String[] args) {
		// Testiranje 1. načina (shallow) prototype obrasca
		Point p1 = new Point(10, 10, Color.BLACK);
		Point p2 = new Point(20, 20, Color.BLACK);
		
		LineShallow line = new LineShallow(p1, p2, Color.BLACK);

		LineShallow lineClone = line.clone();
		
		System.out.println(line);
		System.out.println(lineClone);
		
		line.getStartPoint().setX(246);
		System.out.println(lineClone.getStartPoint().getX());
		
		
		//2. način - deep copy
		LineDeep line2 = new LineDeep(new Point(50, 50,Color.BLACK), new Point(60,60,Color.BLACK), Color.BLACK);
		LineDeep lineClone2 = line2.clone();
		
		line2.getStartPoint().setX(11111);
		System.out.println(lineClone2.getStartPoint().getX());
	}

}
