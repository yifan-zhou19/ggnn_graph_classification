package <missing>;

public class GlobalMembers
{
	/*
	 * xiaoceyan6.cpp
	 *????
	 *  Created on: 2010-11-12
	 *      Author: william
	 */
	public static int Main() //???
	{
		int[][] a = new int[5][5]; //??????  i, j, n????a[5][5]  n???0
		int i;
		int j;
		int n = 0;
		for (i = 0;i < 5;i++) //for?? ???
		{
			for (j = 0;j < 5;j++) //for?? ???
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++) //for?? ???
		{
			for (j = 0;j < 5;j++) //for?? ???
			{
			   if (a[i][j] >= a[i][1] != 0 && a[i][j] >= a[i][2] != 0 && a[i][j] >= a[i][3] != 0 && a[i][j] >= a[i][4] != 0 && a[i][j] >= a[i][0] != 0 && a[i][j] <= a[1][j] != 0 && a[i][j] <= a[2][j] != 0 && a[i][j] <= a[3][j] != 0 && a[i][j] <= a[4][j] != 0 && a[i][j] <= a[0][j]) //?????
			   {
								 System.out.print(i + 1);
								 System.out.print(" ");
								 System.out.print(j + 1);
								 System.out.print(" ");
								 System.out.print(a[i][j]);
								  n++; //n??

			   }

			}
		}
		if (n == 0)
		{
			System.out.print("not found");
		}
		return 0; //??
	} //??
}

