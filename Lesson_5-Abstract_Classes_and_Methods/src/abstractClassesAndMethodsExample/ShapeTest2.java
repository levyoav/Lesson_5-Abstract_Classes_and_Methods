package abstractClassesAndMethodsExample;

public class ShapeTest2 {

	public static void main(String[] args) {

		Shape s;

		s = new Rectangle(2, 6);
		System.out.println("area: " + s.getArea());

		s = new Circle(2);
		System.out.println("area: " + s.getArea());
	}
}
