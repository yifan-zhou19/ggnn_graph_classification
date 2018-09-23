package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int t;
		int k;
		int tem;
		int min;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 0; t < n; t++)
		{
			sum = 0;
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n ; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			tem = n;
			for (k = 0; k < n - 1; k++)
			{
				for (i = 0; i < tem; i++)
				{
					min = a[i][0];
					for (j = 1; j < tem; j++)
					{
						if (min > a[i][j])
						{
							min = a[i][j];
						}
					}
					for (j = 0; j < tem; j++)
					{
						a[i][j] = a[i][j] - min;
					}
				}
				for (j = 0; j < tem; j++)
				{
					min = a[0][j];
					for (i = 1; i < tem; i++)
					{
						if (min > a[i][j])
						{
							min = a[i][j];
						}
					}
					for (i = 0; i < tem; i++)
					{
						a[i][j] = a[i][j] - min;
					}
				}
				sum = sum + a[1][1];
				for (i = 2; i < tem; i++)
				{
					for (j = 0; j < tem; j++)
					{
						a[i - 1][j] = a[i][j];
					}
				}
				for (j = 2; j < tem; j++)
				{
					for (i = 0; i < tem; i++)
					{
						a[i][j - 1] = a[i][j];
					}
				}
				tem--;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

