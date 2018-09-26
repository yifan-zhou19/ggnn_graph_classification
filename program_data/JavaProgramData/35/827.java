package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] n = new int[8][8];
		int w;
		int k;
		int e;
		char a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			col = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					n[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				for (w = 0;w < col;w++)
				{
					if (n[i][j] < n[i][w])
					{
						break;
					}
					else if (w == col - 1 && n[i][j] >= n[i][col - 1])
					{
						for (e = 0;e < row;e++)
						{
							if (n[i][j] > n[e][j])
							{
								break;
							}
							else if (e == row - 1 && n[i][j] <= n[row - 1][j])
							{
								System.out.printf("%d+%d",i,j);
								return 0;
							}
						}
					}
				}
			}
		}
		System.out.print("No");
	}



}

