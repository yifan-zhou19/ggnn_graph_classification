package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int x;
		int y;
		int z;
		int s;
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
		s = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if ((a[i][j] >= a[i][0]) && (a[i][j] >= a[i][1]) && (a[i][j] >= a[i][2]) && (a[i][j] >= a[i][3]) && (a[i][j] >= a[i][4]))
				{
					if ((a[i][j] <= a[0][j]) && (a[i][j] <= a[1][j]) && (a[i][j] <= a[2][j]) && (a[i][j] <= a[3][j]) && (a[i][j] <= a[4][j]))
					{
						x = i + 1;
						y = j + 1;
						System.out.printf("%d %d %d",x,y,a[i][j]);
						s++;
					}
				}
			}
		}
		if (s == 0)
		{
			System.out.print("not found");
		}



		return 0;
	}

}

