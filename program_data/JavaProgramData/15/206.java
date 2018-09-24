package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[][] area = new int[n][n];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					area[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		k = 0;
		int ib = 0;
		int jb = 0;
		int ie = 0;
		int je = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (area[i][j] == 0)
				{
					k++;
					if (k == 1)
					{
						ib = i;
						jb = j;
						break;
					}
				}
			}
		}
		k = 0;
		for (i = m - 1 ; i >= 0 ; i--)
		{
			for (j = m - 1 ; j >= 0 ; j--)
			{
				if (area[i][j] == 0)
				{
					k++;
					if (k == 1)
					{
						ie = i;
						je = j;
						break;
					}
				}
			}
		}
		s = (ie - ib - 1) * (je - jb - 1);
		System.out.printf("%d\n",s);
		return 0;
	}
}

