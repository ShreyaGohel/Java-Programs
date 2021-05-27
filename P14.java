class Rectangle
{
	//data member 		
	int length=fieldInit();
	int width=-1;  
	static int numOfObject=-1;
	
	//initializer block
	{
		System.out.println("Initializer block execut");
		length=0;
		width=0;
	}
	
	//static initializer block
	static
	{
		System.out.println("Static block initialize");
		numOfObject=0;
	}
	
	//default constructor
	public Rectangle()
	{
		length=1;
		width=1;
		System.out.println("Default Constructor");		
		numOfObject++;
	}
	
	//parameterized constructor
	public Rectangle(int l, int b)
	{
		System.out.println("Parameterized Constructor");
		length=l;
		width=b;
		numOfObject++;
	}

	//copy constructor
	public Rectangle(Rectangle obj)
	{
		System.out.println("Copy Constructor");
		length=obj.length;
		width=obj.width;
		numOfObject++;
	}	

	//method to calculate area of rectangle
	public void getArea()
	{
		System.out.println("Length : "+length);
		System.out.println("Width  : "+width);
		System.out.println("Area   : "+length*width);		
	}
	
	//count number of objects created using static field
	public static void getNumOfObject()   
	{
		System.out.println("Number of object created : "+numOfObject);
	}
	
	public int fieldInit()
	{
		System.out.println("Field initialize");
		return(-1);
	}
}
class P14
{
	public static void main(String args[])
	{
		System.out.println("\n_____________________________\n");
		Rectangle firstRect=new Rectangle();		
		firstRect.getArea();
		Rectangle.getNumOfObject();
		System.out.println("\n_____________________________\n");
		Rectangle secondRect1=new Rectangle(firstRect);	
		System.out.println("\n_____________________________\n");
		Rectangle secondRect=new Rectangle(6,3);				
		secondRect.getArea();
		Rectangle.getNumOfObject();
		System.out.println("\n_____________________________\n");
	}
}