package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int n;
		int isprime = 1;
		if (x == 1)
		{
			return isprime;
		}
		else
		{
			for (n = 3;n <= Math.sqrt(x);n = n + 2)
			{
				if (x % n == 0)
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
		int y;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= y;i += 2)
		{
			for (k = 3;k <= y;k = k + 2)
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

