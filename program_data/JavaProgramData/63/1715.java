package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int n;
		int m;
		int n2;
		int m2;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m2;i++)
		{
			for (j = 0;j < n2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n2;j++)
			{
				c[i][j] = 0;
				for (k = 0;k < n;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				if (j != n2 - 1)
				{
					System.out.print(c[i][j]);
					System.out.print(' ');
				}
				else
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
			}
		}

	}
}

