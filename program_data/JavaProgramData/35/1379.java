package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int array;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			array = Integer.parseInt(tempVar2);
		}
		int[][] matrix = new int[9][9];
		int i = 0;
		for (i = 0;i < row;i++)
		{
			int j = 0;
			for (j = 0;j < array;j++)
			{
				if (j == 0)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						matrix[i][j] = Integer.parseInt(tempVar3);
					}
				}
				else
				{
					String tempVar4 = ConsoleInput.scanfRead(" ");
					if (tempVar4 != null)
					{
						matrix[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
		}
		int[] max_row = new int[9];
		int[] min_array = new int[9];
		int k = 0;
		int max_mark = 0;
		for (k = 0;k < row;k++)
		{
			max_row[k] = matrix[k][0];
			int l = 0;
			for (l = 0;l < array;l++)
			{
				if (max_row[k] < matrix[k][l])
				{
					max_row[k] = matrix[k][l];
					max_mark = l;
				}
			}
			min_array[k] = max_row[k];
			int m = 0;
			int min_mark = 0;
			for (m = 0;m < row;m++)
			{
				if (min_array[k] > matrix[m][max_mark])
				{
					min_array[k] = matrix[m][max_mark];
					min_mark = m;
				}
			}
			if (max_row[k] == min_array[k])
			{
				System.out.printf("%d+%d",min_mark,max_mark);
				break;
			}
			else
			{
				if (k == row - 1)
				{
					System.out.print("No");
				}
			}
		}
	}

}

