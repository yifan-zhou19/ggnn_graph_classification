package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int m = 5;m <= n;m++)
		{
			l = 0;
			for (int i = 2;i < m;i++)
			{
				if (m % i == 0)
				{
				l++;
				}
			}
			int a = 0;
			if (l == 0)
			{
				for (int k = 2;k < m - 2;k++)
				{
					if ((m - 2) % k == 0)
					{
					a++;
					}
				}
			}
			if (a == 0 && l == 0)
			{
			System.out.printf("%d %d\n",m - 2,m);
			b++;
			}
		}
		if (b == 0)
		{
		System.out.print("empty");
		}

	}
}

