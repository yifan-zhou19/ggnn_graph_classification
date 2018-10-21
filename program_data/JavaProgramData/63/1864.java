package <missing>;

public class GlobalMembers
{
	/**
	*@file 1.cpp
	*@author ???
	*@date 2013-11-06
	*@description ????
	*/


	public static int Main()
	{
		int[][] a = new int[110][110];
		int[][] b = new int[110][110];
		int[][] c = new int[110][110];
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int p;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x1; i++)
		{
			for (j = 1; j <= y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x2; i++)
		{
			for (j = 1; j <= y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= x1; i++)
		{
			   for (j = 1; j <= y2; j++)
			   {
				   for (p = 1; p <= x2; p++)
				   {
					   c[i][j] += a[i][p] * b[p][j];
				   }
			   }
		}
		 for (i = 1; i <= x1; i++)
		 {
			 for (j = 1; j < y2; j++)
			 {
				 System.out.printf("%d ",c[i][j]);

			 }
				 System.out.printf("%d\n",c[i][y2]);
		 }
		 return 0;
	}

}

