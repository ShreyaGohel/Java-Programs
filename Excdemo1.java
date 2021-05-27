class Excdemo1
{
	public static void main(String arg[])
	{
		//int a = Integer.parseInt(arg[0]);
		//int b = Integer.parseInt(arg[1]);
		
		int c = 0;
		
		
		System.out.println("Hello before exc");
		
		try
		{
			int a = Integer.parseInt(arg[0]);
			int b = Integer.parseInt(arg[1]);
			c = b/a;
			
			throw new ArithmeticException();
		}
		
		/*catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("User Can't Enter 0");
		}*/
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("Uhh need to enter 2 values from command line arg");
			
		}
		
		catch(NumberFormatException e)
		{
			System.out.println(e);
			System.out.println("Uhh need to enter Number insted of String");
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("ExceptionWith Throw Statment");
			
		}
		
		finally
		{
			System.out.println("Finally Block Executed");
		}
		
		System.out.println(c);
		System.out.println("Hello after exc");
		
	}
}