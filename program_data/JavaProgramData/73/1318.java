package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int flag1 = 0;
		int flag2 = 0;
		int flag = 0;
		int x;
		int y;
		int k;
		for (i = 1;i < 6;i++)
		{
			for (j = 1;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
			for (i = 1;i < 6;i++)
			{
				for (j = 1;j < 6;j++)
				{
					if (a[i][j] >= a[i][1] != 0 && a[i][j] >= a[i][2] != 0 && a[i][j] >= a[i][3] != 0 && a[i][j] >= a[i][4] != 0 && a[i][j] >= a[i][5] != 0 && a[i][j] <= a[1][j] != 0 && a[i][j] <= a[2][j] != 0 && a[i][j] <= a[3][j] != 0 && a[i][j] <= a[4][j] != 0 && a[i][j] <= a[5][j])
					{
						flag = -1;
						x = i;
						y = j;
					}
				}
			}
			if (flag == -1)
			{
				System.out.printf("%d %d %d",x,y,a[x][y]);
			}
			else
			{
				System.out.print("not found");
			}
		return 0;
	}
}

