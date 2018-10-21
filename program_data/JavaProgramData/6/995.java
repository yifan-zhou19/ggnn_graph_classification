package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int m;
		int sum = 0;
		int i;
		int j;
		int p;
		int[][] a = new int[100][100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k > 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0 ; i < m ; i++)
			{
				 for (j = 0 ; j < n ; j++)
				 {
					 a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 }
			}
			if (n == 1 && m == 1)
			{
				System.out.print(a[0][0]);
				System.out.print("\n");
			}
			else if (n == 1 && m > 1)
			{
				for (i = 0 ; i < m ; i++)
				{
					sum += a[i][0];
				}
				System.out.print(sum);
				System.out.print("\n");
				sum = 0;
			}
			else if (n > 1 && m == 1)
			{
				for (j = 0 ; j < n ; j++)
				{
					sum += a[0][j];
				}
				System.out.print(sum);
				System.out.print("\n");
				sum = 0;
			}
			else
			{
				for (i = 0 ; i < m ;i++)
				{
					sum += a[i][0] + a[i][n - 1];
				}
				for (j = 0 ; j < n ; j++)
				{
					sum += a[0][j] + a[m - 1][j];
				}
				sum -= a[0][0] + a[0][n - 1] + a[m - 1][0] + a[m - 1][n - 1];
				System.out.print(sum);
				System.out.print("\n");
			}
			sum = 0;
			k--;
		}
	}
}

