package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[][] b = new int[101][101];
	int n;
	int m;
	int i;
	int j;
	int k;
	int h = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
		a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
	if (a[i][j] == '@')
	{
		b[i][j] = 101;
		h = h + 1;
	}
	else if (a[i][j] == '#')
	{
	b[i][j] = 0;
	}
	else
	{
		b[i][j] = 1;
	}
	}
	}

	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (k = 0;k < m - 1;k++)
	{
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	if (b[i][j] == 101 - k)
	{
		b[i][j] = 100 - k;
	if (i > 0 && b[i - 1][j] == 1)
	{
	b[i - 1][j] = 100 - k;
	}
	if (j > 0 && b[i][j - 1] == 1)
	{
	b[i][j - 1] = 100 - k;
	}
	if (i < n - 1 && b[i + 1][j] == 1)
	{
	b[i + 1][j] = 100 - k;
	}
	if (j < n - 1 && b[i][j + 1] == 1)
	{
	b[i][j + 1] = 100 - k;
	}
	}
	}
	}
	}
	h = 0;
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	if (b[i][j] != 0 && b[i][j] != 1)
	{
	h++;
	}
	}
	}
	System.out.print(h);
	System.out.print("\n");
	return 0;
	}
}

