package <missing>;

public class GlobalMembers
{
	/*
	 * fuxi1.cpp
	 *??????
	 *  Created on: 2011-11-4
	 *      Author: APPLE
	 */
	public static int Main() //??????i????j???
	{
		int i; //????
		int j;
		int a;
		int b;
		int k;
		int p;
		int[][] array = new int[102][102]; //??????
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < a;i++) //????????????
		{
			for (j = 0;j < b;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}


			if (a >= b) //?????????????????????
			{
				for (j = 0;j < b;j++)
				{
				for (k = j,i = 0;k >= 0;i++,k--)
				{
		System.out.print(array[i][k]);
		System.out.print("\n");
				}
				}
			for (i = 1;i <= a - b;i++)
			{
				for (p = i,j = b - 1;j >= 0;p++,j--)
				{
					System.out.print(array[p][j]);
					System.out.print("\n");
				}
			}
			for (i = a - b + 1;i < a;i++)
			{
				for (p = i,j = b - 1;p < a;p++,j--)
				{
							System.out.print(array[p][j]);
							System.out.print("\n");
				}
			}
			}
			else //??????????????????
			{
				for (j = 0;j < a;j++)
				{
			 for (k = j,i = 0;k >= 0;i++,k--)
			 {
				System.out.print(array[i][k]);
				System.out.print("\n");
			 }
				}
			 for (j = a;j < b;j++)
			 {
				 for (k = j,i = 0;i < a;i++,k--)
				 {
				System.out.print(array[i][k]);
				System.out.print("\n");
				 }
			 }
		  for (i = 1;i < a;i++)
		  {
			for (j = b - 1,p = i;p < a;p++,j--)
			{
				System.out.print(array[p][j]);
				System.out.print("\n");
			}
		  }
			}
		return 0; //?????


	}

}

