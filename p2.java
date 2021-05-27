import java.util.*;
class p2
{
	public static void main(String arg[])
	{
		int start,end;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Starting position :");
		start = s.nextInt();
		System.out.print("Enter Ending position :");
		end = s.nextInt();
		Fibo1 f = new Fibo1();
		f.fibo(start,end);
		PrimeNumber p = new PrimeNumber();
		p.prime(start,end);		
	}
}
class Fibo1
{
	Fibo1()
	{}
	void fibo(int s,int e)
	{
		int spos,epos,a = 0, b = 1, c =0;
		spos = s;
		epos = e;
		System.out.println("Fibonaci Series from " + spos + " to " + epos + " :");
		if(s == 0)
		{
			System.out.println(0);
			System.out.println(1);
		}
		int i=0;
		while(i<=epos)
		{
			c = a+b;
			if(c>=spos && c<=epos)
			{
				if(epos >= c)
					System.out.println(c);
				else
					break;
			}
			a=b;
			b=c;
			i++;
		}
	}
}

class PrimeNumber
{
	PrimeNumber()
	{}
	void prime(int s,int e)
	{
		int spos,epos,i,j,flag;
		i=1;
		j=0;
		spos = s;
		epos = e;
		flag=0;
		System.out.println("Prime Number from " + spos + " to " + epos + " :");
		if(spos == 0 || spos == 1 || spos == 2)
			System.out.println(2);
		for(i = spos;i<=epos;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag = 0;
					break;
				}
				else
					flag = 1;
			}
			if(flag ==1)
				System.out.println(i);
		}
		
	}
}