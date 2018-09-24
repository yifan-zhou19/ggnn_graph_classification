package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (num-- != 0)
		{
			int[][] a = new int[100][100];
			int m;
			int n;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int i;
			int j;
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int sum = 0;
			for (i = 0;i < m;i++)
			{
				if (n == 1)
				{
					sum += a[i][0];
				}
				else
				{
					sum += a[i][0];
					sum += a[i][n - 1];
				}
			}
			for (j = 1;j < n - 1;j++)
			{
				if (m == 1)
				{
					sum += a[0][j];
				}
				else
				{
					sum += a[0][j];
					sum += a[m - 1][j];
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

