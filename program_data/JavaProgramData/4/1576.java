package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int col;
	public static int row;
	public static void Main()
	{
		int i;
		int j;
		int k;
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
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			};
		};
		if (col >= row)
		{
			for (k = 0; k <= row - 1; k++)
			{
				for (i = 0; i <= k; i++)
				{
					System.out.printf("%d\n", a[i][k - i]);
				};
			};
			for (k = row; k <= col - 1; k++)
			{
				for (i = 0; i <= row - 1; i++)
				{
					System.out.printf("%d\n", a[i][k - i]);
				};
			};
			for (k = col; k <= row + col - 2; k++)
			{
				for (i = k - col + 1; i <= row - 1; i++)
				{
					System.out.printf("%d\n", a[i][k - i]);
				};
			};
		};
		if (row > col)
		{
			for (k = 0; k <= col - 1; k++)
			{
				for (i = 0; i <= k; i++)
				{
					System.out.printf("%d\n", a[i][k - i]);
				};
			};
			for (k = col; k <= row - 1; k++)
			{
				for (i = k - col + 1; i <= k; i++)
				{
					System.out.printf("%d\n", a[i][k - i]);
				};
			};
			for (k = row; k <= row + col - 2; k++)
			{
				for (i = k - col + 1; i <= row - 1; i++)
				{
					System.out.printf("%d\n", a[i][k - i]);
				};
			};
		};
	}
}

