package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[][][] zz = new int[11][11][5];
		 int i;
		 int j;
		 int k;
		 int m;
		 int n;
		 for (i = 0 ; i < 11 ; i++)
		 {
			 for (j = 0 ; j < 11 ; j++)
			 {
				 for (k = 0 ; k < 5 ; k++)
				 {
				 zz[i][j][k] = 0;
				 }
			 }
		 }
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 zz[5][5][n] = m;
		 while (n != 0)
		 {
			 for (i = 1 ; i < 10 ; i++)
			 {
				 for (j = 1 ; j < 10 ; j++)
				 {
					 if (zz[i][j][n] > 0)
					 {
						 zz[i][j][n - 1] += 2 * zz[i][j][n];
						 zz[i - 1][j - 1][n - 1] += zz[i][j][n];
						 zz[i - 1][j][n - 1] += zz[i][j][n];
						 zz[i - 1][j + 1][n - 1] += zz[i][j][n];
						 zz[i][j - 1][n - 1] += zz[i][j][n];
						 zz[i][j + 1][n - 1] += zz[i][j][n];
						 zz[i + 1][j - 1][n - 1] += zz[i][j][n];
						 zz[i + 1][j][n - 1] += zz[i][j][n];
						 zz[i + 1][j + 1][n - 1] += zz[i][j][n];
					 }
				 }
			 }
			 for (i = 0 ; i < 11 ; i++)
			 {
				 for (j = 0 ; j < 11 ; j++)
				 {
					 if (i == 0 || j == 0 || i == 10 || j == 10)
					 {
						 zz[i][j][n - 1] = 0;
					 }
				 }
			 }
			 n--;
		 }
		 for (i = 1 ; i < 10 ; i++)
		 {
			 for (j = 1 ; j < 10 ; j++)
			 {
				 if (j != 9)
				 {
				 System.out.print(zz[i][j][0]);
				 System.out.print(' ');
				 }
				 else
				 {
					 System.out.print(zz[i][j][0]);
				 }
			 }
			 System.out.print("\n");
		 }
	}
}

