package <missing>;

public class GlobalMembers
{
	public static int prime(int p)
	{
		int m;
		int isprime = 1;
		if (p == 1)
		{
			return isprime;
		}
		else
		{
			for (m = 3;m <= Math.sqrt(p);m += 2)
			{
				if (p % m == 0)
				{
					isprime = 0;
					return isprime;
					break;
				}
			}
		}
		return isprime;
	}
	public static int Main()
	{
		int n;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (k = 3;k <= n;k += 2)
			{
				if (prime(k) + prime(i - k) == 2)
				{
					System.out.printf("%d=%d+%d\n",i,k,i - k);
					break;
				}
			}
		}
		return 0;
	}
}

