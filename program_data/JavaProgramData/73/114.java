package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int row;
		int col;
		int an;
		int i;
		for (row = 0;row < 5;row++)
		{
			for (col = 0;col < 5;col++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[row][col] = Integer.parseInt(tempVar);
				}
			}
		}
		int max;
		int min;
		int flag = 1;
		int k = 1;
		for (row = 0;row < 5;row++)
		{
			for (col = 0;col < 5;col++)
			{
				flag = 1;
				max = a[row][col];
				min = max;
				for (i = 0;i < 5;i++)
				{
					if (a[row][i] > max)
					{
						flag = 0;
						break;
					}
					if (a[i][col] < min)
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					System.out.printf("%d %d %d",row + 1,col + 1,a[row][col]);
					k = 0;
				}
			}
		}
		if (k != 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

