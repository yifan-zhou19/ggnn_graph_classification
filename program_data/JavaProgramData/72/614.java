package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
	   int[][] array = new int[21][21];
	   int i;
	   int j;
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= m;i++)
	   {
		   for (j = 1;j <= n;j++)
		   {
			   array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
	   }
	   if (array[1][1] >= array[1][2] != 0 && array[1][1] >= array[2][1])
	   {
		   System.out.print(0);
		   System.out.print(' ');
		   System.out.print(0);
		   System.out.print("\n");
	   }
	   for (i = 2;i < n;i++)
	   {
		   if (array[1][i] >= array[1][i - 1] != 0 && array[1][i] >= array[1][i + 1] != 0 && array[1][i] >= array[2][i])
		   {
			   System.out.print(0);
			   System.out.print(' ');
			   System.out.print(i - 1);
			   System.out.print("\n");
		   }
	   }
	   if (array[1][n] >= array[1][n - 1] != 0 && array[1][n] >= array[2][n])
	   {
		   System.out.print(0);
		   System.out.print(' ');
		   System.out.print(n - 1);
		   System.out.print("\n");
	   }
	   for (i = 2;i < m;i++)
	   {
			  for (j = 1;j <= n;j++)
			  {
				  if (j == 1)
				  {
					  if (array[i][1] >= array[i - 1][1] != 0 && array[i][1] >= array[i + 1][1] != 0 && array[i][1] >= array[i][2])
					  {
						  System.out.print(i - 1);
						  System.out.print(' ');
						  System.out.print(0);
						  System.out.print("\n");
					  }
				  }
				  if (j == n)
				  {
					  if (array[i][n] >= array[i - 1][n] != 0 && array[i][n] >= array[i + 1][n] != 0 && array[i][n] >= array[i][n - 1])
					  {
							  System.out.print(i - 1);
							  System.out.print(' ');
							  System.out.print(n - 1);
							  System.out.print("\n");
					  }
				  }
				  if (j != 1 && j != n && array[i][j] >= array[i][j + 1] != 0 && array[i][j] >= array[i][j - 1] != 0 && array[i][j] >= array[i + 1][j] != 0 && array[i][j] >= array[i - 1][j])
				  {
					  System.out.print(i - 1);
					  System.out.print(' ');
					  System.out.print(j - 1);
					  System.out.print("\n");
				  }

			  }
	   }
	   if (array[m][1] >= array[m][2] != 0 && array[m][1] >= array[m - 1][1])
	   {
		   System.out.print(m - 1);
		   System.out.print(' ');
		   System.out.print(0);
		   System.out.print("\n");
	   }
	   for (i = 2;i < n;i++)
	   {
		   if (array[m][i] >= array[m][i - 1] != 0 && array[m][i] >= array[m][i + 1] != 0 && array[m][i] >= array[m - 1][i])
		   {
			   System.out.print(m - 1);
			   System.out.print(' ');
			   System.out.print(i - 1);
			   System.out.print("\n");
		   }
	   }
	   if (array[m][n] >= array[m][n - 1] != 0 && array[m][n] >= array[m - 1][n])
	   {
		   System.out.print(m - 1);
		   System.out.print(' ');
		   System.out.print(n - 1);
		   System.out.print("\n");
	   }
	   return 0;
	}

}

