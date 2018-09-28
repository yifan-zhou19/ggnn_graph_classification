package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] a = new int[100][100];
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
		for (;row > 1 && col > 1;)
		{
			for (j = 0;j < col;j++)
			{
			System.out.printf("%d\n",a[0][j]);
			}
		for (i = 1;i < row;i++)
		{
			System.out.printf("%d\n",a[i][col - 1]);
		}
		for (j = col - 2;j >= 0;j--)
		{
			System.out.printf("%d\n",a[row - 1][j]);
		}
		for (i = row - 2;i >= 1;i--)
		{
			System.out.printf("%d\n",a[i][0]);
		}
		for (i = 0;i < row - 2;i++)
		{
			for (j = 0;j < col - 2;j++)
			{
		a[i][j] = a[i + 1][j + 1];
			}
		}
		row = row - 2;
		col = col - 2;
		}
		if (row == 1)
		{
			for (i = 0;i < col;i++)
			{
		System.out.printf("%d\n",a[0][i]);
			}
		}
		else
		{
			for (i = 0;i < row;i++)
			{
		System.out.printf("%d\n",a[i][0]);
			}
		}
	}
}

