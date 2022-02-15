package com.bridgelabz.linecomparisonoop;

import java.util.Scanner;

class CoOrdinates {
	public double x;		// co-ordinate x
	public double y;		// co-ordinate y
	public double length;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}

public class LineComparisonOOP {
	public static double lineLength() {
		CoOrdinates co = new CoOrdinates();
		try (Scanner scanner = new Scanner(System.in)) {
			co.setX((scanner.nextInt()));
			double x1 = co.getX();
			co.setX((scanner.nextInt()));
			double x2 = co.getX();
			co.setY((scanner.nextInt()));
			double y1 = co.getY();
			co.setY((scanner.nextInt()));
			double y2 = co.getY();
			double x = Math.pow((x1 - x2), 2);
			double y = Math.pow((y1 - y2), 2);
			double length = Math.sqrt(x + y);

			return length;
		}
	}
	/*
	 *  print Welcome Message & Line Length
	 */
	
	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparison Using OOP's Concept" + "\nEnter the CoOrdinates: ");
		double lineLength = lineLength();
		System.out.println("Length of line is " + lineLength);
	}

}
