import java.util.*;
class Matrix
{
	public static void main(String str[])
	{
		int i,j,c,d;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Matrix row :");
		i = s.nextInt();
		System.out.print("Enter Matrix Column :");
		j = s.nextInt();
	
		int m1[][] = new int[i][j];
		int sum=0;
		
		System.out.println("Enter " + i +" * " + j +" Matrix:");
		for(c=0;c<i;c++)
		{
			for(d=0;d<j;d++)
			{
				m1[c][d] = s.nextInt();
			}
		}
			
		System.out.println("Data of " + i +" * " + j +" Matrix:");
		for(c=0;c<i;c++)
		{
			for(d=0;d<j;d++)
			{
				//m1[i][j] = s.nextInt();
				System.out.print(m1[c][d]+"  ");
			}
			System.out.println("\n");
		}
		System.out.println("Sum of Matrix :");
		for(c=0;c<i;c++)
		{
			sum = 0;
			for(d=0;d<j;d++)
			{
				sum = sum + m1[c][d];
				
			}
			System.out.println("Row "+(c+1)+" sum = "+sum);
			
		}
	}
}
