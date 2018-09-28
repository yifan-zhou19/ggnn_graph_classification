package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[ROW][COL];
		int i;
		int j;
		int k;
		int l;
		int row;
		int col;
		int a = 0;
		int b = 0;
		int c = 0;
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
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}

			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				for (k = 0;k < col;k++)
				{
					if (sz[i][j] < sz[i][k])
					{
						break;
					}
					if (sz[i][j] >= sz[i][k])
					{
						a++;
					}
					if (a == col)
					{
						for (l = 0;l < row;l++)
						{
							if (sz[i][j] > sz[l][j])
							{
								break;
							}
							if (sz[i][j] <= sz[l][j])
							{
								 b++;
							}
							if (b == row)
							{
								System.out.printf("%d+%d",i,j);
								c = 1;
							}
						}
					}

				}
			}
		}
		if (c != 1)
		{
			System.out.print("No");
		}
		return 0;
	}


}

