package <missing>;

public class GlobalMembers
{
	public static int isprime(int p)
	{
		int q;
		int m;
		if (p % 2 == 0)
		{
			return 0;
		}
		m = Math.sqrt(p);
		for (q = 3;q <= m;q += 2)
		{
			if (p % q == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static void Main()
	{
		int n;
		int p;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 6;i <= n;i += 2)
		{
			for (p = 3;p <= i / 2;p += 2)
			{
				if (isprime(p) != 0 && isprime(i - p) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,p,i - p);
					break;
				}
			}
		}
	}

}

