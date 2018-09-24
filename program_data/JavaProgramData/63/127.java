package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int x1;
	   int y1;
	   int x2;
	   int y2;
	   int[][] a = new int[100][100];
	   int[][] b = new int[100][100];
	   int[][] c = new int[100][100];
	   int i;
	   int j;
	   int k;
	   int m;
	   x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < x1;i++)
	   {
		   for (j = 0;j < y1;j++)
		   {
			   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
	   }
	   x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < x2;i++)
	   {
		   for (j = 0;j < y2;j++)
		   {
			   b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
	   }
	   for (i = 0;i < x1;i++)
	   {
		   for (j = 0;j < y2 - 1;j++)
		   {
			   for (k = 0;k < x2;k++)
			   {
				   c[i][j] = c[i][j] + a[i][k] * b[k][j];
			   }
			   System.out.print(c[i][j]);
			   System.out.print(" ");
		   }
		   for (m = 0;m < x2;m++)
		   {
			   c[i][y2 - 1] = c[i][y2 - 1] + a[i][m] * b[m][y2 - 1];
		   }
		   System.out.print(c[i][y2 - 1]);
		   System.out.print("\n");
	   }
		return 0;
	}
}

