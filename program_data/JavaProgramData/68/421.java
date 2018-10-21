package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (k = 3;k <= i / 2;k = k + 2)
			{
				m = i - k;
				for (p = 3;p <= Math.sqrt(k);p = p + 2)
				{
					if (k % p == 0)
					{
						break;
					}
				}
				for (q = 3;q <= Math.sqrt(m);q = q + 2)
				{
					if (m % q == 0)
					{
						break;
					}
				}
				if (p >= (((int)Math.sqrt(k)) + 1) && q >= (((int)Math.sqrt(m)) + 1))
				{
					System.out.printf("%ld=%ld+%ld\n",i,k,m);
					break;
				}
				else
				{
					continue;
				}
			}
		}
	}
}

