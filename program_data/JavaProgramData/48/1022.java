package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[11][11];
	public static int n;
	public static int tian;
	public static void ff(int[][] a, int k)
	{
		 int[][] aa = new int[11][11];
		 for (int i = 1; i <= 9; ++i)
		 {
			for (int j = 1; j <= 9; ++j)
			{
			aa[i][j] = 0;
			}
		 }
		 for (int i = 1; i <= 9; ++i)
		 {
			for (int j = 1; j <= 9; ++j)
			{
					if (a[i][j] != 0)
					{
						aa[i][j] += 2 * a[i][j];
						aa[i + 1][j] += a[i][j];
						aa[i - 1][j] += a[i][j];
						aa[i][j + 1] += a[i][j];
						aa[i][j - 1] += a[i][j];
						aa[i + 1][j + 1] += a[i][j];
						aa[i + 1][j - 1] += a[i][j];
						aa[i - 1][j + 1] += a[i][j];
						aa[i - 1][j - 1] += a[i][j];
					}
			}
		 }
		 for (int i = 1; i <= 9; ++i)
		 {
			for (int j = 1; j <= 9; ++j)
			{
			a[i][j] = aa[i][j];
			}
		 }
		 if (k == tian)
		 {
			  for (int i = 1; i <= 9; ++i)
			  {
				  System.out.print(a[i][1]);
				  for (int j = 2; j <= 9; ++j)
				  {
						  System.out.print(" ");
						  System.out.print(a[i][j]);
				  }
				  System.out.print("\n");
			  }
		 }
		 else
		 {
			 ff(a, k + 1);
		 }
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		tian = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = n;
		ff(a, 1);
		//while(1);
		return 0;
	}

}

