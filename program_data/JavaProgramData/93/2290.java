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
		int num;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		if (num % 3 == 0)
		{
			System.out.print("3");
			i = 0;
		}
		if (num % 5 == 0)
		{
			if (i == 0)
			{
				System.out.print(" ");
			}
			System.out.print("5");
			i = 0;
		}
		if (num % 7 == 0)
		{
			if (i == 0)
			{
				System.out.print(" ");
			}

			System.out.print("7");
			i = 0;
		}
		if (i == 1)
		{
			System.out.print("n");
		}
		return 0;


	}
}

