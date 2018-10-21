package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] sz = new int[500][500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		int mincol = n;
		int minrow = n;
		int maxcol = 0;
		int maxrow = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] == 0)
				{
					if (i < mincol)
					{
						mincol = i;
					}
					if (j < minrow)
					{
						minrow = j;
					}
					if (i > maxcol)
					{
						maxcol = i;
					}
					if (j > maxrow)
					{
						maxrow = j;
					}
				}
			}
		}
		int zong;
		zong = (maxcol - mincol - 1) * (maxrow - minrow - 1);
		System.out.printf("%d",zong);
		return 0;
	}
}

