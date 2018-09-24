package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  HomeWork_11.14.Functions
	//  ???
	//  Created by ??? on 11/19/12.
	//  Copyright (c) 2012 airjcy. All rights reserved.
	//

	///#include <string>

	public static int findSameNode(int x,int y)
	{
		if (x == y)
		{
			return x;
		}
		else
		{
			if (x > y)
			{
				return findSameNode(x / 2, y);
			}
			else
			{
				return findSameNode(x, y / 2);
			}
		}
	}


	public static void Main(String[] args)
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(findSameNode(x, y));

	}

}

