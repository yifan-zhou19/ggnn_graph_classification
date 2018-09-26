package <missing>;

public class GlobalMembers
{
	public static int isprime(int n)
	{
		int i;
		if (n % 2 == 0)
		{
			return 0;
		}
		for (i = 3; (i * i) <= n; i += 2)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static int ishuiwen(int n)
	{
		int h = 0;
		int m = n;
		while (m > 0)
		{
			h = h * 10 + m % 10;
			m /= 10;
		}
		return (h == n);
	}

	public static int Main()
	{
		int count = 0;
		int i;
		int m;
		int n;
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
		for (i = m; i <= n; i++)
		{
			if (isprime(i) != 0 && ishuiwen(i) != 0)
			{
				count++;
				if (count == 1)
				{
					System.out.printf("%d", i);
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
		}
		if (count == 0)
		{
			System.out.print("no");
		}
		return 0;
	}



}

