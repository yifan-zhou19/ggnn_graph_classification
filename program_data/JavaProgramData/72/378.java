package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] height = new int[22][22];
		int[][] check = new int[20][20];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 22;i++)
		{
			for (j = 0;j < 22;j++)
			{
				height[i][j] = 0;
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				height[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (height[i][j] >= height[i - 1][j] != 0 && height[i][j] >= height[i + 1][j] != 0 && height[i][j] >= height[i][j - 1] != 0 && height[i][j] >= height[i][j + 1])
				{
					check[i][j] = 1;
				}
				else
				{
					check[i][j] = 0;
				}
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (check[i][j] == 1)
				{
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					System.out.print("\n");
				}
				else
				{
					continue;
				}
			}
		}
		return 0;
	}
}

