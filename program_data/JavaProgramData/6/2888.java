package <missing>;

public class GlobalMembers
{
	public static int[][][] a = new int[100][100][100];
	public static int Main()
	{
		int k;
		int[] m = new int[100];
		int[] n = new int[100];
		int i;
		int j;
		int t;
		int[] s = new int[100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
				s[i] = 0;
				m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				for (j = 0;j < m[i];j++)
				{
					for (t = 0;t < n[i];t++)
					{
						a[i][j][t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					}
				}
				for (t = 0;t < n[i];t++)
				{
					s[i] += (a[i][0][t] + a[i][m[i] - 1][t]);
				}
				for (j = 0;j < m[i];j++)
				{
					s[i] += (a[i][j][0] + a[i][j][n[i] - 1]);
				}
				s[i] = s[i] - a[i][0][0] - a[i][0][n[i] - 1] - a[i][m[i] - 1][0] - a[i][m[i] - 1][n[i] - 1];
		}
		for (i = 0;i < k;i++)
		{
			System.out.print(s[i]);
			System.out.print("\n");
		}

		return 0;
	}
}

