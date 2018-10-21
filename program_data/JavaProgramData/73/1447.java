package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int[][] c = new int[5][5];
		int i;
		int k;
		int t;
		int m = 0;
		int x;
		int y;
		for (i = 0;i < 5;i++)
		{
			for (k = 0;k < 5;k++)
			{
				a[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				b[i][k] = a[i][k];
				c[i][k] = a[i][k];
				System.out.print("\n");
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (t = 0;t < 4;t++)
			{
				if (b[i][t] > b[i][t + 1])
				{
					k = b[i][t + 1];
					b[i][t + 1] = b[i][t];
					b[i][t] = k;
				}
			}
		}
		for (t = 0;t < 5;t++)
		{
			for (i = 0;i < 4;i++)
			{
				if (c[i][t] < c[i + 1][t])
				{
					k = c[i + 1][t];
					c[i + 1][t] = c[i][t];
					c[i][t] = k;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (t = 0;t < 5;t++)
			{
				if (b[i][4] == c[4][t])
				{
					m++;
					x = i + 1;
					y = t + 1;
				}
			}
		}
		if (m == 0)
		{
			System.out.print("not found");
		}
		else
		{
		System.out.print(x);
		System.out.print(" ");
		System.out.print(y);
		System.out.print(" ");
		System.out.print(b[x - 1][4]);
		System.out.print("\n");
		}
		return 0;
	}
}

