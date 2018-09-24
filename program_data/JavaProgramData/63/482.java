package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int m;
		int n;
		int q;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < q;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < q;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (int t = 0;t < q;t++)
				{
					c[i][j] = c[i][j] + a[i][t] * b[t][j];
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.print(c[i][0]);
			for (j = 1;j < n;j++)
			{
				System.out.print(" ");
				System.out.print(c[i][j]);
			}
				System.out.print("\n");
		}
		return 0;
	}

}

