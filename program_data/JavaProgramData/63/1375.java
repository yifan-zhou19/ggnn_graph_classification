package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int x1;
		int x2;
		int y1;
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
		 for (j = 0;j < (y2 - 1);j++)
		 {
		   c[i][j] = 0;
		   for (k = 0;k < y1 && k < x2;k++)
		   {
			  c[i][j] += a[i][k] * b[k][j];
		   }
		System.out.print(c[i][j]);
		System.out.print(" ");
		 }
		 c[i][y2 - 1] = 0;
		  for (k = 0;k < y1 && k < x2;k++)
		  {
			  c[i][y2 - 1] += a[i][k] * b[k][y2 - 1];
		  }
		  System.out.print(c[i][y2 - 1]);
		System.out.print("\n");
		}
	 return 0;
	}
}

