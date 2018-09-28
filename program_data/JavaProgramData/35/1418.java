package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] number = new int[7][7];
		int row;
		int col;
		int i;
		int j;
		int m;
		int sum1 = 0;
		int sum2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					number[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				sum1 = 0;
				sum2 = 0;
				for (m = 0;m < col;m++)
				{
					if (number[i][j] >= number[i][m])
					{
						sum1 += 1;
					}
				}
				for (m = 0;m < row;m++)
				{
					if (number[i][j] <= number[m][j])
					{
						sum2 += 1;
					}
				}
				if (sum1 == col && sum2 == row)
				{
					System.out.printf("%d+%d",i,j);
					break;
				}
			}
			if (sum1 == col && sum2 == row)
			{
				break;
			}
		}
		if (sum1 != col || sum2 != row)
		{
			System.out.print("No");
		}
		return 0;
	}
}

