package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int prime = int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 3;i <= n - 2;i += 2)
			{
				if (prime(i) == 1 && prime(i + 2) == 1)
				{
					System.out.printf("%d %d\n",i,i + 2);
				}
			}
		}
		return 0;
	}

	public static int prime(int n)
	{
		if (n == 1)
		{
			return 0;
		}
		int i;
		int m;
		m = Math.sqrt(n);
		for (i = 2;i <= m;i++)
		{
			if (n % i == 0)
			{
				break;
			}
		}
		if (i > m)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

