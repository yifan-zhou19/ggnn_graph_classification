package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int i;
		int j;
		int k;
		int l;
		int x2;
		int y2;
		int[][] a = new int[200][200];
		int[][] b = new int[200][200];
		int[][] c = new int[200][200];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
			  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			  System.out.print("\n");
		}
		 x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0;i < x2;i++)
		 {
		   for (j = 0;j < y2;j++)
		   {
			 b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
			 System.out.print("\n");
		 }
		 for (i = 0;i < x1;i++)
		 {
			for (j = 0;j < y2;j++)
			{
			   for (k = 0;k < y1;k++)
			   {
			   c[i][j] += a[i][k] * b[k][j];
			   }
			}
		 }
		  for (i = 0;i < x1;i++)
		  {
			   for (j = 0;j < y2 - 1;j++)
			   {
			System.out.print(c[i][j]);
			System.out.print(" ");
			   }
			System.out.print(c[i][y2 - 1]);
			System.out.print("\n");
		  }
			int ss;
			ss = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			return 0;
	}

}

