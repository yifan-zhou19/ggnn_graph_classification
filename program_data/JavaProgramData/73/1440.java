package <missing>;

public class GlobalMembers
{
	/*
	 * homework.cpp
	 *
	 *  Created on: 2013-10-30
	 *      Author: dyx
	 */
	public static int Main()
	{
		int[][] juzheng = new int[5][5];
		int i;
		int j;
		int k;
		int a;
		int b = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				juzheng[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int max;
		for (i = 0;i < 5;i++) //i???j??
		{
			max = 0;
			for (j = 0;j < 5;j++)
			{
				if (max < juzheng[i][j])
				{
					max = juzheng[i][j];
				}

			}
			for (j = 0;j < 5;j++)
			{
				if (juzheng[i][j] == max)
				{
					a = 0;
					for (k = 0;k < 5;k++)
					{
						if (juzheng[i][j] > juzheng[k][j])
						{
							a++;
						}
					}

					if (a == 0)
					{
						System.out.print(i + 1);
						System.out.print(" ");
						System.out.print(j + 1);
						System.out.print(" ");
						System.out.print(max);
						b++;
					}
				}
			}




		}
		if (b == 0)
		{
			System.out.print("not found");
		}
















	}


}

