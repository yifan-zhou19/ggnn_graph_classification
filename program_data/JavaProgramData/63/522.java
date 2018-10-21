package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[3];
		int[] y = new int[3];
		int[][] a = new int[150][150];
		int[][] b = new int[150][150];
		int[][] c = new int[150][150];
		int i = 0;
		int j = 0;
		int k = 0;
		x[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x[1];i++)
		{
		   for (j = 1;j <= y[1];j++)
		   {
			  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		}
		x[2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y[2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x[2];i++)
		{
		   for (j = 1;j <= y[2];j++)
		   {
			  b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		}
		for (i = 1;i <= x[1];i++)
		{
		   for (j = 1;j <= y[2];j++)
		   {
			  c[i][j] = 0;
			  for (k = 1;k <= y[1];k++)
			  {
				 c[i][j] += a[i][k] * b[k][j];
			  }
		   }
		}
		for (i = 1;i <= x[1];i++)
		{
		   for (j = 1;j < y[2];j++)
		   {
			  System.out.print(c[i][j]);
			  System.out.print(" ");
		   }
		   System.out.print(c[i][y[2]]);
		   System.out.print("\n");
		}
		return 0;
	}

}

