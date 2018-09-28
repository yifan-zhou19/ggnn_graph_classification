package <missing>;

public class GlobalMembers
{
	/*
	 * fx11.cpp
	 *
	 *  Created on: 2013-1-12
	 *      Author: SONY
	 *      ????
	 */
	public static int Main()
	{
	   int m;
	   int n;
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[][] a = new int[m][n];
	   int i;
	   int j;
	   for (i = 0;i < m;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
	   }
	   for (i = 0;i < m;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			   int k = 0;
			   if (i + 1 < m && a[i + 1][j] <= a[i][j])
			   {
				   k++;
			   }
			   if (j + 1 < n && a[i][j + 1] <= a[i][j])
			   {
				   k++;
			   }
			   if (i - 1 >= 0 && a[i - 1][j] <= a[i][j])
			   {
				   k++;
			   }
			   if (j - 1 >= 0 && a[i][j - 1] <= a[i][j])
			   {
				   k++;
			   }
			   if ((i == 0 && j == 0) || (i == 0 && j == n - 1) || (i == m - 1 && j == 0) || (i == m - 1 && j == n - 1))
			   {
				   if (k == 2)
				   {
					   System.out.print(i);
					   System.out.print(" ");
					   System.out.print(j);
					   System.out.print("\n");
				   }
			   }
			   else
			   {
				   if (i == 0 || j == 0 || i == m - 1 || j == n - 1)
				   {
					if (k == 3)
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				   }
				  else
				  {
					  if (k == 4)
					  {
						  System.out.print(i);
						  System.out.print(" ");
						  System.out.print(j);
						  System.out.print("\n");
					  }
				  }
			   }
		   }
	   }
	return 0;
	}

}

