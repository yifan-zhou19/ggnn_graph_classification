package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int b;
		int t;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i = i + 2)
		{
			t = n - i;
			b = 1;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					b = 0;
				}
			}
			for (j = 2;j < t;j++)
			{
				if (t % j == 0)
				{
					b = 0;
				}
			}
			if (b == 1)
			{
				System.out.printf("%d %d\n",i,t);
			}
		}
		return 0;
	}
}

