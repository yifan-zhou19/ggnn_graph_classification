package <missing>;

public class GlobalMembers
{
	public static int test(int x)
	{
		int i;
		if (x == 1)
		{
			return 1;
		}
		if (x == 3)
		{
			return 0;
		}
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				return 1;
			}
		}
		return 0;
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i++)
		{
			if (i % 2 == 0)
			{
				for (j = 3;j < n;j++)
				{
					if (test(j) == 0)
					{
						if (test(i - j) == 0)
						{
							System.out.printf("%d=%d+%d\n",i,j,i - j);
							break;
						}
					}
				}
			}
		}


		return 0;
	}

}

