package <missing>;

public class GlobalMembers
{
	/*??????????  ??*/
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int[][][] a = new int[100][100][100];
		int[] b = new int[100];
		int[] m = new int[100];
		int[] n = new int[100];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m[i];j++)
			{
				for (k = 0;k < n[i];k++)
				{
					a[i][j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 0;j < m[i];j++)
			{
				b[i] = b[i] + a[i][j][0] + a[i][j][n[i] - 1];
			}
			for (j = 0;j < n[i];j++)
			{
				b[i] = b[i] + a[i][0][j] + a[i][m[i] - 1][j];
			}
			b[i] = b[i] - a[i][0][0] - a[i][m[i] - 1][0] - a[i][0][n[i] - 1] - a[i][m[i] - 1][n[i] - 1];
			System.out.print(b[i]);
			System.out.print("\n");
		}
			return 0;
	}

}

