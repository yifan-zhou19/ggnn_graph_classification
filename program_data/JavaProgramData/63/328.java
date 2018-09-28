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
	  int p;
	  int q;
	  int[][] a = new int[100][100];
	  int[][] b = new int[100][100];
	  int[][] c = new int[100][100];
	  x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i < x1;i++)
	  {
		  for (p = 0;p < y1;p++)
		  {
			 a[i][p] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
	  }
	  x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (q = 0;q < x2;q++)
	  {
		  for (j = 0;j < y2;j++)
		  {
			 b[q][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
	  }
	  for (i = 0;i < x1;i++)
	  {
		  for (j = 0;j < y2;j++)
		  {
			  for (p = 0;p < y1;p++)
			  {
				 c[i][j] += a[i][p] * b[p][j];
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
	  return 0; //?????
	}

}

