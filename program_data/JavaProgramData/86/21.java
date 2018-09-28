package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			int x;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		int[] s = new int[20];
		for (int k = 0;k < x;k++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[k] = Integer.parseInt(tempVar3);
			}
		}
		int t;
	int m = x;
	if (s[m - 1] + m * 3 <= 60)
	{
	t = 60 - 3 * m;
	}
	else
	{
		while (s[m - 1] + m * 3 - 3 > 60)
		{
		m = m - 1;
		}
	if (s[m - 1] + m * 3 - 3 >= 57)
	{
	t = s[m - 1];
	}
	else
	{
	t = 60 - 3 * m;
	}
	}
	System.out.printf("%d\n",t);

		}
		return 0;
	}
}

