package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int n = 0;
		int k = 0;
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
		while (k != (row * col))
		{
		for (j = (0 + n);j < (col - n);j++)
		{
			System.out.printf("%d\n",a[n][j]);
			k++;
		}
		 if (k == row * col)
		 {
			 break;
		 }
		for (i = (1 + n);i < (row - n);i++)
		{
			System.out.printf("%d\n",a[i][col - 1 - n]);
			k++;
		}
		if (k == row * col)
		{
			break;
		}
		for (j = (col - 2 - n);j >= (0 + n);j--)
		{
			System.out.printf("%d\n",a[row - n - 1][j]);
			k++;
		}
		if (k == row * col)
		{
			break;
		}
		for (i = (row - 2 - n);i >= (1 + n);i--)
		{
			System.out.printf("%d\n",a[i][n]);
			k++;
		}
		if (k == row * col)
		{
			break;
		}
		n++;
		}
	}

}

