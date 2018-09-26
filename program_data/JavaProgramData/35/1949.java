package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] sz = new int[N][N];
		char d = ',';
		char e = '+';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			d = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			col = Integer.parseInt(tempVar3);
		}
		int i;
		int j;
		int[] min = new int[N];
		int[] max = new int[N];
		int m = 0;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				if (j == 0)
				{
					max[i] = sz[i][j];

				}
				else
				{
					if (sz[i][j] > max[i])
					{
						max[i] = sz[i][j];
					}
				}
			}
		}
		for (j = 0;j < col;j++)
		{
			for (i = 0;i < row;i++)
			{
				if (i == 0)
				{
					min[j] = sz[i][j];
				}
				else
				{
					if (sz[i][j] < min[j])
					{
						min[j] = sz[i][j];
					}
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				if (sz[i][j] == max[i])
				{
					if (max[i] == min[j])
					{
						System.out.printf("%d%c%d",i,e,j);
						m = 1;
					}
				}
			}
		}
		if (m == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

