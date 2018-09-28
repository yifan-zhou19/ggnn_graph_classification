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
		int sum;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] a = new int[m][n];
			for (i = 0; i < m; i++)
			{
				for (j = 0; j < n; j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			if (m == 1) //??????,????????
			{
				for (i = 0; i < n; i++)
				{
					sum += *((a) + i);
				}
				System.out.print(sum);
				System.out.print("\n");
				continue;
			}
			if (n == 1)
			{
				for (i = 0; i < m; i++)
				{
					sum += *(*(a + i));
				}
				System.out.print(sum);
				System.out.print("\n");
				continue;
			}
			for (i = 0; i < n; i++) //????????????
			{
				sum += *((a) + i);
				sum += *(*(a + m - 1) + i);
			}
			for (i = 1; i < m - 1; i++) //????????????
			{
				sum += *(*(a + i));
				sum += *(*(a + i) + n - 1);
			}
			System.out.print(sum);
			System.out.print("\n");
		}

		return 0;
	}

}

