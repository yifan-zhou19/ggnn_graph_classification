package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
	   int i;
	   int j;
	   int k;
	   int num = 0;
	   int x1;
	   int y1;
	   int x2;
	   int y2;
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
			   num = 0;
			 for (k = 0;k < y1;k++)
			 {
			 num += (a[i][k] * b[k][j]);
			 }
	   c[i][j] = num;
		   }
	   }
		   for (i = 0;i < x1;i++)
		   {
				   if (i > 0)
				   {
					   System.out.print("\n");
				   }
		   for (j = 0;j < y2;j++)
		   {
			   System.out.print(c[i][j]);
		   if (j < y2 - 1)
		   {
			   System.out.print(' ');
		   }
		   }
		   }
		   return 0;


	}
}

