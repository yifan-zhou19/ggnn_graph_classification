package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
	int[][][] s = new int[9][9][5];
	int m;
	int n;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < 9;i++)
	{
	for (j = 0;j < 9;j++)
	{
	for (k = 0;k < 5;k++)
	{
		s[i][j][k] = 0;
	}
	}
	}
	s[4][4][0] = m;
	for (k = 1;k < n + 1;k++)
	{
	for (i = 0;i < 9;i++)
	{
	for (j = 0;j < 9;j++)
	{
		if (i == 0 && j == 0)
		{
	s[i][j][k] = s[i + 1][j][k - 1] + s[i][j + 1][k - 1] + 2 * s[i][j][k - 1] + s[i + 1][j + 1][k - 1];
		}
	if (i == 0 && j == 8)
	{
	s[i][j][k] = s[i + 1][j][k - 1] + s[i][j - 1][k - 1] + 2 * s[i][j][k - 1] + s[i + 1][j - 1][k - 1];
	}
	if (i == 8 && j == 0)
	{
	s[i][j][k] = s[i - 1][j][k - 1] + s[i][j + 1][k - 1] + 2 * s[i][j][k - 1] + s[i - 1][j + 1][k - 1];
	}
	if (i == 8 && j == 8)
	{
	s[i][j][k] = s[i - 1][j][k - 1] + s[i][j - 1][k - 1] + 2 * s[i][j][k - 1] + s[i - 1][j - 1][k - 1];
	}
	if (i == 0 && j != 0 && j != 8)
	{
	s[i][j][k] = s[i + 1][j][k - 1] + s[i][j + 1][k - 1] + s[i][j - 1][k - 1] + 2 * s[i][j][k - 1] + s[i + 1][j - 1][k - 1] + s[i + 1][j + 1][k - 1];
	}
	if (i == 8 && j != 0 && j != 8)
	{
	s[i][j][k] = s[i - 1][j][k - 1] + s[i][j + 1][k - 1] + s[i][j - 1][k - 1] + 2 * s[i][j][k - 1] + s[i - 1][j - 1][k - 1] + s[i - 1][j + 1][k - 1];
	}
	if (j == 8 && i != 0 && i != 8)
	{
	s[i][j][k] = s[i - 1][j][k - 1] + s[i + 1][j][k - 1] + s[i][j - 1][k - 1] + 2 * s[i][j][k - 1] + s[i + 1][j - 1][k - 1] + s[i - 1][j - 1][k - 1];
	}
	if (j == 0 && i != 0 && i != 8)
	{
	s[i][j][k] = s[i - 1][j][k - 1] + s[i + 1][j][k - 1] + s[i][j + 1][k - 1] + 2 * s[i][j][k - 1] + s[i + 1][j + 1][k - 1] + s[i - 1][j + 1][k - 1];
	}
	if (i != 0 && j != 0 && i != 8 && j != 8)
	{
	s[i][j][k] = s[i - 1][j][k - 1] + s[i + 1][j][k - 1] + s[i][j - 1][k - 1] + s[i][j + 1][k - 1] + 2 * s[i][j][k - 1] + s[i + 1][j - 1][k - 1] + s[i + 1][j + 1][k - 1] + s[i - 1][j - 1][k - 1] + s[i - 1][j + 1][k - 1];
	}
	}
	}
	}

	for (i = 0;i < 9;i++)
	{
		for (j = 0;j < 8;j++)
		{
		System.out.print(s[i][j][n]);
		System.out.print(" ");
		}
	System.out.print(s[i][8][n]);
	System.out.print("\n");
	}
	return 0;
	}

}

