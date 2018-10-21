package <missing>;

public class GlobalMembers
{
	/*
	 * ditui7.cpp
	 *??????
	 *  Created on: 2011-11-15
	 *      Author: APPLE
	 */

	public static int Main() //?????
	{
		int i; //????
		int n;
		int j;
		int[][] a = new int[100][100];
		int b;
		int min;
		int k;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = n;
		while (b > 0)
		{
			for (i = 0;i < n;i++) //????
			{
			for (j = 0;j < n;j++)
			{
			   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			}
		  sum = 0;
		  for (k = n;k > 1;k--) //?????????
		  {
			  for (i = 0;i < k;i++)
			  {
			  min = a[i][0];
			  for (j = 0;j < k;j++)
			  {
					  if (a[i][j] < min)
					  {
					 min = a[i][j];
					  }
			  }
			 for (j = 0;j < k;j++)
			 {
				 a[i][j] = a[i][j] - min;
			 }
			  }
		  for (j = 0;j < k;j++) //?????????
		  {
			  min = a[0][j];
			for (i = 0;i < k;i++)
			{
				if (a[i][j] < min)
				{
				min = a[i][j];
				}
			}
			for (i = 0;i < k;i++)
			{
				a[i][j] = a[i][j] - min;
			}
		  }

			sum = sum + a[1][1]; //??
			  for (i = 1;i < k;i++) //???
			  {
			  for (j = 0;j < k;j++)
			  {
				  a[i][j] = a[i + 1][j];
			  }
			  }

			   for (j = 1;j < k;j++) //???
			   {
				for (i = 0;i < k;i++)
				{
					a[i][j] = a[i][j + 1];
				}
			   }
		  }
			System.out.print(sum);
			System.out.print("\n");









			 b--;
		}




		return 0; //?????




	}



}

