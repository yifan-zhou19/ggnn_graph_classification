package <missing>;

public class GlobalMembers
{
	public static void ccout(int n, int[] s)
	{
			 int k;
		for (k = 0;k < n;k++)
		{
			System.out.print(s[k]);
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int min;
		int t;
		int[] s = new int[100];
		int[][][] a = new int[100][100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s,0,(Integer.SIZE / Byte.SIZE));
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (t = 0;t < n - 1;t++)
			{
				for (i = 0;i < n - t;i++)
				{
					min = 1073741824;
					for (j = 0;j < n - t;j++)
					{
						if (a[i][j][k] < min)
						{
							min = a[i][j][k];
						}
					}
					for (j = 0;j < n - t;j++)
					{
						a[i][j][k] -= min;
					}
				}
				for (j = 0;j < n - t;j++)
				{
					min = 1073741824;
					for (i = 0;i < n - t;i++)
					{
						if (a[i][j][k] < min)
						{
							min = a[i][j][k];
						}
					}
					for (i = 0;i < n - t;i++)
					{
						a[i][j][k] -= min;
					}
				}
				s[k] += a[1][1][k];
				for (i = 0;i < n;i++)
				{
					for (j = 1;j < n - t - 1;j++)
					{
						a[i][j][k] = a[i][j + 1][k];
					}
				}
				for (j = 0;j < n;j++)
				{
					for (i = 1;i < n - t - 1;i++)
					{
						a[i][j][k] = a[i + 1][j][k];
					}
				}
			}
		}
			 ccout(n, s);
		return 0;
	}
}

