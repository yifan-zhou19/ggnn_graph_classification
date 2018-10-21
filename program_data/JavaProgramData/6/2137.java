package <missing>;

public class GlobalMembers
{
	/*********************************
	 *??????????????.cpp *
	 *?????						 *
	 *????: 2012-11-10			 *
	 *?????????????		 *
	 *********************************/


	public static int Main()
	{
		int[][] a = new int[110][110];
		int num;
		int sum = 0;
		int k;
		int m;
		int n;
		int i;
		int j;
		int l;

		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 0; l < k; l++)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0; i < m; i++)
			{
				for (j = 0; j < n; j++)
				{
					num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					a[i][j] = num;
				}
			}

			for (i = 0; i < n; i++)
			{
				sum = sum + a[0][i];
			}
			for (i = 1; i < m; i++)
			{
				sum = sum + a[i][n - 1];
			}
			for (i = 1; i < m; i++)
			{
				sum = sum + a[i][0];
			}
			for (i = 1; i < n - 1; i++)
			{
				sum = sum + a[m - 1][i];
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

