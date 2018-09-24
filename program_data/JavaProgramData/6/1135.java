package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num_data;
		num_data = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 while (num_data-- != 0)
		 {
			int[][] a = new int[100][100];
			int m;
			int n;
			int sum = 0;

			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i != m;i++)
			{
				for (int j = 0;j != n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			if (m == 1)
			{
				for (int k = 0;k != n;k++)
				{
					sum += a[0][k];
				}
			}
			else if (n == 1)
			{
				for (int k = 0;k != m;k++)
				{
					sum += a[k][0];
				}
			}
			else
			{
				for (int k = 0;k != n - 1;k++)
				{
					sum += a[0][k];
				}
				for (int k = 0;k != m - 1;k++)
				{
					sum += a[k][n - 1];
				}
				for (int k = n - 1;k != 0;k--)
				{
					sum += a[m - 1][k];
				}
				for (int k = m - 1;k != 0;k--)
				{
					sum += a[k][0];
				}
			}

			System.out.print(sum);
			System.out.print("\n");
		 }
		return 0;
	}
}

