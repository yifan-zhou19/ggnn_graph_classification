package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //k cases,m rows,n columns;
		int j;
		int sum;
		int m;
		int n;
		int k;
		int[][] a = new int[MAX_LEN][MAX_LEN];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (sum = i = 0;i < m;i++) //the first column and the last column
			{
				sum = sum + a[i][0] + a[i][n - 1];
			}
			for (j = 1;j < n - 1;j++)
			{
				sum = sum + a[0][j] + a[m - 1][j]; //the first row and the last row(not including corner)
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

