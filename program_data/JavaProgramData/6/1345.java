package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < k;i++)
		{
			int m;
			int n;
			int[][] board = new int[100][100];
			int sum = 0;
			int[] p = new int[100];
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0;j < m;j++)
			{
			  for (int p = 0;p < n;p++)
			  {
				board[j][p] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  }
			}
			for (int j = 0;j < m;j++)
			{
			  for (int p = 0;p < n;p++)
			  {
				  if (j == 0 || j == m - 1 || p == 0 || p == n - 1)
				  {
					sum += board[j][p];
				  }
			  }
			}
			  System.out.print(sum);
			  System.out.print("\n");
		}

		return 0;
	}
}

