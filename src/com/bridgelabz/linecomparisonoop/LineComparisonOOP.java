package com.bridgelabz.linecomparisonoop;

import java.util.Scanner;

class Coordinates {
	Scanner sc = new Scanner(System.in);
	// instance variables
	static double x1, x2, y1, y2, x3, x4, y3, y4;
	static int distance1, distance2;

	// Computation for point1 & point2
	public void point1() {
		System.out.println("enter x1 & y1 values of first point");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
	}

	public void point2() {
		System.out.println("enter x2 & y2 values of second point");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
	}

	public void distanceBetweenPoint1Point2() {
		distance1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Distance between two points = " + distance1);
	}

	// Computation for point3 & point4
	public void point3() {
		System.out.println("enter x3 & y3 values of third point");
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
	}

	public void point4() {
		System.out.println("enter x2 & y2 values of second point");
		x4 = sc.nextDouble();
		y4 = sc.nextDouble();
	}

	public void distanceBetweenPoint3Point4() {
		distance2 = (int) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("Distance between two points = " + distance2);
	}

	// checking for line equality
	public void CompareLinesUsingEqualToMethod() {
		String str1 = Double.toString(distance1);
		String str2 = Double.toString(distance2);

		if (str1.equals(str2) == true)
			System.out.println("Both lines are equal");
		else
			System.out.println("Not both lines are equal");
	}
}

public class LineComparisonOOP {
	public static void main(String[] args) {
		Coordinates coordinate = new Coordinates();
		// Base class method calling
		coordinate.point1();
		coordinate.point2();
		coordinate.distanceBetweenPoint1Point2();
		coordinate.point3();
		coordinate.point4();
		coordinate.distanceBetweenPoint3Point4();
		coordinate.CompareLinesUsingEqualToMethod();
	}

}