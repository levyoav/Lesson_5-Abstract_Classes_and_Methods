package abstractClassesAndMethodsExample;

public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	//Overriding abstract method from the class Shape.
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
