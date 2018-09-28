package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		int m = 0;
		if (n == 0)
		{
			return 0;
		}
		if (n == 1)
		{
			return 0;
		}
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				m = m + 1;
			}
		}
		if (m != 0)
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
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (t = 6;t <= n;t = t + 2)
		{
			for (i = 1;i <= t / 2;i++)
			{
				j = 1;
				if (sushu(i) != 0)
				{
					j = t - i;
					if (sushu(j) != 0)
					{
						System.out.printf("%d=%d+%d\n",t,i,j);
						break;
					}
				}
			}
		}
		return 0;
	}
}

