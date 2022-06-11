package application;

import java.util.Scanner;
import entities.Triangle;

//Calculate Area of ​​Triangle
public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// class instance
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		//input data triangle x
		System.out.println("Enter the measures of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		//input data triangle y
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//Calculate area triangle x
		double areaX = x.area();
		
		//Calculate area triangle y
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		sc.close();

	}

}
