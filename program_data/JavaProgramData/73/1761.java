package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] x = new int[5][5];
		int[] max = new int[5];
		int[] min = new int[5];
		int i;
		int j;
		int t;
		int k = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					x[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			t = 0;
			for (j = 0;j < 5;j++)
			{
				if (x[i][j] > t)
				{
					t = x[i][j];
				}
			}
			max[i] = t;
		}
		for (i = 0;i < 5;i++)
		{
			t = x[0][i];
			for (j = 0;j < 5;j++)
			{
				if (x[j][i] < t)
				{
					t = x[j][i];
				}
			}
			min[i] = t;
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (x[i][j] == max[i] && x[i][j] == min[j])
				{
					k = 1;
					System.out.printf("%d %d %d",i + 1,j + 1,x[i][j]);
				}
			}
		}
		if (k == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

