package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum;
		int i;
		int j;
		int starti;
		int startj;
		int endi;
		int endj;
		int[][] a = new int[10][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		starti = -1;
		startj = -1;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					starti = i;
					startj = j;
					break;
				}
			}
			if (starti >= 0)
			{
				break;
			}
		}
		endi = starti;
		endj = startj;
		while (a[starti][endj + 1] == 0)
		{
			endj++;
		}
		while (a[endi + 1][startj] == 0)
		{
			endi++;
		}
		System.out.printf("%d", (endi - starti - 1) * (endj - startj - 1));

		return 0;
	}
}

