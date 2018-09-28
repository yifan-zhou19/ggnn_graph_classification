package <missing>;

public class GlobalMembers
{
	public static int isprime(int n)
	{
		int i;
		for (i = 2;i * i <= n;i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static void Main(String[] args)
	{
		int m;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (j = 3;j * 2 <= m;j += 2)
		{
			if (isprime(j) != 0 && isprime(m - j) != 0)
			{
				System.out.printf("%d %d\n",j,(m - j));
			}
		}

	}
}

