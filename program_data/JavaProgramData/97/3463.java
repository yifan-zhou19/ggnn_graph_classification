package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  hw
	//
	//  Created by ? ? on 12-12-16.
	//  Copyright (c) 2012? ? ?. All rights reserved.
	//


	public static void Main(String[] args)
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] money = {100, 50, 20, 10, 5, 1};
		for (int i = 0; i < 6; i++)
		{
			System.out.print(num / money[i]);
			System.out.print("\n");
			num -= (num / money[i]) * money[i];
		}
	}

}

