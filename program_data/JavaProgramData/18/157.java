package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[100][100];
		int p;
		int min;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = 1;p <= n;p++)
		{
			for (i = 0;i <= n - 1;i++)
			{
				for (j = 0;j <= n - 1;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			for (k = 1;k <= n - 1;k++)
			{

			for (i = 0;i <= n - 1;i++)
			{
				min = a[i][0];
				for (j = k;j <= n - 1;j++)
				{
					if (a[i][j] < min)
					{
						min = a[i][j];
					}
				}

					for (j = 0;j <= n - 1;j++)
					{
						a[i][j] = a[i][j] - min;
					}

			}

			for (j = 0;j <= n - 1;j++)
			{
				min = a[0][j];
				for (i = k;i <= n - 1;i++)
				{
					if (a[i][j] < min)
					{
						min = a[i][j];
					}
				}
				for (i = 0;i <= n - 1;i++)
				{

						a[i][j] = a[i][j] - min;

				}
			}
			sum = sum + a[k][k];
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}

		return 0;
	}



}

