class Fibo
{
	public static void main(String str[])
	{
		int a = 0, b = 1, c, i, d =10;
		System.out.print(a);
		System.out.print(b);
		i = 2;
		while(i < d)
		{
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			i++;
		}
	}
}