package <missing>;

public class GlobalMembers
{
	public static int is_prime(int n)
	{
		int i;
		if (n == 1)
		{
			return (0);
		}
		for (i = 2;i <= Math.sqrt(n);)
		{
			if (n % i == 0)
			{
				return (0);

			}
			else
			{
				i++;
			}

		}
		return (1);

	}

	public static int Main()
	{
		int k;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 6;k <= n;k = k + 2)
		{
			for (i = 2;i <= k / 2;i++)
			{
				if (is_prime(i) == 1 && is_prime(k - i) == 1)
				{
					break;
				}
			}
			System.out.printf("%d=%d+%d\n",k,i,k - i);

		}

	}
}

