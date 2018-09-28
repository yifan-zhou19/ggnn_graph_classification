package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] h = new int[21][21];
		for (int i = 1;i < m + 1;i++)
		{
			for (int j = 1;j < n + 1;j++)
			{
				h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < 20;i++)
		{
			h[0][i] = 0;
			h[i][0] = 0;
			h[m + 1][i] = 0;
			h[i][n + 1] = 0;
		}
		for (int i = 1;i < m + 1;i++)
		{
			for (int j = 1;j < n + 1;j++)
			{

				if (h[i][j] >= h[i][j - 1] != 0 && h[i][j] >= h[i][j + 1] != 0 && h[i][j] >= h[i + 1][j] != 0 && h[i][j] >= h[i - 1][j])
				{
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}


		return 0;
	}
}

