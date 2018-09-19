package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int j;
	public static int k;
	public static int[][][] a = new int[100][100][100];


	public static int Main()
	{
		int[] sum = new int[100];
		int t;
		int x;
		int min;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = n;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[i][j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}
		for (x = 0;x < n;x++)
		{
			while (n > 1)
			{
				for (i = 0;i < n;i++)
				{
					 min = a[x][i][0];
					 for (j = 0;j < n;j++)
					 {
						 if (min > a[x][i][j])
						 {
							  min = a[x][i][j];
						 }
					 }
					 for (j = 0;j < n;j++)
					 {
						 a[x][i][j] -= min;
					 }
				}
				for (j = 0;j < n;j++)
				{
					 min = a[x][0][j];
					 for (i = 0;i < n;i++)
					 {
						 if (min > a[x][i][j])
						 {
							   min = a[x][i][j];
						 }
					 }
					 for (i = 0;i < n;i++)
					 {
							  a[x][i][j] -= min;
					 }


				}
				sum[x] += a[x][1][1];
							for (i = 1;i < n - 1;i++)
							{
					a[x][i][0] = a[x][i + 1][0];
							}
				for (j = 1;j < n - 1;j++)
				{
					a[x][0][j] = a[x][0][j + 1];
				}
				for (i = 1;i < n - 1;i++)
				{
					for (j = 1;j < n - 1;j++)
					{
						a[x][i][j] = a[x][i + 1][j + 1];
					}
				}
				n--;
			}
			n = t;

		}
		for (i = 0;i < t;i++)
		{
			System.out.print(sum[i]);
			System.out.print("\n");
		}

		return 0;
	}
}

