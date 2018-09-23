package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[103][103];
	public static int FindMin(int x, int y)
	{
		int ret = 100000;
		for (int i = 0; i < y; i++)
		{
			if (a[x][i] < ret)
			{
				ret = a[x][i];
			}
		}
		return ret;
	}
	public static int FindMin1(int x, int y)
	{
		int ret = 100000;
		for (int i = 0; i < y; i++)
		{
			if (a[i][x] < ret)
			{
				ret = a[i][x];
			}
		}
		return ret;
	}
	public static int Main()
	{
		int n;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		q = n;
		for (int k = 0; k < n; k++)
		{
			sum = 0;
			q = n;
			for (int h = 0; h < n; h++)
			{
				for (int l = 0; l < n; l++)
				{
					a[h][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			while (true)
			{
				if (q == 1)
				{
					System.out.print(sum);
					System.out.print("\n");
					break;
				}
				// ?? 
				int t;
				for (int i = 0; i < q; i++)
				{
					t = FindMin(i, q);
					for (int j = 0; j < q; j++)
					{
						a[i][j] -= t;
					}
				}
				for (int j = 0; j < q; j++)
				{
					t = FindMin1(j, q);
					for (int i = 0; i < q; i++)
					{
						a[i][j] -= t;
					}
				}
				sum += a[1][1];
				//??
				for (int i = 1; i < q - 1; i++)
				{
					for (int j = 0; j < q; j++)
					{
						a[i][j] = a[i + 1][j];
					}
				}
				for (int j = 1; j < q - 1; j++)
				{
					for (int i = 0; i < q; i++)
					{
						a[i][j] = a[i][j + 1];
					}
				}
				q--;
			}

		}
		return 0;
	}
}

