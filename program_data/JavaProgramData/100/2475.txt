package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[310]);
		final String d = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String x = "abcdefghijklmnopqrstuvwxyz";
		int[] dd = new int[27];
		int[] xx = new int[27];
		int i;
		int j;
		int flag = 0;
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < c.length();j++)
			{
				if (c.charAt(j) == d.charAt(i))
				{
					dd[i] += 1;
				}
				if (c.charAt(j) == x.charAt(i))
				{
					xx[i] += 1;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (dd[i] > 0)
			{
			System.out.printf("%c=%d\n",d.charAt(i),dd[i]);
			flag = 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (xx[i] > 0)
			{
			System.out.printf("%c=%d\n",x.charAt(i),xx[i]);
			flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}

	}
}
