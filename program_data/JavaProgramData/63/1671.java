package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int p;
		int q;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[][] a = new int[100][100];
	int[][] b = new int[100][100];
	int i;
	int j;
	int sum;
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < m;j++)
	{
		a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < p;i++)
	{
	for (j = 0;j < q;j++)
	{
		b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	int[][] c = new int[100][100];
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < q;j++)
	{
		c[i][j] = 0;
		int k;
	for (k = 0;k < m;k++)
	{
	c[i][j] += a[i][k] * b[k][j];
	}
	System.out.print(c[i][j]);
	if (j == q - 1 && i != n - 1)
	{
	System.out.print("\n");
	}
	else if (j == q - 1 && i == n - 1)
	{
		 break;
	}
	else if (j != q - 1)
	{
	System.out.print(' ');
	}
	}
	}



	 return 0;
	}

}

