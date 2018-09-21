package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k = 0;
		String c = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		for (i = c.length() - 1;i >= 0;i--)
		{
			if (c.charAt(i) != ' ')
			{
		 k++;
			}
			if (c.charAt(i) == ' ')
			{
				for (j = i + 1;j <= i + k;j++)
				{
					System.out.printf("%c",c.charAt(j));
				}
				System.out.print(" ");
				k = 0;
			}
			if (i == 0)
			{
				for (j = i;j < k;j++)
				{
					System.out.printf("%c",c.charAt(j));
				}
			}
		}
	}

}
