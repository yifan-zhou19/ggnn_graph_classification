package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		flag = 1;
		for (i = 3;i <= n / 2;i = i + 2)
		{
			for (j = 2;j <= i - 1;j++)
			{
				if (i % j == 0)
				{
					flag = -1;
					break;
				}
				flag = 1;
			}
			if (flag == 1)
			{
				m = n - i;
				for (j = 2;j <= m - 1;j++)
				{
					if (m % j == 0)
					{
						flag = -1;
						break;
					}
					flag = 1;
				}
			}
			if (flag == 1)
			{
				System.out.printf("%d %d\n",i,m);
			}
		}
		return 0;
	}
}

