package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int prime = 1;
		int i;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				prime = 0;
				break;
			}
		}
		return prime;
	}

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 3;j <= i / 2;j = j + 2)
			{
				if (prime(j) == 1 && prime(i - j) == 1)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
		return 0;
	}
}

