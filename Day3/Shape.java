

public class Shape {
	protected String shapeName;
	Shape()
	{
		this.shapeName=shapeName;
	}
	public double calculateArea()
	{
		return 0;
	}

}
class Square extends Shape{
	private int side;
	public Square(int a)
	{
		double side=a;
		shapeName="square";
	}
	
	public double calculateArea()
	{
		return side*side;
	}
	}
class Rectangle extends Shape
{
	private int length;
	private int breadth;
	public Rectangle(int l,int b)
	{
		double length=l;
		double breadth=b;
		shapeName="Rectangle";
	}
	public double calculateArea()
	{
		return length*breadth;

	}
	}
class Circle extends Shape
{
	private double radius;
	public Circle(int r)
	{
		double radius=r;
		shapeName="Circle";
	}
	public double calculateArea()
	{
		return 3.14*radius*radius;
		
	}
}

class Area
{
	public static void main(String args[])
	{
		Shape s=new Shape();
		Square s1=new Square(20);
		Rectangle r=new Rectangle(100,40);
		Circle c=new Circle(5);
		System.out.println("Area of Square:"+s1.calculateArea());
		System.out.println("Area of Rectangle:"+r.calculateArea());
		System.out.println("Area of Circlr:"+c.calculateArea());
		
		
	}
}

