package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			for (k = 2;k < n - i;k++)
			{
				if ((n - i) % k == 0)
				{
					break;
				}
			}
			if (j == i && k == n - i)
			{
			   System.out.printf("%d %d\n",i,n - i);
			}
		}
		System.in.read();
		System.in.read();
	}
}

