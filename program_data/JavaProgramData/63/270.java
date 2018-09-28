package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[100][100];
	   int[][] b = new int[100][100];
	   int[][] c = new int[100][100];
	   int sum = 0;
	   int k;
	   int x1;
	   int y1;
	   int x2;
	   int y2;
	   int i;
	   int j;
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
				  for (k = 0;k < x2;k++)
				  {
					  sum = sum + a[i][k] * b[k][j];
				  }
				  c[i][j] = sum;
				  sum = 0;
			  }
		}
		  for (i = 0;i < x1;i++)
		  {
			  for (j = 0;j < y2;j++)
			  {

				  if (j == 0)
				  {
					  if (y2 == 1)
					  {
						  System.out.print(c[i][j]);
						  System.out.print("\n");
					  }
						else
						{
							System.out.print(c[i][j]);
						}
				  }
				  else if (j == y2 - 1)
				  {
					  System.out.print(' ');
					  System.out.print(c[i][j]);
					  System.out.print("\n");
				  }
				  else
				  {
					  System.out.print(' ');
					  System.out.print(c[i][j]);
				  }
			  }
		  }


		return 0;
	}

}

