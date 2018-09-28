package <missing>;

public class GlobalMembers
{
	public static int[][] flag = new int[100][100];
	public static int n;
	public static char[][] a = new char[100][100];
	public static int chuan(int i, int j, int count)
	{
		if (flag[i][j + 1] == 0 && j < n - 1)
		{
			count++;
			flag[i][j + 1] = 3;
		}
		if (flag[i][j - 1] == 0 && j > 0)
		{
			count++;
			flag[i][j - 1] = 1;
		}
		if (flag[i - 1][j] == 0 && i > 0)
		{
			count++;
			flag[i - 1][j] = 1;
		}
		if (flag[i + 1][j] == 0 && i < n - 1)
		{
			count++;
			flag[i + 1][j] = 3;
		}
		return count;
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int count = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '#')
				{
					flag[i][j] = 2;
				}
				if (a[i][j] == '@')
				{
					flag[i][j] = 1;
					count++;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					if (flag[j][k] == 1)
					{
						count = chuan(j, k, count);
					}
				}
			}
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					if (flag[j][k] == 3)
					{
						flag[j][k] = 1;
					}
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");
		return 0;
	}
}

