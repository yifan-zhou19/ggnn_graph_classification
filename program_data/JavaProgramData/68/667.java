package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int j;
		for (j = 2;j <= Math.sqrt(n);j++)
		{
			if (n % j == 0)
			{
				break;
			}
		}
			if (j > Math.sqrt(n))
			{
				return 1;
			}
			else
			{
				return 0;
			}
	}

	public static int print(int n,int i)
	{
		System.out.printf("%d=%d+%d\n",n,i,n - i);
		return 0;
	}

	public static int Main()
	{
		int k;
		int i;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 6;k <= n;k = k + 2)
		{
		if (prime(k - 2) == 1)
		{
			print(k, 2);
		}
		else
		{
			for (i = 3;i <= k / 2;i = i + 2)
			{
				if (prime(i) == 1 && prime(k - i) == 1)
				{
					print(k, i);
					break;
				}
			}
		}
		}
		return 0;
	}
}

