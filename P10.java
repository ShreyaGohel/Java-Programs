class P10
{
	public static void main(String str[])
	{
		// System.out.println("The Number of Argument = " + count(str));
		int count = str.length;
		String s[] = new String[] {"First","Second","Third","Fourth","Fifth","Sixth","Seventh","Eighth","Nineth","Tenth","Eleventh","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
		System.out.println("The Number of Argument = " + count);

		for(int i=0;i<count;i++)
		{
			System.out.println((i+1) + ") " + s[i] +" Name = "+str[i]);
		}
		// System.out.println("First Name: " + str[0]);
		// System.out.println("Second Name: " + str[1]);
		// System.out.println("Third Name: " + str[2]);
	}
}