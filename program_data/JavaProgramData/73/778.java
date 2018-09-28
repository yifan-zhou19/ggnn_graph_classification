package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int[] row = new int[5];
		int[] col = new int[5];
		int ro;
		int column;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i - 1][j - 1] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 1;i <= 5;i++)
		{
			col[i - 1] = a[0][i - 1];
			row[i - 1] = a[i - 1][0];
		}
		for (i = 1;i <= 5;i++) //????????//
		{
			for (j = 1;j <= 5;j++)
			{
				if (a[i - 1][j - 1] > row[i - 1])
				{
					row[i - 1] = a[i - 1][j - 1];
				}
			}
		}
		for (j = 1;j <= 5;j++) //????????//
		{
			for (i = 1;i <= 5;i++)
			{
				if (a[i - 1][j - 1] < col[j - 1])
				{
					col[j - 1] = a[i - 1][j - 1];
				}
			}
		}
		int exist = 0; //?????????????//
		for (column = 1;column <= 5;column++)
		{
			for (ro = 1;ro <= 5;ro++)
			{
				if (col[column - 1] == row[ro - 1])
				{
					System.out.printf("%d %d %d\n",ro,column,col[column - 1]);
					exist = 1; //??????//
				}
			}
		}
		if (exist == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

