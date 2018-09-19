package <missing>;

public class GlobalMembers
{
	//??????
	public static void change(int[][] a, int n, int sum)
	{
		int i;
		int j;
		int min1;
		int min2;
		if (n == 1)
		{
			System.out.print(sum);
			System.out.print("\n");
			return;
		}
		else
		{

			for (i = 0; i < n; i++)
			{
				min1 = 10000;
				for (j = 0; j < n; j++)
				{
					if (min1 > a[i][j])
					{
						min1 = a[i][j];
					}
				}
				for (j = 0; j < n; j++)
				{
					a[i][j] -= min1;
				}
			}

			for (i = 0; i < n; i++)
			{
				min2 = 10000;
				for (j = 0; j < n; j++)
				{
					if (min2 > a[j][i])
					{
						min2 = a[j][i];
					}
				}
				for (j = 0; j < n; j++)
				{
					a[j][i] -= min2;
				}
			}
			sum += a[1][1];
			for (i = 1; i < n - 1; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = a[i + 1][j];
				}
			}
			for (i = 1; i < n - 1; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[j][i] = a[j][i + 1];
				}
			}
				change(a, n - 1, sum);
		}
	}
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			sum = 0;
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
			a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
				change(a, n, sum);
		}
		return 0;
	}


}

