package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row = 0;
		int col = -1;
		int i;
		int j;
		int m;
		int n;
		int t = 1;
		int p = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k = m * n;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		do
		{
			for (i = 0;i < n;i++)
			{
				col += t;
				System.out.print(a[row][col]);
				System.out.print("\n");

				p++;
			}
			n--;
			m--;
			for (i = 0;i < m;i++)
			{
				row += t;
				System.out.print(a[row][col]);
				System.out.print("\n");
				p++;
			}
			t = -t;
		}while (p < k);
		return 0;
	}
}

