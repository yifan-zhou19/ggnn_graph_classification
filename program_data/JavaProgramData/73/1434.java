package <missing>;

public class GlobalMembers
{
	//
	//  Created by Chu-Pan,Wong on Nov 11, 2013.
	//  Copyright (c) 2013 ChuPan,Wong. All rights reserved.
	//



	public static void Main(String[] args)
	{
		int[][] m = new int[5][5];
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				m[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[] rowmax = new int[5];
		for (int i = 0; i < 5; i++)
		{
			int max = m[i][0];
			for (int j = 1; j < 5; j++)
			{
				if (m[i][j] > max)
				{
					max = m[i][j];
				}
			}
			rowmax[i] = max;
		}
		int[] colmin = new int[5];
		for (int j = 0; j < 5; j++)
		{
			int min = m[0][j];
			for (int i = 1; i < 5; i++)
			{
				if (m[i][j] < min)
				{
					min = m[i][j];
				}
			}
			colmin[j] = min;
		}
		int cnt = 0;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if (m[i][j] == rowmax[i] && m[i][j] == colmin[j])
				{
					cnt++;
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(m[i][j]);
					System.out.print("\n");
				}
			}
		}
		if (cnt == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
	}
}

