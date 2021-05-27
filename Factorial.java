import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args) 
	{
		int factorial = 1;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = s.nextInt();
        for(int i = 1; i <= num; ++i)
            factorial = factorial * i;
			System.out.printf("Factorial of %d = %d", num, factorial);
    }
}