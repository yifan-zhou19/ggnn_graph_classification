package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m = 0;
		int n = 0;
		while ((m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			int result = 0;
			int[][] num = new int[100][100];
			int i;
			int j;
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 0;j < n;j++)
			{
				result += num[0][j] + num[m - 1][j];
			}
			for (i = 1;i < (m - 1);i++)
			{
				result += num[i][0] + num[i][n - 1];
			}
			System.out.print(result);
			System.out.print("\n");
		}
		return 0;
	}

}

