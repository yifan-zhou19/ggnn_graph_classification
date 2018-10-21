package <missing>;

public class GlobalMembers
{
	public static int SS(int i)
	{
		int k;
		for (k = 2;k <= i - 1;k++)
		{
			if (i % k == 0)
			{
				break;
			}
		}
			if (k < i)
			{
				return 0;
			}
			else
			{
				return 1;
			}
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i++)
		{
			if (SS(i) != 0 && SS(n - i) != 0)
			{
				System.out.printf("%d %d\n",i,n - i);
			}
		}
	}
}

