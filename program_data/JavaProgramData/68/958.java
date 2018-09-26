package <missing>;

public class GlobalMembers
{
	public static int su(int x)
	{
		int m;
		if (x == 2)
		{
			return 1;
		}
		else if (x % 2 == 0)
		{
			return 0;
		}
		else
		{
		for (m = 2;m * m <= x;m++)
		{
			if (x % m == 0)
			{
				return 0;
			}
		}
		return 1;
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 2 == 0)
		{
			for (i = 6;i <= n;i += 2)
			{
				for (j = 3;j <= i / 2;j++)
				{
					if (su(j) != 0)
					{
						k = i - j;
						if (su(k) != 0)
						{
							System.out.printf("%d=%d+%d\n",i,j,k);
							break;
						}
					}
				}
			}
		}
		else
		{
			for (i = 6;i < n;i += 2)
			{
				for (j = 2;j < i;j++)
				{
					if (su(j) != 0)
					{
						k = i - j;
						if (su(k) != 0)
						{
							System.out.printf("%d=%d+%d\n",i,j,k);
							break;
						}
					}
				}

			}
		}
		return 0;
	}


}

