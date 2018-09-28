package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int m;
		int n;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		int h = 0;
		for (i = 0;i < k;i++)
		{
			int b = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m;j++)
			{
				for (h = 0;h < n;h++)
				{
					*(*(a + j) + h) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (j = 0;j < m;j++)
			{
				b = b + **(a + j);
			}
			for (j = 1;j < n;j++)
			{
				b = b + *(a + j);
			}
			for (j = 1;j < m;j++)
			{
				b = b + *(*(a + j) + n - 1);
			}
			for (j = 1;j < n - 1;j++)
			{
				b = b + *(*(a + m - 1) + j);
			}
			System.out.print(b);
			System.out.print("\n");

		}
		return 0;

	}
}

