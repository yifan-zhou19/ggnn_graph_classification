package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n;
		int sum = 0;
		int k = 0;
		int i;
		int j;
		char[][] a = new char[110][110];
		int[][] queue = new int[10005][5];
		int top = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (a[i][j] == '@')
			{
				top++;
				queue[top][1] = i;
				queue[top][2] = j;
			}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= m - 1;k++)
		{
			int temp = top;
			int o;
			for (o = 1;o <= temp;o++)
			{
				int x = queue[o][1];
				int y = queue[o][2];
				if (a[x + 1][y] != '#')
				{
					if (a[x + 1][y] == '.')
					{
						top++;
						queue[top][1] = x + 1;
						queue[top][2] = y;
						a[x + 1][y] = '@';
					}
				}
				if (a[x][y + 1] != '#')
				{
					if (a[x][y + 1] == '.')
					{
						top++;
						queue[top][1] = x;
						queue[top][2] = y + 1;
						a[x][y + 1] = '@';
					}
				}
				if (a[x - 1][y] != '#')
				{
					if (a[x - 1][y] == '.')
					{
						top++;
						queue[top][1] = x - 1;
						queue[top][2] = y;
						a[x - 1][y] = '@';
					}
				}
				if (a[x][y - 1] != '#')
				{
					if (a[x][y - 1] == '.')
					{
						top++;
						queue[top][1] = x;
						queue[top][2] = y - 1;
						a[x][y - 1] = '@';
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;







	}













}

