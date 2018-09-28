package <missing>;

public class GlobalMembers
{
	public static int isPrime(int n)
	{
		int i;
		if (n % 2 == 0)
		{
			return 0;
		}
		for (i = 3; i <= Math.sqrt(n); i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}

		return 1;
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6; i <= n; i += 2)
		{
			if (isPrime(i - 2) != 0)
			{
				System.out.printf("%d=%d+%d\n", i, 2, i - 2);
			}
			for (j = 3; j < n / 2; j += 2)
			{
				if (isPrime(j) != 0 && isPrime(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n", i, j, i - j);
					break;
				}
			}
		}
		return 0;
	}
}

