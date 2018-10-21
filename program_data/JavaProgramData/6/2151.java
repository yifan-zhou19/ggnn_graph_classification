package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		int sum;
		int[][] a = new int[100][100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k > 0)
		{
			sum = 0;
			k--;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (j = 0;j < n;j++)
			{
				if (m == 1)
				{
					sum += *(a + j);
				}
				else
				{
					sum += *(a + j) + *(*(a + m - 1) + j);
				}
			}
			for (i = 1;i < m - 1;i++)
			{
				sum += a[i][0] + a[i][n - 1];
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

