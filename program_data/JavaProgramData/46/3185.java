package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int row;
		int col;
		int p;
		int sum = 0;
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
		for (p = 0;;p++)
		{
			for (j = p;j <= col - p - 1;j++)
			{
				System.out.printf("%d\n",a[p][j]);
				sum = sum + 1;
			}
			if (sum == row * col)
			{
				break;
			}
			for (i = p + 1;i <= row - p - 1;i++)
			{
				System.out.printf("%d\n",a[i][col - p - 1]);
				sum = sum + 1;
			}
			if (sum == row * col)
			{
				break;
			}
			for (j = col - p - 2;j >= p;j--)
			{
				System.out.printf("%d\n",a[row - p - 1][j]);
				sum = sum + 1;
			}
			if (sum == row * col)
			{
				break;
			}
			for (i = row - p - 2;i >= p + 1;i--)
			{
				System.out.printf("%d\n",a[i][p]);
				sum = sum + 1;
			}
			if (sum == row * col)
			{
				break;
			}
		}
		return 0;
	}
}

