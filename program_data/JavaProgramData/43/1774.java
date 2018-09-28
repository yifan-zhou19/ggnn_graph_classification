package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int judge;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i * 2 <= m;i += 2)
		{
			judge = 1;
			for (k = 3;k * 3 <= i;k += 2)
			{
				if (i % k == 0)
				{
					judge = 0;
				}
			}
			if (judge != 0)
			{
				j = m - i;
				for (k = 3;k * 3 <= j;k += 2)
				{
					 if (j % k == 0)
					 {
						 judge = 0;
					 }
				}
			}
			if (judge != 0)
			{
				System.out.printf("%d %d\n",i,j);
			}
		}
		return 0;
	}
}

