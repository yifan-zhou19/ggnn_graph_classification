package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int t;
		int row;
		int col;
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
		for (i = 0;i < col;i++)
		{
			for (j = i;j <= col - 1;j++)
			{
					t = a[i][j];
					System.out.printf("%d\n",a[i][j]);
			}
			for (j = i + 1;j <= row - 1;j++)
			{
					t = a[j][col - 1];
					System.out.printf("%d\n",a[j][col - 1]);
			}
			if (i >= row - 1)
			{
				break;
			}
			if (i >= col - 1)
			{
				break;
			}
			for (j = col - 2;j >= i;j--)
			{
					t = a[row - 1][j];
					System.out.printf("%d\n",a[row - 1][j]);
			}


			for (j = row - 2;j > i;j--)
			{
					t = a[j][i];
					System.out.printf("%d\n",a[j][i]);
			}
			row--;
			col--;
		}
	}
}

