package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] mount = new int[30][30];
		int i;
		int j;
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < m;i++)
	 {
		 for (j = 0;j < n;j++)
		 {
			 mount[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	 }
	 for (i = 0;i < m;i++)
	 {
		 for (j = 0;j < n;j++)
		 {
			 if (i == 0 && j == 0 && mount[0][0] >= mount[0][1] != 0 && mount[0][0] >= mount[1][0])
			 {
				 System.out.print(i);
				 System.out.print(" ");
				 System.out.print(j);
				 System.out.print("\n");
			 }
			else if (i == 0 && j == n - 1 && mount[0][n - 1] >= mount[0][n - 2] != 0 && mount[0][n - 1] >= mount[1][n - 1])
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
			  else if (i == 0 && mount[0][j] >= mount[0][j - 1] != 0 && mount[0][j] >= mount[0][j + 1] != 0 && mount[0][j] >= mount[1][j])
			  {
				  System.out.print(i);
				  System.out.print(" ");
				  System.out.print(j);
				  System.out.print("\n");
			  }
			   else if (i == m - 1 && j == n - 1 && mount[m - 1][n - 1] >= mount[m - 1][n - 2] != 0 && mount[m - 1][n - 1] >= mount[m - 2][n - 1])
			   {
				   System.out.print(i);
				   System.out.print(" ");
				   System.out.print(j);
				   System.out.print("\n");
			   }
				 else if (i == m - 1 && j == 0 && mount[m - 1][0] >= mount[m - 1][1] != 0 && mount[m - 1][0] >= mount[m - 2][0])
				 {
					 System.out.print(i);
					 System.out.print(" ");
					 System.out.print(j);
					 System.out.print("\n");
				 }
				   else if (i == m - 1 && mount[m - 1][j] >= mount[m - 1][j - 1] != 0 && mount[m - 1][j] >= mount[m - 1][j + 1] != 0 && mount[m - 1][j] >= mount[m - 2][j])
				   {
					   System.out.print(i);
					   System.out.print(" ");
					   System.out.print(j);
					   System.out.print("\n");
				   }
					 else if (j == 0 && mount[i][j] >= mount[i - 1][j] != 0 && mount[i][j] >= mount[i + 1][j] != 0 && mount[i][j] >= mount[i][1])
					 {
						 System.out.print(i);
						 System.out.print(" ");
						 System.out.print(j);
						 System.out.print("\n");
					 }
					   else if (j == n - 1 && mount[i][j] >= mount[i - 1][j] != 0 && mount[i][j] >= mount[i + 1][j] != 0 && mount[i][j] >= mount[i][n - 2])
					   {
						   System.out.print(i);
						   System.out.print(" ");
						   System.out.print(j);
						   System.out.print("\n");
					   }
						 else if (mount[i][j] >= mount[i][j - 1] != 0 && mount[i][j] >= mount[i - 1][j] != 0 && mount[i][j] >= mount[i][j + 1] != 0 && mount[i][j] >= mount[i + 1][j])
						 {
							 System.out.print(i);
							 System.out.print(" ");
							 System.out.print(j);
							 System.out.print("\n");
						 }
		 }
	 }

	 return 0;
	}

}

