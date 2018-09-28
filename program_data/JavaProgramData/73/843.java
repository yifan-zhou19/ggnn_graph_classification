package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int[] maxh = new int[5];
		int[] minl = new int[5];
		int i;
		int j;
		int k = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				   String tempVar = ConsoleInput.scanfRead();
				   if (tempVar != null)
				   {
					   a[i][j] = Integer.parseInt(tempVar);
				   }
				 b[i][j] = a[i][j];
			}
		}
		for (i = 0;i < 5;i++)
		{
			maxh[i] = a[i][0];
			for (j = 1;j < 5;j++)
			{
				maxh[i] = maxh[i] > a[i][j] != 0?maxh[i]:a[i][j];
			}
		}
		for (i = 0;i < 5;i++)
		{
			minl[i] = a[0][i];
			for (j = 1;j < 5;j++)
			{
				minl[i] = minl[i] < a[j][i] != 0?minl[i]:a[j][i];
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (maxh[i] == minl[j])
				{
					System.out.printf("%d %d %d",i + 1,j + 1,maxh[i]);
					k = 1;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("not found");
		}
	}

}

