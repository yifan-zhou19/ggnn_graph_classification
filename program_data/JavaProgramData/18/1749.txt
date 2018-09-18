package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s = 0;
		int min;
		int n0;
		int[][] a = new int[100][100];
		int[][] temp = new int[100][100];
		n0 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int z = 0;z < n0;++z)
		{
			s = 0;
			for (int i = 0;i < n0;++i)
			{
				for (int j = 0;j < n0;++j)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int n = n0;n > 1;--n)
			{

			for (int k = 0;k < n;++k)
			{
					for (int l = 0;l < n;++l)
					{
					if (l == 0)
					{
					min = a[k][l];
					}
					else
					{
					min = min > a[k][l] != 0?a[k][l]:min;
					}

					}

				for (int l = 0;l < n;++l)
				{
				  a[k][l] -= min;
				}
			}

				for (int k = 0;k < n;++k)
				{
					for (int l = 0;l < n;++l)
					{
					if (l == 0)
					{
					min = a[l][k];
					}
					else
					{
					min = min > a[l][k] != 0?a[l][k]:min;
					}

					}

				for (int l = 0;l < n;++l)
				{
				  a[l][k] -= min;
				}
				}

				s += a[1][1];
				for (int i = 0;i < n;++i)
				{
					for (int j = 0;j < n;++j)
					{
						temp[i][j] = a[i][j];
					}
				}
				for (int i = 2;i < n;++i)
				{
					a[i - 1][0] = temp[i][0];
				}
				for (int i = 2;i < n;++i)
				{
					a[0][i - 1] = temp[0][i];
				}
				for (int i = 2;i < n;++i)
				{
				for (int j = 2;j < n;++j)
				{
					a[i - 1][j - 1] = temp[i][j];
				}
				}
			}
			System.out.print(s);
			System.out.print("\n");
		}
			return 0;
	}
}

