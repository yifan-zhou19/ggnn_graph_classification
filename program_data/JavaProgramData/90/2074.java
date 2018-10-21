package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1100][1100];
	public static int[][] sa = new int[1100][1100];
	public static int an(int m,int n)
	{
	if (sa[m][n] == 1)
	{
		return a[m][n];
	}
	if (m >= n)
	{
		a[m][n] = an(m - n, n) + an(m, n - 1);
		sa[m][n] = 1;
		return a[m][n];
	}
	if (m < n)
	{
		a[m][n] = an(m, n - 1);
		sa[m][n] = 1;
		return a[m][n];
	}
	return 0;
	}
	public static int Main()
	{
	int t;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a[1][1] = 1;
	sa[1][1] = 1;
	a[0][0] = 1;
	for (int i = 0;i <= 1000;i++)
	{
		sa[i][0] = 1;
	}
	int M;
	int N;
	for (int i = 0;i < t;i++)
	{
	M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(an(M, N));
	System.out.print("\n");
	}
	return 0;
	}
	/*
	7 3 = 4 3 + 7 2
	4 3 = 1 3 + 4 2
	1 3 = 1
	4 2 = 1 + 1
	4 1 = 3 1 = 2 1 = 1 1 = 1
	2 2 = 2 1=1
	*/

}

