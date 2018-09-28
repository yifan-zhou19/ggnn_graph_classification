package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		String str = new String(new char[100]);
		int i;
		int k;
		int j;
		int e;
		int number;
		str = new Scanner(System.in).nextLine();
		number = str.length();
		k = number - 1;
		for (i = number - 1;i >= 0;i--)
		{
			if (str.charAt(i) == ' ')
			{
				e = i;
			   for (j = e+1;j <= k;j++)
			   {
				 System.out.printf("%c",str.charAt(j));
			   }
			   if (j == k + 1)
			   {
				   System.out.print(" ");
			   }
				 k = e-1;
			}
			if (i == 0)
			{
				for (j = 0;j <= number - 1 && (str.charAt(j)) != ' ';j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
			}

		}

	}
}
