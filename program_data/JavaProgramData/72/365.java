package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m; //m?n??????
		int n;
		int[][] map = new int[20][20];
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				map[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n;i++) //???0????
		{
			if (i == 0)
			{
				if (map[0][i] >= map[0][i + 1] != 0 && map[0][i] >= map[1][i])
				{
					System.out.print("0");
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
				}
			}
			else if (i == n - 1)
			{
				if (map[0][i] >= map[0][i - 1] != 0 && map[0][i] >= map[1][i])
				{
					System.out.print("0");
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
				}
			}
			else
			{
				if (map[0][i] >= map[0][i - 1] != 0 && map[0][i] >= map[0][i + 1] != 0 && map[0][i] >= map[1][i])
				{
					System.out.print("0");
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
				}
			}
		}
		for (i = 1;i < m - 1;i++) //???1?m-2????
		{
			for (j = 0;j < n;j++)
			{
				if (j == 0)
				{
					if (map[i][j] >= map[i - 1][j] != 0 && map[i][j] >= map[i + 1][j] != 0 && map[i][j] >= map[i][j + 1])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (j == n - 1)
				{
					if (map[i][j] >= map[i - 1][j] != 0 && map[i][j] >= map[i + 1][j] != 0 && map[i][j] >= map[i][j - 1])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else
				{
					if (map[i][j] >= map[i - 1][j] != 0 && map[i][j] >= map[i + 1][j] != 0 && map[i][j] >= map[i][j + 1] != 0 && map[i][j] >= map[i][j - 1])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
			}
		}
		for (i = 0;i < n;i++) //???m-1????
		{
			if (i == 0)
			{
				if (map[m - 1][i] >= map[m - 1][i + 1] != 0 && map[m - 1][i] >= map[m - 2][i])
				{
					System.out.print((m - 1));
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
				}
			}
			else if (i == n - 1)
			{
				if (map[m - 1][i] >= map[m - 1][i - 1] != 0 && map[m - 1][i] >= map[m - 2][i])
				{
					System.out.print((m - 1));
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
				}
			}
			else
			{
				if (map[m - 1][i] >= map[m - 1][i - 1] != 0 && map[m - 1][i] >= map[m - 1][i + 1] != 0 && map[m - 1][i] >= map[m - 2][i])
				{
					System.out.print((m - 1));
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

