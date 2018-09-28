package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int[][] a = new int[MAX][MAX];
		int i;
		int j;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (j = 0;j < col;j++)
		{
			for (i = 0, k = j;i < row && k >= 0;i++, k--)
			{
				System.out.printf("%d\n",a[i][k]);
			}
		}

		for (i = 1;i < row;i++)
		{
			for (k = i, j = col - 1;k < row && j >= 0;k++, j--)
			{
				System.out.printf("%d\n",a[k][j]);
			}
		}
	}

}

