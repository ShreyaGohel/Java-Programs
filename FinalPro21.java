final class S // final class
{
	final int s = 12;//final variable  
	final public void disp() //final method
	{
		System.out.println("\n\t FINAL VARIABLE : " +s);
	}
}

class FinalPro21
{  	  
	public static void main(String args[])
	{  
		S obj = new  S();  		
		System.out.println("\n+---+---+---+---+---+---+---+---+---+---+---+---+");
		System.out.println("\n\t FINAL VARIABLE  :" + obj.s);
		System.out.println("\n+---+---+---+---+---+---+---+---+---+---+---+---+");
	}  
}