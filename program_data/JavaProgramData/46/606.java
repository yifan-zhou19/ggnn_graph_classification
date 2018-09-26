package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int row = 0;
	int col = 0;
	int i = 0;
	int j = 0;
	int n = 0;
	int t = 0;
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
	int[][] array = new int[100][100];
	for (i = 0;i < row;i++)
	{
	   for (j = 0;j < col;j++)
	   {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			array[i][j] = Integer.parseInt(tempVar3);
		}
	   }
	}
	   for (n = 0;;n++)
	   {
		for (i = n;i < col - n;i++)
		{
		 System.out.printf("%d\n",array[n][i]);
		 t++;
		}

		if (t == row * col)
		{
			break;
		}
		for (j = n + 1;j < row - n;j++)
		{
		 System.out.printf("%d\n",array[j][col - n - 1]);
		 t++;
		}

		if (t == row * col)
		{
			break;
		}
		for (i = col - 2 - n;i >= n;i--)
		{
		 System.out.printf("%d\n",array[row - n - 1][i]);
		 t++;
		}

		if (t == row * col)
		{
			break;
		}
		for (j = row - 2 - n;j > n;j--)
		{
		 System.out.printf("%d\n",array[j][n]);
		 t++;
		}

		if (t == row * col)
		{
			break;
		}
	   }

	}
}

