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
		
		//Calculate triangle x
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p -x.a)*(p - x.b)*(p-x.c));
		
		//Calculate triangle y
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p -y.a)*(p - y.b)*(p-y.c));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		sc.close();

	}

}
