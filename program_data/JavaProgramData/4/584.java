package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[][] k = new int[100][100];
	public static void display(int i,int j)
	{
		if (i >= m != 0 || j >= n != 0 || i < 0 || j < 0)
		{
			return;
		}
		else
		{
			System.out.print(k[i][j]);
			System.out.print("\n");
			display(i + 1, j - 1);
		}
	}
	public static int Main()
	{
		int i = 0;
		int j = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				k[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 0;j < n;j++)
		{
			display(0, j);
		}
		for (i = 1;i < m;i++)
		{
			display(i, n - 1);
		}
		return 0;
	}
}

