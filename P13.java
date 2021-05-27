class Student 
{
	private int enrollmentNo;
	private String name;
	private String gender;
	Student()
	{
		System.out.println("\n___Default Constructor Student___\n");
		this.enrollmentNo = 33;
		this.name = "SHREYA GOHEL";
		this.gender = "FEMALE";
	}
	Student(int no)
	{
		this();
		this.enrollmentNo = no;
		this.name = "SHIVANI DAVE";
		this.gender = "FEMALE";
		System.out.println("\n___Parameterise Constructor 1 Student___\n");
	}
	
	void display()
	{
		System.out.println("Student Enrollment No : "+ enrollmentNo);
		System.out.println("Student Name          : "+ name);
		System.out.println("Student Gender        : "+ gender);
	}
}
class P13
{
	public static void main(String[] args)
	{
		System.out.println("\n___This Keyword Demo___\n");
		Student s = new Student();
		s.display();
		Student s1 = new Student(2);
		s1.display();
	}
}