package <missing>;

public class GlobalMembers
{
	public static int[][] mat = new int[100][100];
	public static int n;
	public static int sum = 0;
	public static int rmin(int[][] a, int x)
	{
		int i;
		int rsmall = a[x][0];
		for (i = 0; i < n; i++)
		{
			if (rsmall > a[x][i])
			{
				rsmall = a[x][i];
			}
		}
		return rsmall;
	}
	public static int cmin(int[][] a, int y)
	{
		int i;
		int csmall = a[0][y];
		for (i = 0; i < n; i++)
		{
			if (csmall > a[i][y])
			{
				csmall = a[i][y];
			}
		}
		return csmall;
	}
	public static void caculate(int[][] mat)
	{
		int i;
		int j;
		int rsmall;
		int csmall;
		for (i = 0; i < n; i++)
		{
			rsmall = rmin(mat, i);
			for (j = 0; j < n; j++)
			{
				mat[i][j] -= rsmall;
			}
		}
		for (i = 0; i < n; i++)
		{
			csmall = cmin(mat, i);
			for (j = 0; j < n; j++)
			{
				mat[j][i] -= csmall;
			}
		}
	}
	public static void change(int[][] a, int x)
	{
		int i;
		int j;
		sum += a[1][1];
		for (i = 0; i < x; i++)
		{
			for (j = 1; j < x - 1; j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (i = 1; i < x - 1; i++)
		{
			for (j = 0; j < x - 1; j++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
	}
	public static int Main()
	{
		int m;
		int i;
		int j;
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 1; m <= num; m++)
		{
			n = num;
			sum = 0;
			for (i = 0; i < num; i++)
			{
				for (j = 0; j < num; j++)
				{
					mat[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			while (n != 1)
			{
				caculate(mat);
				change(mat, n--);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

