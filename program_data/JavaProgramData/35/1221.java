package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[100][100];
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		int m;
		int n;
		int k = 0;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				n = 0;
				for (m = 0;m < col;m++)
				{
					if (sz[i][m] > sz[i][j])
					{
						n++;
					}
				}
				for (m = 0;m < row;m++)
				{
					if (sz[m][j] < sz[i][j])
					{
						n++;
					}
				}
				if (n == 0)
				{
					System.out.printf("%d+%d",i,j);
					k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

