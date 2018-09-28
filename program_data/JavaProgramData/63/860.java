package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int x1;
	   int y1;
	   int x2;
	   int y2;
	   int i;
	   int j;
	   int t;
	   int[][] a = new int[101][101];
	   int[][] b = new int[101][101];
	   int[][] c = new int[101][101];
	   x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= x1;i++)
	   {
		   for (j = 1;j <= y1;j++)
		   {
		   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
	   }
	   x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x2;i++)
		{
		   for (j = 1;j <= y2;j++)
		   {
		   b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		}
		 for (i = 1;i <= x1;i++)
		 {
		   for (j = 1;j <= y2;j++)
		   {
			   c[i][j] = 0;
			   for (t = 1;t <= y1;t++)
			   {
				   c[i][j] = c[i][j] + a[i][t] * b[t][j];
			   }
		   }
		 }
		  for (i = 1;i <= x1;i++)
		  {
		   System.out.print(c[i][1]);
		   if (y2 == 1)
		   {
			   System.out.print("\n");
		   }
		   else
		   {
			  for (j = 2;j < y2;j++)
			  {
			  System.out.print(' ');
			  System.out.print(c[i][j]);
			  }
			  System.out.print(' ');
			  System.out.print(c[i][y2]);
			  System.out.print("\n");
		   }
		  }
	return 0;

	}
}

