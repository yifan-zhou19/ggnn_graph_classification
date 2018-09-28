package <missing>;

public class GlobalMembers
{
	//  ????????
	//  main.cpp
	//  Homework
	//
	//  Created by ??? on 13-10-18.
	//  Copyright (c) 2013? ???. All rights reserved.
	//


	public static int sushu(int n) //???? ???1 ???0
	{
		for (int i = 2;i * i <= n;i++)
		{
			if (n % i == 0)
			{
				return 0;
				break;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int m;
		int a;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 3;a <= m / 2;a = a + 2)
		{
				if (sushu(a) != 0 && sushu(m - a) != 0) //?????m ?????
				{
					System.out.print(a);
					System.out.print(" ");
					System.out.print(m - a);
					System.out.print("\n");
				}
		}
		return 0;
	}

}

