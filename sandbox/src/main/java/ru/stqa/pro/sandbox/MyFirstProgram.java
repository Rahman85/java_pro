package ru.stqa.pro.sandbox;

public class MyFirstProgram { //class name starts with uppercase
	//function
	public static void main(String[] args) {// starts with lower case: void nothing return
		hello("world");
		hello("user");
		hello("rahman");

		Square s = new Square(5);
		System.out.println("Square of square with side " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
		System.out.println("Square of rectangle with sides " + r.a + " and " + r.b + " = " + r.area());

	}

  public static void hello(String somebody) {
		System.out.println("Hello, " + somebody);

	}




}
	