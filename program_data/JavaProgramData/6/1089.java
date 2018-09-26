package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int m;
		int n;
		int[][] a = new int[100][100];
		int sum;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		for (i = 0;i < t;i++)
		{
						m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						sum = 0;
						for (j = 0;j < m;j++)
						{
						for (k = 0;k < n;k++)
						{
						a[j][k] = 0;
						}
						}
						for (j = 0;j < m;j++)
						{
						for (k = 0;k < n;k++)
						{
						a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						}
						}
						for (j = 0;j < n;j++)
						{
										sum = sum + a[0][j];
										sum = sum + a[m - 1][j];
						}
						for (k = 1;k < m - 1;k++)
						{
										  sum = sum + a[k][0];
										  sum = sum + a[k][n - 1];
						}
						System.out.print(sum);
						System.out.print("\n");
		}
	return 0;
	}

}

