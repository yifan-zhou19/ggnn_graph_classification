package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String c = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		int i;
		int j;
		int t;
		int n;
		int sum;
		int l;
		j = 0;
		l = c.length();
		for (n = 65;n <= 90;n++)
		{
			t = n;
			sum = 0;
			for (i = 0;i < l;i++)
			{
				if (t == c.charAt(i))
				{
					sum = sum + 1;
				}
			}
			if (sum >= 1)
			{
				System.out.printf("%c=%d\n",n,sum);
				j = j + 1;
			}

		}
		for (n = 97;n <= 122;n++)
		{
			t = n;
			sum = 0;
			for (i = 0;i < l;i++)
			{
				if (t == c.charAt(i))
				{
					sum = sum + 1;
				}
			}
			if (sum >= 1)
			{
				System.out.printf("%c=%d\n",n,sum);
				j = j + 1;
			}
		}
		if (j == 0)
		{
			System.out.print("No");
		}
	}
}

