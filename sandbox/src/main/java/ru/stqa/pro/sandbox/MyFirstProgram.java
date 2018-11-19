package ru.stqa.pro.sandbox;

public class MyFirstProgram { //class name starts with uppercase
	//function
	public static void main(String[] args) {// starts with lower case: void nothing return
		hello("world");
		hello("user");
		hello("rahman");
		double len = 5;
		System.out.println("Square of square with side " + len + " = " + area(len));

		double a = 4;
		double b = 6;
		System.out.println("Square of rectangle with sides " + a + " and " + b + " = " + area(a, b));

	}

  public static void hello(String somebody) {
		System.out.println("Hello, " + somebody);

	}

	public static double area(double l) {
		return l * l;

	}
	public static double area(double a, double b) {
		return a * b;

	}

}
	