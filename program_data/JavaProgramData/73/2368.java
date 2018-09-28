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
		int t = 0;


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
				m = 0;
				n = 0;
	 if (a[i][j] >= a[i][0] != 0 && a[i][j] >= a[i][1] != 0 && a[i][j] >= a[i][2] != 0 && a[i][j] >= a[i][3] != 0 && a[i][j] >= a[i][4])
	 {
					m = 8;
	 }
				if (a[i][j] <= a[0][j] != 0 && a[i][j] <= a[1][j] != 0 && a[i][j] <= a[2][j] != 0 && a[i][j] <= a[3][j] != 0 && a[i][j] <= a[4][j])
				{
					n = 8;
				}

				if (m == 8 && n == 8)
				{
					System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
				   t = 8;
				}
			}
		}

		if (t == 0)
		{
			System.out.print("not found");
		}


		return 0;
	}

}

