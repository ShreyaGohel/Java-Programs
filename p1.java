import java.util.*;
/*
public class Fibo
{
	public void F(int spos,int epos)
	{
		int no,no1=0,no2=1;
		int i=0;
		int len = 999;
		System.out.println("Fibonaci Series");
		while(i<len)
		{
			no = no1 + no2;
			no1 = no2;
			no2 = no;
			i++;
			if(i>=spos && i<=epos)
			{
				System.out.println(no);
			}
		}
	}
}*/
class p1
{
	public static void main(String arg[])
	{
		int spos=0,epos=0;
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Starting No and Ending No :");
		spos = s.nextInt();
		epos = s1.nextInt();
		//F(spos,epos);
		
		
//		void F(int sno,int eno)
	//	{
			int no,no1=0,no2=1;
			int i=0;
			int len=epos;
			System.out.println("Fibonaci Series");
			while(i<len)
			{
				no = no1 + no2;
				if(i>spos && i<epos)
				{
					System.out.println(no);
				}
				
				no1 = no2;
				no2 = no;
				i++;
				
			}
//		}
	}
}
/*
ClassPrime
{
}
*/
// tro voice avto j nthi mne
// ok
//