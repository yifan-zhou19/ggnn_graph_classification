package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int h;
		int[][] a = new int[1000][1000];
		int result;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (h = 0;h < k;h++)
		{
			result = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 0;j < n;j++)
			{
				result = result + a[0][j] + a[m - 1][j];
			}
			for (i = 1;i < m - 1;i++)
			{
				result = result + a[i][0] + a[i][n - 1];
			}
			System.out.print(result);
			System.out.print("\n");
		}
		return 0;
	}
}

