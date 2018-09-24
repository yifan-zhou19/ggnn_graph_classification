package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[100][100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 1 && n == 1)
			{
				int k;
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(k);
			}
			else
			{
			for (int i = 0;i < m;i++)
			{
				for (int j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int sum = 0;
			for (int j = 0;j < n;j++)
			{
				sum += *((a) + j) + *(*(a + m - 1) + j);
			}
			for (int i = 1;i < m - 1;i++)
			{
			   sum += *(*(a + i)) + *(*(a + i) + n - 1);
			}
			System.out.print(sum);
			System.out.print("\n");
			}
		}
		return 0;
	}
}

