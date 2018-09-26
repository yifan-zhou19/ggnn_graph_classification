package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int row;
		int col;
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
					(a[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (n = 0;n <= row;n++)
		{
			for (i = n;i < col - n;i++)
			{
				System.out.printf("%d\n",a[n][i]);
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
			for (j = n + 1;j < row - n;j++)
			{
				System.out.printf("%d\n",a[j][col - (n + 1)]);
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
			for (i = col - (n + 1) - 1;i >= n;i--)
			{
				System.out.printf("%d\n",a[row - (n + 1)][i]);
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
			for (j = row - (n + 1) - 1;j > n;j--)
			{
				System.out.printf("%d\n",a[j][n]);
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
		}
	}
}

