package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int[] prime = new int[5200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int primjud = int x;
		for (i = 3;i < n;i = i + 2)
		{
			if (primjud(i) == 0)
			{
				prime[j] = i;
			}
			if (prime[j] != 0)
			{
				j = j + 1;
			}
		}
		int t = j;
		for (i = 6;i <= n;i = i + 2)
		{
			int b = 0;
			for (j = 0;j < t;j++)
			{
				if (primjud(i - prime[j]) == 0)
				{
					b = 1;
					break;
				}
			}
			if (b == 1)
			{
				System.out.printf("%d=%d+%d\n",i,prime[j],i - prime[j]);
			}
		}
		return 0;
	}

	public static int primjud(int x)
	{
		int i;
		int b = 0;
		for (i = 3;i < Math.sqrt(x) + 1;i = i + 2)
		{
			if (x % i == 0)
			{
			b = 1;
			break;
			}
		}
		if (x == 9)
		{
			b = 1;
		}
		if (b == 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}


}

