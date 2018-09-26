package <missing>;

public class GlobalMembers
{
	public static int[][] map = new int[100][100];
	public static int m;
	public static int n;
	public static void count()
	{
		int i;
		int j;
		int sum = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i + j == j || i + j == i || i + j == i + n - 1 || i + j == j + m - 1)
				{
					sum = sum + map[i][j];
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
	}
	public static int Main()
	{
		int sum;
		int k = 0;
		sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (k = 0;k < sum;k++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					map[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			count();
		}
	}
}

