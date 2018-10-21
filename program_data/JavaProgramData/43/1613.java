package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int flag;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i++)
		{
			flag = 1;
			for (j = 2;j < i;j++)
			{
				if (i % j != 0)
				{
					flag *= 1;
				}
				else
				{
					flag *= 0;
				}
			}
			if (flag == 1)
			{
				t = m - i;
				flag = 1;
				for (j = 2;j < m - i;j++)
				{
					if ((m - i) % j != 0)
					{
						flag *= 1;
					}
					else
					{
						flag *= 0;
					}
				}
				if (flag == 1)
				{
					System.out.printf("%d %d\n",i,m - i);
				}
			}
		}
		return 0;
	}




}

