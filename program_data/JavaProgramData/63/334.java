package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i; //i,j,k?????num??????????x1,x2,y1,y2???????????a,b??????????????c??????????
	   int j;
	   int k;
	   int num = 0;
	   int x1;
	   int x2;
	   int y1;
	   int y2;
	   int[][] a = new int[100][100];
	   int[][] b = new int[100][100];
	   int[][] c = new int[100][100];
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
					  c[i][j] = 0; //???????????
					  num++; //??c[i][j]????
					  for (k = 0;k < y1;k++)
					  {
							 c[i][j] = c[i][j] + a[i][k] * b[k][j];
					  }
					  if (num % y2 != 0)
					  {
						  System.out.print(c[i][j]);
						  System.out.print(' ');
					  }
					  else
					  {
						  System.out.print(c[i][j]);
						  System.out.print("\n");
					  }

			   }
		}
		return 0;
	}
}

