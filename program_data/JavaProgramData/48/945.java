package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[20][20];
		int[] x = {0, 1, 0, -1, 1, 1, -1, -1};
		int[] y = {1, 0, -1, 0, 1, -1, 1, -1};
		int[][] taken = new int[20][20];
		a[5][5] = n;
		for (int p = 0;p < m;p++)
		{
			for (int i = 1;i < 10;i++)
			{
				for (int j = 1;j < 10;j++)
				{
						for (int i_ = 0;i_ < 8;i_++)
						{
							taken[i + x[i_]][j + y[i_]] = a[i][j] + taken[i + x[i_]][j + y[i_]];
						}
						taken[i][j] = taken[i][j] + a[i][j] * 2;
				}
			}
		   for (int i = 1;i < 10;i++)
		   {
			   for (int j = 1;j < 10;j++)
			   {
				  a[i][j] = taken[i][j];
				  taken[i][j] = 0;
			   }
		   }
		}
		for (int i = 1;i < 10;i++)
		{
			for (int j = 1;j < 9;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(' ');
			}
			System.out.print(a[i][9]);
			System.out.print("\n");
		}

		return 0;
	}

}

