package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x1;
	int x2;
	int y1;
	int y2;
	int i;
	int j;
	int k;
	int t;
	int[][] a = new int[102][102];
	int[][] b = new int[102][102];
	int p;
	int q;
	int z;
	int[][] c = new int[125][125];
	int g;
	int h;
	x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= x1;i++)
	{
	for (j = 1;j <= y1;j++)
	{
		a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (p = 1;p <= x2;p++)
	{
	for (q = 1;q <= y2;q++)
	{
		b[p][q] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	for (k = 1;k <= x1;k++)
	{
	for (t = 1;t <= y2;t++)
	{
		c[k][t] = 0;
		for (z = 1;z <= x2;z++)
		{
			c[k][t] = c[k][t] + a[k][z] * b[z][t];
		}
	}
	}
	for (g = 1;g <= x1;g++)
	{
		for (h = 1;h <= y2 - 1;h++)
		{
			System.out.print(c[g][h]);
			System.out.print(" ");
		}
		System.out.print(c[g][y2]);
		System.out.print("\n");
	}
	return 0;
	}
}

