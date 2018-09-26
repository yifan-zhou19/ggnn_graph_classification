package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		for (int i = 0;i < m;i++)
		{
		  for (int j = 0;j < n;j++)
		  {
		  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		}
		for (int i = 0;i < m + n - 1;i++)
		{
		  for (int j = 0;j <= i;j++)
		  {
			if ((j < m) && (i - j < n))
			{
			System.out.print((*(a + j) + i - j));
			System.out.print("\n");
			}
		  }
		}
		return 0;
	}

}

