package abstractClassesAndMethodsExample;

//An abstract class cannot be instantiated. It can only be extended, thus they are necessarily a 
//super class. Only the classes that extend this class can be instantiated, given these classes 
//are not abstract themselves. An abstract class CANNOT BE A FINAL CLASS. We use abstract classes 
//when want to prohibit it from being instantiated or we lack the functionality to implement some 
//of the methods.
public abstract class Shape {

	// attributes
	private String Color;


	// CTORs
	public Shape(String color) {
		super();
		Color = color;
	}

	public Shape() {
	}

	//Abstract classes MAY (but don't have to) contain abstract methods. The abstract methods MUST BE OVERRIDEN
	//in an non-abstract sub-class. In this way, we force the sub-classes to implement it. It has no body.
	//An abstract method CANNOT BE A FINAL METHOD. An abstract method can be accessed POLYMOROHICLY. Turns the
	//entire class to be abstract if not defined so.
	public abstract double getArea();

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
}
