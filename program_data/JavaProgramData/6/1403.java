package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100]; //???????????
		int k;
		int m;
		int n;
		int i;
		int j;
		int sum;
		int num;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			num = 0;
			sum = 0; //?????????????0
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0; i < m; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					num += a[i][j];
				}
			}
					//???????
			if (m == 1 || n == 1 || (m == 1 && n == 1))
			{
				System.out.print(num);
				System.out.print("\n");
			}
			else
			{
			for (i = 0; i < m; i += m - 1)
			{
				for (j = 0; j < n; j++)
				{
					sum += a[i][j]; //???????
				}
			}
			for (i = 0; i < m; i++)
			{
				for (j = 0; j < n; j += n - 1)
				{
					sum += a[i][j]; //???????
				}
			}
			sum = sum - a[0][0] - a[0][n - 1] - a[m - 1][0] - a[m - 1][n - 1];
			System.out.print(sum);
			System.out.print("\n");
			}
		}
			return 0;
	}

}

