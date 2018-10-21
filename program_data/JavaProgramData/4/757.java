package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  Homework_12_10
	//  ??????????
	//  Created by airjcy on 12/10/12.
	//  Copyright (c) 2012 airjcy. All rights reserved.
	//


	public static void Main(String[] args)
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[row][col];
		int i;
		int j;
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 0; j < col ; j++)
		{
			int t = 0;
			int k = j;
			while (t < row && k >= 0)
			{
				System.out.print(a[t][k]);
				System.out.print("\n");
				t++;
				k--;
			}
		}
		for (i = 1; i < row; i++)
		{
			int t = i;
			int k = col - 1;
			while (t < row && k >= 0)
			{
				System.out.print(a[t][k]);
				System.out.print("\n");
				t++;
				k--;
			}
		}

	}

}

