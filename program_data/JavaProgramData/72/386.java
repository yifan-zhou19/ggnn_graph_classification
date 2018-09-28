package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] h = new int[20][20];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < m; j++)
			{
				h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (h[0][0] >= h[0][1] != 0 && h[0][0] >= h[1][0])
		{
			System.out.print("0 0");
			System.out.print("\n");
		}
		for (j = 1; j < m - 1; j++)
		{
				if (h[0][j] >= h[1][j] != 0 && h[0][j] >= h[0][j + 1] != 0 && h[0][j] >= h[0][j - 1])
				{
				System.out.print("0 ");
				System.out.print(j);
				System.out.print("\n");
				}
		}
		if (h[0][m - 1] >= h[0][m - 2] != 0 && h[0][m - 1] >= h[1][m - 1])
		{
			System.out.print("0 ");
			System.out.print(m - 1);
			System.out.print("\n");
		}
		for (i = 1; i < n - 1; i++)
		{
			if (h[i][0] >= h[i - 1][0] != 0 && h[i][0] >= h[i + 1][0] != 0 && h[i][0] >= h[i][1])
			{
				System.out.print(i);
				System.out.print(" 0");
				System.out.print("\n");
			}
			for (j = 1; j < m - 1; j++)
			{
				if (h[i][j] >= h[i - 1][j] != 0 && h[i][j] >= h[i + 1][j] != 0 && h[i][j] >= h[i][j + 1] != 0 && h[i][j] >= h[i][j - 1])
				{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
				}
			}
			if (h[i][j] >= h[i - 1][j] != 0 && h[i][j] >= h[i + 1][j] != 0 && h[i][j] >= h[i][j - 1])
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		if (h[n - 1][0] >= h[n - 1][1] != 0 && h[n - 1][0] >= h[n - 2][0])
		{
			System.out.print(n - 1);
			System.out.print(" 0");
			System.out.print("\n");
		}
		for (j = 1; j < m - 1; j++)
		{
				if (h[n - 1][j] >= h[n - 2][j] != 0 && h[n - 1][j] >= h[n - 1][j + 1] != 0 && h[n - 1][j] >= h[n - 1][j - 1])
				{
				System.out.print(n - 1);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
				}
		}
		if (h[n - 1][m - 1] >= h[n - 1][m - 2] != 0 && h[n - 1][m - 1] >= h[n - 2][m - 1])
		{
			System.out.print(n - 1);
			System.out.print(" ");
			System.out.print(m - 1);
			System.out.print("\n");
		}
		return 0;
	}
}

