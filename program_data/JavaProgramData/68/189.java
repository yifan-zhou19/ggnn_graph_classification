package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 6;
		int n;
		int odd;
		int prime = int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (m <= n)
		{
			odd = 3;
			while (odd < m)
			{
				if (prime(odd) == 1)
				{
					if (prime(m - odd) == 1)
					{
						System.out.printf("%d=%d+%d\n", m, odd, m - odd);
						break;
					}
					else
					{
						odd += 2;
					}
				}
				else
				{
					odd += 2;
				}
			}
			m += 2;
		}
		return 0;
	}

	public static int prime(int x)
	{
		int i;
		for (i = 3;i <= Math.sqrt(x) + 1;i += 2)
		{
			if (x % i == 0)
			{
				return 0;
			}

		}
		return 1;
	}


}

