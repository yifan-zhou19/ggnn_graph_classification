package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int prime = int;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n / 2;i++)
		{
			if (prime(i) != 0 && prime(n - i) != 0)
			{
				System.out.printf("%d %d\n",i,n - i);
			}
		}

	}

	public static int prime(int n)
	{
		int i;
		int a = 1;
		for (i = 2;i <= Math.sqrt(n) && a == 1;i++)
		{
			if (n % i == 0)
			{
				a = 0;
			}
		}
		return (a);
	}
}

