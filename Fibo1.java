import java.util.*;


class p2
{
	public static void main(String arg[])
	{
		int start,end;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Starting position :);
		start = s.nextInt();
		System.out.print("Enter Ending position :);
		end = s.nextInt();
		Fibo1 f = new Fibo1();
		s.fibo(start,end);
		
		
	}
}

public class Fibo1
{
	Fibo1()
	{}
	void fibo(int s,int e)
	{
		int spos,epos,a = 0, b = 1, c =0;
		spos = s;
		epos = e;
		if(s == 0)
		{
			System.out.println(0);
			System.out.println(1);
		}
		int i;
		while(i<=end)
		{
			c = a+b;
			if(c>=spos && c<=epos)
			{
				if(c >= epos)
					System.out.println(c);
				else
					break;
			}
			a=b;
			b=c;
			i++;
		}
	}
/*	int n, a = 0, b = 0, c =1;
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	system.out.println("Enter Value Of Print Fibonacci Series :");
	for(int i = 1; i<=n; i++)
	{
		a = b;
		b = c;
		c = a + b;
		system.out.println(a+"");
	}
	*/
}
/*
public class PrimeNumber
{
	int num1,i,j;
	Scanner p = new scanner(system.in);
	system.out.ptintln("Enter Number To Print Prime Number Or Not :");
	num1 = p.nextInt();
	i = 1;
	j = 0;
	while(i <= num1)
	{
		if((num1 % i)==0)
			j = j + 1;
			i++;
	}
	if(j == 2)
		system.out.println(num1+"is a Prime Number");
	else
		system.out.println(num1+"is not a Prime Number");
}
*/