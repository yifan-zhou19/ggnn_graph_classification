package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //???? i???k??
		int k;
		int x;
		int y;
		int r = 0; //???? ??????
		int c = 0;
		int[][] a = new int[5][5]; //??
		int w = 0; //??

		for (r = 0;r < 5;r++)
		{
			for (c = 0;c < 5;c++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[r][c] = Integer.parseInt(tempVar);
				}
			}

		}
		for (i = 0;i < 5;i++)
		{
			for (k = 0;k < 5;k++)
			{
				if (a[i][k] >= a[i][1] != 0 && a[i][k] >= a[i][2] != 0 && a[i][k] >= a[i][3] != 0 && a[i][k] >= a[i][4] != 0 && a[i][k] >= a[i][0])
				{
					if (a[i][k] <= a[0][k] != 0 && a[i][k] <= a[1][k] != 0 && a[i][k] <= a[2][k] != 0 && a[i][k] <= a[3][k] != 0 && a[i][k] <= a[4][k])
					{
						x = i + 1;
						y = k + 1;
						System.out.printf("%d %d %d\n",x,y,a[i][k]);

						w = 1;
					}
				}
			}
		}
		if (w == 0)
		{
			System.out.print("not found");
		}

		return 0;
	}
}

