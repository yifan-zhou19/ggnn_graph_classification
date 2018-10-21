package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  poj
	//
	//  Created by ChuPan,Wong on 9/27/13.
	//  Copyright (c) 2013 ChuPan,Wong. All rights reserved.
	//


	public static void Main(String[] args)
	{
		int[] num = new int[20];
		num[0] = num[1] = 1;
		for (int i = 2;i < 20;i++)
		{
			num[i] = num[i - 1] + num[i - 2];
		}
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int x;
		while (n-- != 0)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(num[x - 1]);
			System.out.print("\n");
		}
	}

}

