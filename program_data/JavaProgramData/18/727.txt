package <missing>;

public class GlobalMembers
{
	/*
	 * juzhenboss__006.cpp
	 *?????????
	 *  Created on: 2011-11-6
	 *      Author: ???
	 */
	public static int Main() //?????
	{
		int[][][] a = new int[50][50][50];
		int[] max = new int[101];
		int i;
		int j;
		int k;
		int m;
		int n;
		int min;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				for (k = 1;k <= n;k++)
				{
					a[i][j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}
		for (i = 1;i <= n;i++) //?n?????????????????
		{
		  for (t = 0;t < n - 1;t++) //t??????
		  {
		  for (j = 1;j <= n - t;j++) //?????????????????,?t????????
		  {
			  min = a[i][j][1];

			  for (k = 1;k <= n - t;k++)
			  {
				 if (min > a[i][j][k])
				 {
					 min = a[i][j][k];
				 }

			  }
			  for (k = 1;k <= n - t;k++)
			  {
				  a[i][j][k] = a[i][j][k] - min;
			  }

		  }
		  for (k = 1;k <= n - t;k++) //?????????,?????
		  {
			  min = a[i][1][k]; //???
			  for (j = 1;j <= n - t;j++)
			  {
				  if (min > a[i][j][k])
				  {
					  min = a[i][j][k];
				  }
			  }
			  for (j = 1;j <= n - t;j++)
			  {
				  a[i][j][k] = a[i][j][k] - min;
			  }
		  }
		  max[i] = max[i] + a[i][2][2]; //?????????
		  for (j = 2;j <= n - t - 1;j++) //??2????
		  {
			 for (k = 1;k <= n - t;k++)
			 {
				 a[i][j][k] = a[i][j + 1][k];
			 }
		  }
		  for (k = 2;k <= n - t - 1;k++) //???????
		  {
			  for (j = 1;j <= n - t;j++)
			  {
				  a[i][j][k] = a[i][j][k + 1];
			  }
		  }


		  }
		}
		for (i = 1;i <= n;i++) //??
		{
			System.out.print(max[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

