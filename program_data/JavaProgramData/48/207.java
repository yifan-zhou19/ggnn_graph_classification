package <missing>;

public class GlobalMembers
{
	public static void germs(int n, int[][] a, int[][] b)
	{
		 int i;
		 int j;
		 if (n > 0)
		 {
			  for (i = 1;i <= 9;i++)
			  {
			 for (j = 1;j <= 9;j++)
			 {
			   b[i][j] = 0;
			 }
			  }

		   for (i = 1;i <= 9;i++)
		   {
			   for (j = 1;j <= 9;j++)
			   {
				 if (a[i][j] == 0)
				 {
					 continue;
				 }
			  else
			  {
					b[i][j] += a[i][j] * 2;
				 b[i + 1][j] += a[i][j];
				 b[i - 1][j] += a[i][j];
				 b[i][j + 1] += a[i][j];
				 b[i][j - 1] += a[i][j];
				 b[i + 1][j + 1] += a[i][j];
				 b[i - 1][j + 1] += a[i][j];
				 b[i + 1][j - 1] += a[i][j];
				 b[i - 1][j - 1] += a[i][j];
			  }
			   }
		   }
		   for (i = 1;i <= 9;i++)
		   {
			for (j = 1;j <= 9;j++)
			{
			  a[i][j] = b[i][j];
			}
		   }
		   germs(n - 1, a, b);
		 }
	}
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;

		germs(n, a, b);
		for (i = 1;i <= 9;i++)
		{
			 for (j = 1;j < 9;j++)
			 {
		   System.out.print(a[i][j]);
		   System.out.print(" ");
			 }
		   System.out.print(a[i][j]);
		   System.out.print("\n");
		}

	}
}

