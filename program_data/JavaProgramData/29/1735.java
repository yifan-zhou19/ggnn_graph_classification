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
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int q = 0;q < x;q++)
		{
		int n;
		int a = 2;
		int b = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double Sum = 0;
		for (int i = 1; i <= n; i++)
		{
			Sum += (float)a / b;
			int t = a;
			a += b;
			b = t;
		}
		System.out.printf("%.3f\n",Sum);
		}
	}

}

