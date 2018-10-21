package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] h = new int[20][20];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0; i < m;i++)
		{
			for (j = 0; j < n;j++)
			{
				h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < m;i++)
		{
			for (j = 0; j < n;j++)
			{
				if (!(i - 1 >= 0 && h[i][j] < h[i - 1][j]) + !(i + 1 < m && h[i][j] < h[i + 1][j]) + !(j - 1 >= 0 && h[i][j] < h[i][j - 1]) + !(j + 1 < n && h[i][j] < h[i][j + 1]) == 4)
				{
					System.out.print(i);
					System.out.print(' ');
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
			return 0;
	}
}

