package <missing>;

public class GlobalMembers
{
	public static int[][] mat = new int[MAX][MAX];
	public static int Main()
	{
	//	ifstream cin("a.txt");
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			int m;
			int n;
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i < m;i++)
			{
				for (int j = 0;j < n;j++)
				{
					mat[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int j = 0;j < n;j++)
			{
				if (m > 1)
				{
					sum += mat[m - 1][j];
				}
				sum += mat[0][j];
			}
			for (int i = 1;i < m - 1;i++)
			{
				if (n > 1)
				{
					sum += mat[i][n - 1];
				}
				sum += mat[i][0];

			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}


}

