package <missing>;

public class GlobalMembers
{
	public static int isprime(double n)
	{
		int s;
		int i;
		if (n < 2)
		{
			return 0;
		}
		s = (double)Math.sqrt(n);
		for (i = 2;i <= s;++i)
		{
			if ((int)n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main()
	{
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		 for (i = 6; i <= n; i += 2)
		 {
			for (j = 2; j <= i / 2; ++j)
			{
				if (isprime(j) != 0 && isprime(i - j) != 0)
				{
					 System.out.printf("%ld=%ld+%ld\n", i, j, i - j);
					 break;
				}
			}
		 }
	}
}

