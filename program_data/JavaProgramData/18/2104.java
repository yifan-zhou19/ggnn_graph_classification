package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];

	public static void minus_row_col(int n)
	{
		int[] row = new int[100];
		int[] col = new int[100];
		int min_row = 10000;
		int min_col = 10000;
		int i;
		int j;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (a[i][j] < min_row)
				{
					min_row = a[i][j];
				}
			}
			row[i] = min_row;
			min_row = 10000;
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] -= row[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (a[j][i] < min_col)
				{
					min_col = a[j][i];
				}
			}
			col[i] = min_col;
			min_col = 10000;
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[j][i] -= col[i];
			}
		}
	}

	public static void delete_row_col(int n)
	{
		int i;
		int j;
		for (i = 0; i < n; i++)
		{
			for (j = 1; j < n; j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (j = 0; j < n; j++)
		{
			for (i = 1; i < n; i++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[j][k] = Integer.parseInt(tempVar2);
					}
				}
			}
			sum = 0;
			int num = n;
			while (num != 1)
			{
				minus_row_col(num);
				sum += a[1][1];
				delete_row_col(num);
				num--;
			}
			System.out.printf("%d\n", sum);
		}
		return 0;
	}
}

