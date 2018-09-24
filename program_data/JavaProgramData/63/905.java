package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int i;
		int j;
		int k;
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
			for (j = 0;j < y2;j++)
			{
				c[i][j] = a[i][0] * b[0][j];
		 for (k = 1;k < x2;k++)
		 {
	   c[i][j] = c[i][j] + a[i][k] * b[k][j];
		 }
			}
		  }

			for (i = 0;i < x1;i++)
			{
			  System.out.print(c[i][0]);
		  for (j = 1;j < y2;j++)
		  {
			  System.out.print(" ");
			  System.out.print(c[i][j]);
		  }
			  System.out.print("\n");
			}

		return 0;
	}


}

