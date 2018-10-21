package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i = 1;
		int j = 1;
		int tempi = 1;
		int tempj = 1;
		int[][] a = new int[100][100];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int s = 1;s <= m;s++)
		{
			for (int t = 1;t <= n;t++)
			{
				a[s][t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		while (tempi != m || tempj != n)
		{
			do
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				i++;
				j--;
			} while (j != 0 && i != m + 1);
			if (tempj != n)
			{
				tempj++;
				i = tempi;
				j = tempj;
			}
			else
			{
				tempi++;
				i = tempi;
				j = tempj;
			}
		}
		System.out.print(a[m][n]);
		return 0;
	}

}

