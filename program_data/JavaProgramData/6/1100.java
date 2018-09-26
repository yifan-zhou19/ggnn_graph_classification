package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int[][] a = new int[101][101];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			int m;
			int n;
			int j1;
			int j2;
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j1 = 1;j1 <= m;j1++)
			{
				for (j2 = 1;j2 <= n;j2++)
				{
					*(*(a + j1) + j2) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (j2 = 1;j2 <= n;j2++)
			{
				sum = sum + *(*(a + 1) + j2) + *(*(a + m) + j2); //??????
			}
			for (j1 = 2;j1 <= m - 1;j1++)
			{
				sum = sum + *(*(a + j1) + 1) + *(*(a + j1) + n);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

