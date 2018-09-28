package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int x;
		int y;
		int count = 0;
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
		}
		}
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
			if (a[i][j] >= a[i][0] != 0 && a[i][j] >= a[i][1] != 0 && a[i][j] >= a[i][2] != 0 && a[i][j] >= a[i][3] != 0 && a[i][j] >= a[i][4] != 0 && a[i][j] <= a[0][j] != 0 && a[i][j] <= a[1][j] != 0 && a[i][j] <= a[2][j] != 0 && a[i][j] <= a[3][j] != 0 && a[i][j] <= a[4][j])

			{
				x = i + 1;
				y = j + 1;
				System.out.printf("%d %d %d\n",x,y,a[i][j]);
				count++;
			}
		}
		}
			if (count == 0)
			{
			System.out.print("not found");
			}
	}

}

