package <missing>;

public class GlobalMembers
{
	public static int[][][] a = new int[31][11][11];
	public static int m;
	public static void f(int k)
	{
		int i;
		int j;

	 if (k < m + 1)
	 {
	   for (i = 1;i <= 9;i++)
	   {
		   for (j = 1;j <= 9;j++)
		   {
			 a[k][i][j] = 2 * a[k - 1][i][j] + a[k - 1][i + 1][j] + a[k - 1][i - 1][j] + a[k - 1][i][j + 1] + a[k - 1][i][j - 1] + a[k - 1][i + 1][j + 1] + a[k - 1][i - 1][j + 1] + a[k - 1][i + 1][j - 1] + a[k - 1][i - 1][j - 1];
		   }
	   }
		f(k + 1);
	 }
	else
	{
		for (i = 1;i <= 9;i++)
		{
		  for (j = 1;j < 9;j++)
		  {
		System.out.print(a[m][i][j]);
		System.out.print(" ");
		  }
	   System.out.print(a[m][i][9]);
	System.out.print("\n");
		}
	}
	}
	public static int Main()
	{
	  int n;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  a[0][5][5] = n;
	  f(1);
	return 0;
	}


}

