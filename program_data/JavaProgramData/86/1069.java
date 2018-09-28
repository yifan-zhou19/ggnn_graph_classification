package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : grids.cpp
	// Author      : Liang ShiYu
	// Version     : 1.0
	// Copyright   : Copyright Reserved
	// Description : HomeWork
	// Date        : 2010-12-17
	//============================================================================


	public static int Main()
	{
		int n;
		int[][] data = new int[100][20];
		int[] answer = new int[100];
		for (int i = 0;i < 100;i++)
		{
			answer[i] = 60;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0;j < m;j++)
			{
				data[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (data[i][j] <= answer[i] - 3)
				{
					answer[i] -= 3;
				}
				else if (data[i][j] >= answer[i])
				{
					;
				}
				else
				{
					answer[i] = data[i][j];
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			System.out.print(answer[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

