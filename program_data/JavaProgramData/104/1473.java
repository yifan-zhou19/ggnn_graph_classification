package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ???
	//
	//  Created by ???? on 13-11-22.
	//  Copyright (c) 2013? ????. All rights reserved.
	//


	public static int f(int x)
	{
		return x / 2;
	}


	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			if (a > b)
			{
				a = f(a);
			}
			else if (b > a)
			{
				b = f(b);
			}
			else if (a == b)
			{
				System.out.print(a);
				System.out.print("\n");
				break;
			}
		}

		return 0;
	}

}

