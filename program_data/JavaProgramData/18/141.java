package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int f(int n, int[][] a) //???????a[1][1]?????
	{
			int i;
			int j;
			int k;
			for (i = 0;i < n;i++) //???
			{
					int min = a[i][0];
					for (j = 1;j < n;j++)
					{
							if (a[i][j] < min)
							{
								min = a[i][j];
							}
					}
					if (min > 0)
					{
					for (j = 0;j < n;j++)
					{
							a[i][j] -= min;
					}
					}
			}
			for (j = 0;j < n;j++) //???
			{
					int min = a[0][j];
					for (i = 1;i < n;i++)
					{
							if (a[i][j] < min)
							{
								min = a[i][j];
							}
					}
					if (min > 0)
					{
							for (i = 0;i < n;i++)
							{
									a[i][j] -= min;
							}
					}
			}
			int z = a[1][1];
			for (i = 1;i < n - 1;i++)
			{ //??
				a[0][i] = a[0][i + 1];
				a[i][0] = a[i + 1][0];
				for (j = 1;j < n - 1;j++)
				{
					a[i][j] = a[i + 1][j + 1];
				}
			}
			if (n == 2)
			{
				return z;
			}
			else
			{
				return z + f(n - 1, a);
			}
	}
	public static int Main()
	{
			int n;
			int i; //????
			int j;
			int k;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < n;i++)
			{
					for (j = 0;j < n;j++)
					{
							for (k = 0;k < n;k++)
							{
									a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
							}
					}
					System.out.print(f(n, a));
					System.out.print("\n");
			}
			return 0;
	}

}

