package com.bridgelabz.linecomparisonoop;

import java.util.Scanner;

class Coordinates {

	// static variables
	public static double x1, x2, y1, y2;
	public static int distance;
	static Scanner sc = new Scanner(System.in);

	// computation for first point
	public void point1() {
		System.out.println("enter x1 & y1 values of first point");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
	}

	// computation for second point
	public void point2() {
		System.out.println("enter x2 & y2 values of second point");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
	}

	// calculating distance for point1 & point2
	public void distanceBetweenLines() {
		distance = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Distance between two points = " + distance);
	}
}

public class LineComparisonOOP {

	public static void main(String[] args) {
		Coordinates co = new Coordinates();
		co.point1();
		co.point2();
		co.distanceBetweenLines();
	}

}