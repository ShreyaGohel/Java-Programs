class Shape
{
	int r;
	void area()
	{
		System.out.println("area of Shape Class");
	}

	int area(int x)
	{
		r = x;
		System.out.println("area of method over loading in Shape Class");
		return 0;
	}
}

class Circle extends Shape 
{
	void area()
	{
		System.out.println("area of Circle Class");

	}
}

class MethodOverloadingDemo
{
	public static void main(String s[])
	 {
			Shape s1 = new Shape();
			s1.area();

			Circle c1 = new Circle();
			c1.area();
	}
}