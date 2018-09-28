package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[100][100];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int i = 0;i < m + n - 1;i++)
		{
			for (int j = n - 1;j >= 0;j--)
			{
				if (i - j < m && i - j >= 0)
				{
					System.out.print((*(a + i - j) + j));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

