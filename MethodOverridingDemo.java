class Shape
{
	int r;
	void area()
	{
		System.out.println("area of Shape Class");
	}

}

class Circle extends Shape 
{
	void area()
	{
		r = 5;
		double d = (double)(Math.PI*r*r);
		System.out.println("area of Circle Class = " + d);

	}
}

class MethodOverridingDemo
{
	public static void main(String s[])
	 {
			Shape s1 = new Shape();
			s1.area();

			Circle c1 = new Circle();
			c1.area();
	}
}