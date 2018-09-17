package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  Homework
	//
	//  Created by ??? on 13-11-17.
	//  Copyright (c) 2013? ???. All rights reserved.
	//


	public static int Main()
	{
		int x;
		int y;
		int sx;
		int sy;
		int[] nx = new int[11];
		int[] ny = new int[11];
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		nx[10] = x;
		ny[10] = y;

		for (int i = 10;i > 0;i--)
		{
			nx[i - 1] = nx[i] / 2;
		}
		for (int i = 10;i > 0;i--)
		{
			ny[i - 1] = ny[i] / 2;
		}

		for (sx = 0;sx < 11;sx++)
		{
			if (nx[sx] != 0)
			{
				sx--;
				break;
			}
		}
		for (sy = 0;sy < 11;sy++)
		{
			if (ny[sy] != 0)
			{
				sy--;
				break;
			}
		}

		for (int i = 0;i < 11;i++)
		{
			if (nx[sx] != ny[sy])
			{
				break;
			}
			sx++;
			sy++;
		}

		System.out.print(nx[sx - 1]);
		System.out.print("\n");

		return 0;
	}

}

