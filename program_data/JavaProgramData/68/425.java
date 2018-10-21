package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int prime = int x;
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i++)
		{
			if (i % 2 == 0)
			{
				for (j = 2;j <= i / 2;j++)
				{
					k = i - j;
					if (prime(j) == 1 && prime(k) == 1)
					{
						System.out.printf("%d=%d+%d\n",i,j,k);
						break;
					}
				}
			}
		}
	}
	public static int prime(int x)
	{
		int i;
		int k;
		if (x == 2)
		{
			return 1;
		}
		k = Math.sqrt(x);
		for (i = 2;i <= k;i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i > k)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}

