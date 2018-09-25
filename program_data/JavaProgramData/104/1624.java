package <missing>;

public class GlobalMembers
{
	//
	//  Created by Chu-Pan,Wong on Dec 1, 2013.
	//  Copyright (c) 2013 ChuPan,Wong. All rights reserved.
	//




	public static int[] routex = new int[1000];
	public static int[] routey = new int[1000];

	public static void Main(String[] args)
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int nx;
		int ny;
		for (nx = 0; x != 1; nx++)
		{
			routex[nx] = x;
			if (x % 2 == 0)
			{
				x /= 2;
			}
			else
			{
				x = (x - 1) / 2;
			}
		}
		for (ny = 0; y != 1; ny++)
		{
			routey[ny] = y;
			if (y % 2 == 0)
			{
				y /= 2;
			}
			else
			{
				y = (y - 1) / 2;
			}
		}
		routex[nx] = routey[ny] = 1;
		int res;
		while (routex[nx] == routey[ny])
		{
			if (nx < 0 || ny < 0)
			{
				break;
			}
			res = routex[nx];
			nx--;
			ny--;
		}
		System.out.print(res);
		System.out.print("\n");
	}
}

