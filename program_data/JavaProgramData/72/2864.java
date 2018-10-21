package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int x;
		int[][] shandi = new int[LEN][WIDTH];
		int[][] shanding = new int[LEN][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(shandi[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j < m + 2;j++)
		{
			shandi[j][0] = 0;
		}
		for (j = 0;j < m + 2;j++)
		{
			shandi[j][n + 1] = 0;
		}
		for (j = 0;j < n + 2;j++)
		{
			shandi[0][j] = 0;
		}
		for (j = 0;j < n + 2;j++)
		{
			shandi[m + 1][j] = 0;
		}
		x = 0;
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (shandi[i][j] >= shandi[i][j - 1] != 0 && shandi[i][j] >= shandi[i][j + 1] != 0 && shandi[i][j] >= shandi[i - 1][j] != 0 && shandi[i][j] >= shandi[i + 1][j])
				{
					shanding[x][0] = i - 1;
					shanding[x][1] = j - 1;
					x++;
				}
			}
		}
		for (i = 0;i < x;i++)
		{
			System.out.printf("%d %d\n",shanding[i][0],shanding[i][1]);
		}
		return 0;
	}



}

