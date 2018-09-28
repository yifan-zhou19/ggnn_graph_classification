package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i += 2)
		{
			flag = 0;
			for (k = 3;k <= Math.sqrt(i);k += 2)
			{
				if (i % k == 0)
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				for (j = 3;j <= Math.sqrt(m - i);j += 2)
				{
					if ((m - i) % j == 0)
					{
						flag = 1;
					}
				}
				if (flag == 0)
				{
					System.out.printf("%d %d\n",i,m - i);
				}
			}
		}
		return 0;
	}
}

