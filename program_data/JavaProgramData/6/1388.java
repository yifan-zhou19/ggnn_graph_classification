package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[][] a = new int[100][100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m;
		int n;
		int i;
		int j;
		int sum;
		for (int l = 0; l < k; l++)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0; i < m; i++)
			{
				for (j = 0; j < n; j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (j = 0; j < n; j++)
			{
				if (m - 1 != 0)
				{
					sum += *(*(a + 0) + j) + *(*(a + m - 1) + j); //??????????????
				}
				else
				{
					sum += *(*(a + 0) + j); //????1?
				}
			}
			for (i = 1; i < m - 1; i++)
			{
				sum += *(*(a + i) + 0) + *(*(a + i) + n - 1); //???????????????????sum?
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

