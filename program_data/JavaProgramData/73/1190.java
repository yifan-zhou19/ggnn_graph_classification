package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int[][] matrix = new int[5][5];
		int[] max = new int[5];
		int[] min = new int[5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					matrix[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			max[i] = matrix[i][0];
			min[i] = matrix[0][i];
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (matrix[i][j] > max[i])
				{
					max[i] = matrix[i][j];
				}
			}
		}
		for (j = 0;j < 5;j++)
		{
			for (i = 0;i < 5;i++)
			{
				if (matrix[i][j] < min[j])
				{
					min[j] = matrix[i][j];
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (max[i] == min[j])
				{
					k = 1;
					System.out.printf("%d %d %d",i + 1,j + 1,min[j]);
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

