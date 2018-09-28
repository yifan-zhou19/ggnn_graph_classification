package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int i;
		int j;
		int q;
		int[][] c = new int[100][100];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= x1 - 1;i++)
		{
						  for (j = 0;j <= y1 - 1;j++)
						  {
											a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
											/*????A[m][q]*B[q][n], 
	????????C[m][n]?????C?????? 
	C[i][j] = A[i][0]*B[0][j] + A[i][1]*B[1][j] + ..... + A[i][q]*B[q][j] */

						  }
		}
											x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
											y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
											for (i = 0;i <= x2 - 1;i++)
											{
															  for (j = 0;j <= y2 - 1;j++)
															  {
																				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
															  }
											}
				   for (i = 0;i <= x1 - 1;i++)
				   {
						   for (j = 0;j <= y2 - 1;j++)
						   {
											   c[i][j] = 0;
						   }
				   }


		 for (i = 0;i <= x1 - 1;i++)
		 {
						   for (j = 0;j <= y2 - 1;j++)
						   {
						   for (q = 0;q <= y1 - 1;q++)
						   {
											   c[i][j] = c[i][j] + a[i][q] * b[q][j];
						   }
						   }
		 }

				   for (i = 0;i <= x1 - 1;i++)
				   {
			 if (y2 != 1)


			 {
						  System.out.print(c[i][0]);
						   for (j = 1;j <= y2 - 1;j++)
						   {
											   System.out.print(" ");
											   System.out.print(c[i][j]);
											   if (j == y2 - 1)
											   {
														  System.out.print("\n");
											   }
						   }
			 }
														  else
														  {
															  System.out.print(c[i][0]);
															  System.out.print("\n");
														  }
				   }









		return 0;
	}

}

