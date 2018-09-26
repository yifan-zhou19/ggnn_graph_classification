package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int x2;
		int y1;
		int y2;
		int i;
		int j;
		int k;
		int[][] aa = new int[1000][1000];
		int[][] bb = new int[1000][1000];
		int[][] cc = new int[1000][1000];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x1;i++)
		{
		  for (j = 1;j <= y1;j++)
		  {
			  aa[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		}

		  x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   for (i = 1;i <= x2;i++)
		   {
		  for (j = 1;j <= y2;j++)
		  {
			  bb[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		   }
			 for (i = 1;i <= x1;i++)
			 {
				for (j = 1;j <= y2;j++)
				{
				 cc[i][j] = 0;
				   for (k = 1;k <= y1;k++)
				   {
					 cc[i][j] = cc[i][j] + aa[i][k] * bb[k][j];
				   }
				 if (j != y2)
				 {
				 System.out.print(cc[i][j]);
				 System.out.print(" ");
				 }
				 else
				 {
					 System.out.print(cc[i][j]);
					 System.out.print("\n");
				 }
				}
			 }
								   return 0;
	}
}

