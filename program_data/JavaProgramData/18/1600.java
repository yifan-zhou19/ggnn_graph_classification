package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		int sum = 0;
		int temp = 1;
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int min;
			sum = 0;
			temp = 1;
			for (l = 0;l < n - 1;l++)
			{
			for (i = 0;i < n;i++)
			{
				min = a[i][0];
				for (j = 0;j < n;j++)
				{
					if (a[i][j] < min && a[i][j] >= 0)
					{
						min = a[i][j];
					}
				}
				for (j = 0;j < n;j++)
				{
					if (a[i][j] >= 0)
					{
					a[i][j] -= min;
					}
				}
			}
			for (j = 0;j < n;j++)
			{
				min = a[0][j];
				for (i = 0;i < n;i++)
				{
					if (a[i][j] < min && a[i][j] >= 0)
					{
						min = a[i][j];
					}
				}
				for (i = 0;i < n;i++)
				{
					if (a[i][j] >= 0)
					{
					a[i][j] -= min;
					}
				}
			}
			sum += a[temp][temp];
			for (i = 0;i < n;i++)
			{
				a[i][temp] = -1;
			}
			for (j = 0;j < n;j++)
			{
				a[temp][j] = -1;
			}
			temp++;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

