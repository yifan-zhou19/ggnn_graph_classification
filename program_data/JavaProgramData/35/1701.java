package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a =
		{
			{-1, 0, 0, 0, 0, 0, 0, 0}
		};
		int row;
		int col;
		int i;
		int j;
		int k;
		int max;
		int maxRow;
		int maxCol;
		int flag = 0;
		int result = 0;

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

		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0; i < row; i++)
		{
			max = a[i][0];
			for (j = 0; j < col; j++)
			{
				if (max <= a[i][j])
				{
					max = a[i][j];
					maxCol = j;
				}
			}
			flag = 1;
			for (k = 0; k < row; k++)
			{
				if (max > a[k][maxCol])
				{
					flag = 0;
				}
			}
			if (flag == 1)
			{
				result = 1;
				System.out.printf("%d+%d\n",i,maxCol);
			}
		}
		if (result == 0)
		{
			System.out.print("No");
		}

		return 0;
	}
}

