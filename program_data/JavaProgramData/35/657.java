package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;
		int f1;
		int f2;
		int f3;
		int f4 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[8][8];
		int i;
		int j;
		int m;
		int n;
		for (i = 0;i <= h - 1;i++)
		{
			for (j = 0;j <= l - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= h - 1;i++)
		{
			for (j = 0;j <= l - 1;j++)
			{
				f1 = 1;
				f2 = 1;
				for (m = 0;m <= h - 1;m++)
				{
					if (sz[m][j] < sz[i][j])
					{
						f1 = 0;
					}
				}
				for (n = 0;n <= l - 1;n++)
				{
					if (sz[i][n] > sz[i][j])
					{
						f2 = 0;
					}
				}
				f3 = f1 * f2;
				if (f3 == 1)
				{
					System.out.printf("%d+%d",i,j);
					f4 = 1;

				}
			}
		}
		if (f4 == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

