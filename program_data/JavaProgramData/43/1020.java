package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int flag1;
		int flag2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (n = 2;n <= m / 2;n++)
		{
			flag1 = 0;
			flag2 = 0;
			for (i = 2;i < n;i++)
			{
				if (n % i == 0)
				{
					flag1 = 1;
					break;
				}
			}

			for (j = 2;j < m - n;j++)
			{
				if ((m - n) % j == 0)
				{
					flag2 = 1;
					break;
				}
			}
			if (flag1 == 0 && flag2 == 0)
			{
				System.out.printf("%d %d\n",n,m - n);
			}
		}
	}
}

