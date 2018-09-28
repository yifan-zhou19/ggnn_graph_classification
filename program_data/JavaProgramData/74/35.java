package <missing>;

public class GlobalMembers
{
	public static char ishw(int m)
	{
		int p = 1;
		int m0 = m;
		while (m0 > 9)
		{
			m0 /= 10;
			p *= 10;
		}
		while (m >= 1 && p > 0)
		{
			if ((m % 10) != m / p)
			{
				return 0;
			}
			m = (m % p) / 10;
			p /= 100;
		}
		return 1;
	}

	public static char isprime(int m)
	{
		int p;
		int sm;
		if (!(m % 2) || m == 1)
		{
			return 0;
		}
		sm = Math.sqrt(m);
		for (p = 3;p <= sm;p += 2)
		{
			if ((m % p) == 0)
			{
				break;
			}
		}
		return (p > sm);
	}


	public static void Main()
	{
		int m;
		int n;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (;m <= n;m++)
		{
			if (isprime(m) && ishw(m))
			{
				if (c != 0)
				{
					System.out.print(',');
				}
				else
				{
					c = 1;
				}
				System.out.printf("%d",m);
			}
		}
		if (c == 0)
		{
			System.out.println("no");
		}
	}

}

