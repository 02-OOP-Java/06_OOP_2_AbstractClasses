package com.cc.java;

public class Start {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10.0, 10.0);
		Circle circle = new Circle(5.0);
		Triangle triangle = new Triangle(10.0, 10.0);
		
		ausgabe("-----------  Fläche -------------");
		ausgabe("Fläche Rechteck: " + rectangle.area());
		ausgabe("Fläche Kreis: " + circle.area());
		ausgabe("Fläche Dreieck: " + triangle.area());
		
		ausgabe("-----------  Differenz -----------");
		ausgabe("Diff. r/t : " + areaDiff(rectangle, triangle));
		ausgabe("Diff. r/c : " + areaDiff(rectangle, circle));
		
		
	}

	// Aufwand/Nutzen? --> linear !!
	// 1966 "HELP!" -- Hi, Hi, Hilfe!
	// more of the same? --> NO ! 
	
	
	// Rechteck - Dreieck
	public static double areaDiff(Rectangle r, Triangle t) {
		return r.area() - t.area();
	}
	
	// Rechteck - Kreis
	public static double areaDiff(Rectangle r, Circle c) {
		return r.area() - c.area();
	}
	
	public static void ausgabe(String outStr) {
		System.out.println(outStr);
	}
	
	
}
