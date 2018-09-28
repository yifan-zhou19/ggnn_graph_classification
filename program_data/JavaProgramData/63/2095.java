package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int x2;
		int y1;
		int y2;
		int d = 0;
		int i;
		int j;
		int k;
		1 <= x1,x2,y1,y2 <= 100;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[x1][y1];
		for (i = 0;i <= x1 - 1;i++)
		{
		   for (k = 0;k <= y1 - 1;k++)
		   {
			 a[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] b = new int[x2][y2];
		int[][] c = new int[x1][y2];
		 for (k = 0;k <= x2 - 1;k++)
		 {
			for (j = 0;j <= y2 - 1;j++)
			{
			  b[k][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		 }
		for (i = 0;i <= x1 - 1;i++)
		{
		  for (j = 0;j <= y2 - 2;j++)
		  {
			for (k = 0;k <= y1 - 1;k++)
			{
			  d = d + a[i][k] * b[k][j];
			}
			c[i][j] = d;
			d = 0;
			System.out.print(c[i][j]);
			System.out.print(" ");
		  }
			 for (j = y2 - 1;j <= y2 - 1;j++)
			 {
				 for (k = 0;k <= y1 - 1;k++)
				 {
				d = d + a[i][k] * b[k][j];
				 }
			  c[i][j] = d;
			  d = 0;
			System.out.print(c[i][j]);
			System.out.print("\n");
			 }
		}
	}
}

