/*
Write a program in Java to demonstrate the use of 'final' keyword in the field declaration. How it is accessed using the objects.

final variable's value can not be change
final class can not be inherited
final method can not be override
*/

final class X // final class
{
	final int x=90;//final variable  
	final public void disp() //final method
	{
		//x=99; // ERROR : final variable value can not be change
		System.out.println("final variable : "+x);
	}
}
/*
class Y extends X //final class can not be inherited
{
	public void disp() //final method can not be override
	{	
		System.out.println("disp of Y : ");
	}
}
*/


class P21
{  	  
	public static void main(String args[])
	{  
		X obj=new  X();  		
		System.out.println("final variable : "+obj.x);
	}  
}