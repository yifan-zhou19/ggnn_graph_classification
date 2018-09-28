package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int m1;
		int i;
		int j;
		int k;
		char[][] a = new char[100][100];
		int[][] b = new int[100][100];
		int[] sum = new int[100];
		int[][] c = new int[100][100];
		for (i = 0;i < 100;i++)
		{
			sum[i] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
					a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
					if (a[i][j] == '.')
					{
						b[i][j] = 1;
					}
					if (a[i][j] == '#')
					{
						b[i][j] = 0;
					}
					if (a[i][j] == '@')
					{
						b[i][j] = -1;
					}
			}
		}
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = m1;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					if (b[j][k] == 0)
					{
						continue;
					}
					else
					{
						if (b[j - 1][k] == -1 || b[j + 1][k] == -1 || b[j][k - 1] == -1 || b[j][k + 1] == -1)
						{
							c[j][k] = -1;
						}
					}
				}
			}

			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{

					if (b[j][k] == -1)
					{
						sum[i] = sum[i] + 1;
					}

				}
			}
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{

					if (c[j][k] == -1)
					{
						b[j][k] = -1;
					}
				}
			}
		}
		System.out.print(sum[m - 1]);
	}






}

