package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int m;
	int n;
	double ave;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[][] ma = new int[30][30];
	for (i = 1;i <= m;i++)
	{
		for (j = 1;j <= n;j++)
		{
			ma[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	for (j = 0;j <= 29;j++)
	{
		ma[0][j] = -1;
		ma[m + 1][j] = -1;
	}
	for (i = 0;i <= 29;i++)
	{
		ma[i][0] = -1;
		ma[i][n + 1] = -1;
	}

	for (i = 1;i <= m;i++)
	{
		for (j = 1;j <= n;j++)
		{
			if (ma[i][j] >= ma[i - 1][j] != 0 && ma[i][j] >= ma[i + 1][j] != 0 && ma[i][j] >= ma[i][j + 1] != 0 && ma[i][j] >= ma[i][j - 1])
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

