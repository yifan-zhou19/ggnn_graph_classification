package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int j;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[][] a = new int[11][11];
	int[][] save = new int[11][11];
	a[5][5] = m;
	while (n-- != 0)
	{
	for (i = 1;i <= 9;i++)
	{
	for (j = 1;j <= 9;j++)
	{
	if (a[i][j] != 0)
	{
	save[i - 1][j] += a[i][j];
	save[i + 1][j] += a[i][j];
	save[i][j - 1] += a[i][j];
	save[i][j + 1] += a[i][j];
	save[i - 1][j - 1] += a[i][j];
	save[i - 1][j + 1] += a[i][j];
	save[i + 1][j - 1] += a[i][j];
	save[i + 1][j + 1] += a[i][j];
	a[i][j] *= 2;
	}
	}
	}
	for (i = 1;i <= 9;i++)
	{
	for (j = 1;j <= 9;j++)
	{
	if (save[i][j] != 0)
	{
		a[i][j] += save[i][j];
	save[i][j] = 0;
	}
	}
	}
	}
	for (i = 1;i <= 9;i++)
	{
	for (j = 1;j <= 8;j++)
	{
	System.out.print(a[i][j]);
	System.out.print(' ');
	}
	System.out.print(a[i][9]);
	System.out.print("\n");
	}
	return 0;
	}
}

