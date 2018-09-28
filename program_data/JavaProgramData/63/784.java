package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int k;
	 int x;
	 int y;
	 x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int[][] a = new int[100][100];
	 for (i = 0;i < x;i++)
	 {
		  for (j = 0;j < y;j++)
		  {
	   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
	 }
	 int z;
	 int h;
	 z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int[][] b = new int[100][100];
	 for (i = 0;i < z;i++)
	 {
			for (j = 0;j < h;j++)
			{
		 b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
	 }
	 int m = x;
	 int n = h;
	 int[][] c = new int[m][n];
	  for (j = 0;j < n;j++)
	  {
			  for (i = 0;i < m;i++)
			  {
			   c[i][j] = 0;
			for (k = 0;k < y;k++)
			{
			c[i][j] += a[i][k] * b[k][j];
			}
			  }
	  }
	for (i = 0;i < m;i++)
	{
		   for (j = 0;j < n - 1;j++)
		   {
			System.out.print(c[i][j]);
			System.out.print(" ");
		   }
		System.out.print(c[i][n - 1]);
		System.out.print("\n");
	}
	return 0;
	}



}

