package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[300]);
		int i;
		int j;
		int n;
		int count;
		int count1 = 0;
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (i = 65;i < 91;i++)
		{
			count = 0;
			for (j = 0;j < n;j++)
			{
				if (i == c.charAt(j))
				{
					count += 1;
				}
			}
			if (count != 0)
			{
				System.out.printf("%c=%d\n\n",i,count);
				count1 += 1;
			}
		}
		for (i = 97;i < 123;i++)
		{
			count = 0;
			for (j = 0;j < n;j++)
			{
				if (i == c.charAt(j))
				{
					count += 1;
				}
			}
			if (count != 0)
			{
				System.out.printf("%c=%d\n\n",i,count);
				count1 += 1;
			}
		}
		if (count1 == 0)
		{
			System.out.print("No\n");
		}
	}
}
