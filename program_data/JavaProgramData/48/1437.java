package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] area = new int[9][9];
		int[][] area1 = new int[9][9];
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
		area[4][4] = m;
		int i;
		int j;

		for (int t = 0;t < n;t++)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
				 area1[i][j] = area[i][j];
				}
			}

			for (i = 0;i < 9;i++)
			{
				 for (j = 0;j < 9;j++)
				 {
					 if (area[i][j] != 0)
					 {
						 area1[i - 1][j - 1] += area[i][j];
						 area1[i - 1][j] += area[i][j];
						 area1[i - 1][j + 1] += area[i][j];
							area1[i][j - 1] += area[i][j];
						  area1[i][j] += area[i][j];
						 area1[i][j + 1] += area[i][j];
						 area1[i + 1][j - 1] += area[i][j];
						 area1[i + 1][j] += area[i][j];
						 area1[i + 1][j + 1] += area[i][j];

					 }
				 }
			}


			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
				 area[i][j] = area1[i][j];
				}
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 8;j++)
			{

				System.out.printf("%d ",area[i][j]);
			}
			System.out.printf("%d\n",area[i][8]);
		}

		return 0;
	}

}

