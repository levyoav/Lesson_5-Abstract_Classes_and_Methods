package abstractClassesAndMethodsExample;

public class ShapeTest1 {

	public static void main(String[] args) {

		Shape shape = new Rectangle(4, 5);
		System.out.println(shape.getArea());

		shape = new Circle(5);
		System.out.println(shape.getArea());

	}
}
