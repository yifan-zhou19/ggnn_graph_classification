package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int k = 0;
	public static int[][] x = new int[100][100];
	public static void num(int i,int j)
	{
		if (i > 0)
		{
			if (x[i - 1][j] == 1)
			{
				k++;
				x[i - 1][j] = 3;
			}
		}
		if (i < n - 1)
		{
			if (x[i + 1][j] == 1)
			{
				k++;
				x[i + 1][j] = 3;
			}
		}
		if (j > 0)
		{
			if (x[i][j - 1] == 1)
			{
				k++;
				x[i][j - 1] = 3;
			}
		}
		if (j < n - 1)
		{
			if (x[i][j + 1] == 1)
			{
				k++;
				x[i][j + 1] = 3;
			}
		}
	}

	public static int Main()
	{
		int i;
		int j;
		char c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				c = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (c == '@')
				{
					x[i][j] = 2;
					k++;
				}
				if (c == '.')
				{
					x[i][j] = 1;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m > 1)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (x[i][j] == 2)
					{
						num(i, j);
					}
				}
			}
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (x[i][j] == 3)
					{
						x[i][j] = 2;
					}
				}
			}
			m--;
		}
		System.out.print(k);
		System.out.print("\n");
		return 0;
	}
}

