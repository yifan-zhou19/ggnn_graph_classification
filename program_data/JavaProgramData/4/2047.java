package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int min;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[m][n];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
				min = (m - 1 > j != 0? j:m - 1);
			 for (i = 0;i <= min;i++) //????????????????
			 {
				System.out.print(a[i][j - i]);
				System.out.print("\n");
			 }
		}
		for (j = n;j <= m + n - 2;j++)
		{
				min = (m - 1 > j != 0? j:m - 1);
			for (i = j - (n - 1);i <= min;i++) //????????????????????????????????????
			{
				System.out.print(a[i][j - i]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

