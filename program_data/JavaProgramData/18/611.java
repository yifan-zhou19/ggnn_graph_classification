package <missing>;

public class GlobalMembers
{
	public static int[][][] array = new int[100][100][100];
	public static int Main()
	{
		int n;
		int[] sum = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					array[i][j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j <= n - 1;j++)
			{
				for (k = 0;k <= n - j;k++)
				{
					int min = array[i][k][0];
					for (t = 1;t <= n - j;t++)
					{
						if (min > array[i][k][t])
						{
							min = array[i][k][t];
						}
					}
					for (t = 0;t <= n - j;t++)
					{
						array[i][k][t] = array[i][k][t] - min;
					}
				}
				for (k = 0;k <= n - j;k++)
				{
					int min = array[i][0][k];
					for (t = 1;t <= n - j;t++)
					{
						if (min > array[i][t][k])
						{
							min = array[i][t][k];
						}
					}
					for (t = 0;t <= n - j;t++)
					{
						array[i][t][k] = array[i][t][k] - min;
					}
				}
				sum[i] = sum[i] + array[i][1][1];
				for (k = 0;k <= n - j;k++)
				{
					for (t = 1;t < n - j;t++)
					{
						array[i][k][t] = array[i][k][t + 1];
					}
				}
				for (k = 0;k < n - j;k++)
				{

					for (t = 1;t < n - j;t++)
					{
						array[i][t][k] = array[i][t + 1][k];
					}
				}
			}
			System.out.print(sum[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

