package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int prime = int x;
		int a;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= a;i = i + 2)
		{
			for (j = 2;j <= i;j++)
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

	public static int prime(int x)
	{
		int k;
		if (x == 1)
		{
			return 0;
		}
		else if (x == 2)
		{
			return 1;
		}
		else
		{
			for (k = 2;k <= Math.sqrt(x);k++)
			{
				if (x % k == 0)
				{
					return 0;
				}
			}
			return 1;
		}
	}

}

