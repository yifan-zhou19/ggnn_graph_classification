package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  123
	//
	//  Created by blues cookie on 12-11-12.
	//  Copyright (c) 2012? blues cookie. All rights reserved.
	//

	public static int calc(int a,int b)
	{
		if (a * a > b)
		{
			return 1;
		}
		if (b % a == 0)
		{
			return (calc(a, b / a) + calc(a + 1, b));
		}
		return calc(a + 1, b);
	}
	public static void Main(String[] args)
	{
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(calc(2, a));
			System.out.print("\n");
		}
	}
}

