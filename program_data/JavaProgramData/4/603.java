package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; ///????
		int m;
		int[][] a = new int[100][100];
		int[] b = new int[10000];
		int i;
		int j;
		int sum;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			for (sum = 2;sum <= (n + m);sum++)
			{

				for (j = 1;j <= n;j++)

				{
					if ((sum - j) > 0 && (sum - j) <= m)
					{
						t++;
						b[t] = a[j][sum - j];
					}

				}
			}

			for (i = 1;i <= (m * n);i++)
			{
				System.out.print(b[i]);
				System.out.print("\n");
			}
			return 0;
	}
}

