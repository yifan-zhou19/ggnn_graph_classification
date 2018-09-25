package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] matrix = new int[5][5];
		for (int i = 0;i <= 4;i++)
		{
			for (int m = 0;m <= 4;m++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					matrix[i][m] = Integer.parseInt(tempVar);
				}
			}
		}
		int c = 0;
		for (int n = 0;n <= 4;n++)
		{
			for (int l = 0;l <= 4;l++)
			{
					int max = matrix[n][l];
					for (int a = 0;a <= 4;a++)
					{
							if (matrix[n][a] > max)
							{
							max = matrix[n][a];
							}
							else
							{
							max = max;
							}
					}
					int min = matrix[n][l];
					for (int b = 0;b <= 4;b++)
					{
							if (matrix[b][l] < min)
							{
							min = matrix[b][l];
							}
							else
							{
							min = min;
							}
					}
					if (max == matrix[n][l] && min == matrix[n][l])
					{
					System.out.printf("%d %d %d",n + 1,l + 1,max);
					c++;
					}
			}
		}
		if (c == 0)
		{
		System.out.print("not found");
		}

	}
}

