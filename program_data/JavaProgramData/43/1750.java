package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i++)
		{
			t = 0;
			p = 0;
			for (j = 2;j <= i / 2 + 1;j++)
			{
				while (t == 0)
				{
					if (i % j == 0)
					{
						t = 1;
					}
					break;
				}
				if (t == 1)
				{
					break;
				}
			}
			for (j = 2;j <= (n - i) / 2 + 1;j++)
			{
				while (p == 0)
				{
					if ((n - i) % j == 0)
					{
						p = 1;
					}
					break;
				}
				if (p == 1)
				{
					break;
				}
			}
			if (t == 0 && p == 0)
			{
				System.out.printf("%d %d\n",i,n - i);
			}
		}
		return 0;
	}
}

