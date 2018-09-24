package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ds
	//
	//  Created by Love on 12-12-27.
	//  Copyright (c) 2012? Love. All rights reserved.
	//


	public static int Main()
	{
		int tol;
		int i;
		int j;
		int sum;
		int k;
		int[][] x = new int[100][100];
		int row;
		int line;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			tol = Integer.parseInt(tempVar);
		}
		for (k = 0,sum = 0; k < tol; k++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				row = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				line = Integer.parseInt(tempVar3);
			}
			for (i = 0; i < row; i++)
			{
				for (j = 0; j < line; j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						x[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			if (line == 1)
			{
				for (i = 0; i < row; i++)
				{
					sum += x[i][0];
				}
			}
			else
			{

			for (i = 0; i < row; i++)
			{
				sum += x[i][0];
				sum += x[i][line-1];
			}
			}
			if (row == 1)
			{
				for (i = 1; i < line-1; i++)
				{
					sum += x[0][i];
				}
			}
			else
			{
			for (i = 1; i < line-1; i++)
			{
				sum += x[0][i];
				sum += x[row - 1][i];
			}
			}
			System.out.printf("%d\n",sum);


		}
		return 0;
	}
}

