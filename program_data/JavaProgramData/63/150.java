package <missing>;

public class GlobalMembers
{
	/*
	 * ?????.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int x1; //i?j?k??????x1,y1,x2,y2???????????
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;

		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[101][101];
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] b = new int[101][101];
			for (i = 1;i <= x2;i++)
			{
				for (j = 1;j <= y2;j++)
				{
					b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

		int[][] c = new int[101][101];
		  for (i = 1;i <= x1;i++)
		  {
					for (j = 1;j <= y2;j++)
					{
						for (k = 1;k <= x2;k++)
						{
							c[i][j] += a[i][k] * b[k][j];

						} //????????c(i,j)??a???i??b???j?????????????c??
					}
		  }
		for (i = 1;i <= x1;i++)
		{
		   for (j = 1;j <= y2;j++)
		   {
			   if (j != y2)
			   {
			   System.out.print(c[i][j]);
			   System.out.print(' ');
			   }
			   else
			   {
				   System.out.print(c[i][y2]);
				   System.out.print("\n");
			   }
		   } //??c?????????
		}
	   return 0;
	}
}

