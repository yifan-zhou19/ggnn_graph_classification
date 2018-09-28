package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : ex6.4.cpp
	// Author      : Zhang Yu
	// Version     :
	// Copyright   : Your copyright notice
	// Description : ????
	//============================================================================


	public static int Main()
	{
		int height;
		int width;
		height = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		width = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[height][width];
		for (int i = 0;i <= height - 1;++i)
		{
			for (int j = 0;j <= width - 1;++j)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[][] mountain = new int[100][2]; //???????????
		int sum = 0;
		for (int i = 0;i <= height - 1;++i) //???????
		{
			for (int j = 0;j <= width - 1;++j) //???????
			{
				if (i <= height - 2)
				{
					if (a[i][j] < a[i + 1][j])
					{
						continue;
					}
				}
				if (i >= 1)
				{
					if (a[i][j] < a[i - 1][j])
					{
						continue;
					}

				}
				if (j >= 1)
				{
					if (a[i][j] < a[i][j - 1])
					{
						continue;
					}
				}
				if (j <= width - 2)
				{
					if (a[i][j] < a[i][j + 1])
					{
						continue;
					}
				}
				//??i,j???????,????

					mountain[sum][0] = i; //??????
					mountain[sum][1] = j; //??????
					++sum; //??????

			}
		}

		System.out.print("\n");
		for (int i = 0;i <= sum - 1;++i) //????
		{
			for (int j = i;j <= sum - 1;++j)
			{
				if (mountain[i][0] > mountain[j][0])
				{
					int temp1 = mountain[i][0];
					int temp2 = mountain[i][1];
					mountain[i][0] = mountain[j][0];
					mountain[i][1] = mountain[j][1];
					mountain[j][0] = temp1;
					mountain[j][1] = temp2;
				}
			}
		}
		for (int i = 0;i <= sum - 1;++i)
		{
			System.out.print(mountain[i][0]);
			System.out.print(" ");
			System.out.print(mountain[i][1]);
			System.out.print("\n");
		}

		return 0;
	}

}

