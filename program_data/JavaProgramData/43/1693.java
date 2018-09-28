package <missing>;

public class GlobalMembers
{
	public static int isPrime(int x)
	{
		int i;
		for (i = 2;i * i <= x;i++)
		{
			if (x % i == 0)
			{
				return 0;
			}
		}

		return 1;
	}

	public static int Main()
	{
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (i = 3;i <= m / 2;i += 2)
		{
			if (isPrime(i) != 0 && isPrime(m - i) != 0)
			{
				System.out.printf("%d %d\n",i,m - i);
			}
		}

		return 0;
	}
}

