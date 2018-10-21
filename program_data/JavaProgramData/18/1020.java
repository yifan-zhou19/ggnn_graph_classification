package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int i;
		int j;
		int c;
		int sum = 0;
		int k;
		int n;
		int min;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; k++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			sum = 0;
			for (c = n; c > 1; c--)
			{
				for (i = 0; i < c; i++)
				{
					min = 100000;
					for (j = 0; j < c; j++)
					{
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					for (j = 0; j < c; j++)
					{
						a[i][j] = a[i][j] - min;
					}
				}
				for (j = 0; j < c; j++)
				{
					min = 100000;
					for (i = 0; i < c; i++)
					{
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					for (i = 0; i < c; i++)
					{
						a[i][j] = a[i][j] - min;
					}
				}
				sum += a[1][1];
				for (i = 1; i < c - 1; i++)
				{
					for (j = 0; j < c; j++)
					{
						a[i][j] = a[i + 1][j];
					}
				}
				for (j = 1; j < c; j++)
				{
					for (i = 0; i < c - 1; i++)
					{
						a[i][j] = a[i][j + 1];
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

