package <missing>;

public class GlobalMembers
{
	/*
	 * homework1108.cpp
	 *
	 *  Created on: 2012-11-7
	 *      Author: wangyinzhi
	 */

	public static int Main()
	{
	   int[][] a = new int[5][5];
	   int i;
	   int j;
	   int k;
	   int s;
	   int t;
	   int z;
	   for (i = 0;i <= 4;i++)
	   {
		   for (j = 0;j <= 4;j++)
		   {
			   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
	   }
	   z = 0;
	   for (i = 0;i <= 4;i++)
	   {
		   for (j = 0;j <= 4;j++)
		   {
			   s = 0;
			   t = 0;
			   for (k = 0;k <= 4;k++)
			   {
			   if (a[i][j] >= a[i][k])
			   {
				   s = s + 1; //????????????
			   }
			   if (a[i][j] <= a[k][j])
			   {
				   t = t + 1; //???????????
			   }
			   }
			   if ((s == 5) && (t == 5))
			   { //??????????
				   System.out.print(i + 1);
				   System.out.print(" ");
				   System.out.print(j + 1);
				   System.out.print(" ");
				   System.out.print(a[i][j]);
				   System.out.print("\n");
				   z = 1;
			   }
		   }
	   }
	   if (z == 0)
	   {
		   System.out.print("not found");
		   System.out.print("\n");
	   }
		return 0;
	}
}

