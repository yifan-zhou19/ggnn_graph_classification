package <missing>;

public class GlobalMembers
{
	/**
	* @file 1.cpp
	* @author ???
	* @date 2011-10-26
	* @description
	* ??????:?????????
	*/
	public static int Main()
	{
		int[][] a = new int[100][100];
		int j;
		int i;
		int l;
		int p;
		int q;
		int k;
		int m;
		int n;
		int sum;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < k; i++)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1; j <= m; j++)
			{
				for (l = 1; l <= n; l++)
				{
					a[j][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (p = 1; p <= n; p++)
			{
				sum = sum + a[1][p] + a[m][p];
			}
			for (q = 2; q < m; q++)
			{
				sum = sum + a[q][1] + a[q][n];
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

