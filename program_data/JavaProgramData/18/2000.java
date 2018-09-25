package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int t;
	public static int n;
	public static int sum;
	public static int[][] a = new int[100][100];
	public static int f(int x)
	{
		for (int ii = 0;ii < x;ii++)
		{
		int minn = a[ii][0];
	for (int ij = 0;ij < x;ij++)
	{
		if (a[ii][ij] < minn)
		{
			minn = a[ii][ij];
		}
	}
	for (int ij = 0;ij < x;ij++)
	{
		a[ii][ij] = a[ii][ij] - minn;
	}
		}
	}
	public static int g(int x)
	{
		for (int ii = 0;ii < x;ii++)
		{
		int minn = a[0][ii];
	for (int ij = 0;ij < x;ij++)
	{
		if (a[ij][ii] < minn)
		{
			minn = a[ij][ii];
		}
	}
	for (int ij = 0;ij < x;ij++)
	{
		a[ij][ii] = a[ij][ii] - minn;
	}
		}
	}
	public static int h(int x)
	{
		sum = sum + a[1][1];
		for (int ii = 0;ii < x;ii++)
		{
			for (int jj = 1;jj < x;jj++)
			{
			a[ii][jj] = a[ii][jj + 1];
			}
		}
		for (int ii = 0;ii < x;ii++)
		{
			for (int jj = 1;jj < x;jj++)
			{
			a[jj][ii] = a[jj + 1][ii];
			}
		}
	}
	public static int Main()
	{

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int qqq = 0;qqq < n;qqq++)
		{
			sum = 0;
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			}
			for (i = n;i > 1;i--)
			{
				f(i);
				g(i);
				h(i);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
	}
}

