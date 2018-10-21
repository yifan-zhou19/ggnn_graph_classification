package <missing>;

public class GlobalMembers
{
	public static int isprime(int n)
	{
		int i;
		if (n == 2 || n == 3 || n == 5 || n == 7)
		{
			return 1;
		}
		else
		{
			if (n == 1 || n == 4 || n == 6 || n == 8 || n == 9 || n == 10)
			{
				return 0;
			}
			else
			{
				for (i = 2;i <= Math.sqrt(n);i++)
				{
					if (n % i == 0)
					{
						break;
					}
				}
				if (i > Math.sqrt(n))
				{
					return 1;
				}
				return 0;
			}
		}
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
		for (i = 6;i <= n;i += 2)
		{
			for (j = 2;j < i;j++)
			{
				if (isprime(j) != 0 && isprime(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
		return 0;
	}
}

