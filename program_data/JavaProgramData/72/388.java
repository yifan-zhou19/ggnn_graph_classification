package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] num = new int[20][20];
		int[][] flag = new int[20][20];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (num[0][0] >= num[0][1] != 0 && num[0][0] >= num[1][0])
		{
			flag[0][0] = 1;
		}
		if (num[0][n - 1] >= num[1][n - 1] != 0 && num[0][n - 1] >= num[0][n - 2])
		{
			flag[0][n - 1] = 1;
		}
		if (num[m - 1][0] >= num[m - 2][0] != 0 && num[m - 1][0] >= num[m - 1][1])
		{
			flag[m - 1][0] = 1;
		}
		if (num[m - 1][n - 1] >= num[m - 1][n - 2] != 0 && num[m - 1][n - 1] >= num[m - 2][n - 1])
		{
			flag[m - 1][n - 1] = 1;
		}
		for (i = 1;i < n - 1;i++)
		{
			if (num[0][i] >= num[0][i - 1] != 0 && num[0][i] >= num[0][i + 1] != 0 && num[0][i] >= num[1][i])
			{
				flag[0][i] = 1;
			}
		}
		for (i = 1;i < n - 1;i++)
		{
			if (num[m - 1][i] >= num[m - 1][i - 1] != 0 && num[m - 1][i] >= num[m - 1][i + 1] != 0 && num[m - 1][i] >= num[m - 2][i])
			{
				flag[m - 1][i] = 1;
			}
		}
		for (i = 1;i < m - 1;i++)
		{
			if (num[i][0] >= num[i - 1][0] != 0 && num[i][0] >= num[i + 1][0] != 0 && num[i][0] >= num[i][1])
			{
				flag[i][0] = 1;
			}
		}
		for (i = 1;i < m - 1;i++)
		{
			if (num[i][n - 1] >= num[i - 1][n - 1] != 0 && num[i][n - 1] >= num[i + 1][n - 1] != 0 && num[i][n - 1] >= num[i][n - 2])
			{
				flag[i][n - 1] = 1;
			}
		}
		for (i = 1;i < m - 1;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				if (num[i][j] >= num[i - 1][j] != 0 && num[i][j] >= num[i + 1][j] != 0 && num[i][j] >= num[i][j - 1] != 0 && num[i][j] >= num[i][j + 1])
				{
					flag[i][j] = 1;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (flag[i][j] == 1)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

