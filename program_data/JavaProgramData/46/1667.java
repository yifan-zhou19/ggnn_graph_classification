package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int t;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[][] a = new int[m][n];
	for (int i = 0;i < m;i++)
	{
	for (int j = 0;j < n;j++)
	{
	a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	if (m <= n)
	{
	t = m;
	}
	else
	{
		t = n;
	}
	for (int i = 0;i < t / 2;i++)
	{
	for (int j = i;j < n - i;j++)
	{
	System.out.print(a[i][j]);
	System.out.print("\n");
	}
	for (int j = i + 1;j < m - i;j++)
	{
	System.out.print(a[j][n - i - 1]);
	System.out.print("\n");
	}
	for (int j = i + 1;j < n - i;j++)
	{
	System.out.print(a[m - 1 - i][n - 1 - j]);
	System.out.print("\n");
	}
	for (int j = i + 1;j < m - i - 1;j++)
	{
	System.out.print(a[m - 1 - j][i]);
	System.out.print("\n");
	}
	}
	if (m <= n != 0 && m % 2 == 1)
	{
	for (int j = (m - 1) / 2;j < n - (m - 1) / 2;j++)
	{
	System.out.print(a[(m - 1) / 2][j]);
	System.out.print("\n");
	}
	}
	if (m > n && n % 2 == 1)
	{
	for (int j = (n - 1) / 2;j < m - (n - 1) / 2;j++)
	{
	System.out.print(a[j][(n - 1) / 2]);
	System.out.print("\n");
	}
	}
	return 0;
	}

}

