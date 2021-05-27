class GetSetDemo
{
	String name;
	int age;

	GetSetDemo()
	{
		this.name = "smit";
		this.age = 20;
	}

	GetSetDemo(String s1)
	{
		this();
		this.name = s1;
		this.age = a1;
	}

	GetSetDemo(String s1, int a1)
	{
		this();
		this.name = s1;
		this.age = a1;
	}	

	void display()
	{
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);

	}

	void setName(String s1)
	{
		this.name = s1;
	}

	void setAge(int a1)
	{
		this.age = a1;
	}

	String getName()
	{
		return this.name;
	}

	int getAge(int a1)
	{
		return this.age;
	}
	 public static void main(String arg[])
	 {
	 	GetSetDemo g1 = new GetSetDemo();
	 	g1.display();

	 	GetSetDemo g2 = new GetSetDemo("shreya", 22);
	 	g2.display();

	 	g1.setName("Nishu");
	 	g1.setAge(22);
	 	g1.display();

	 	String name1 = g1.getName();
	 	int age1 = g1.getAge();

	 	System.out.println("Name for g1 obj = " + name1);
		System.out.println("Age for g1 obj = " + age1);

	 }	

}