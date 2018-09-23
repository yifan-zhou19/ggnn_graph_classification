package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ?????
	//
	//  Created by ???? on 13-11-22.
	//  Copyright (c) 2013? ????. All rights reserved.
	//

	public static int f(int a,int s) //s for start
	{
		if (a <= s)
		{
			return 1;
		}
		int b = Math.sqrt((float)a);
		int flag = 0;
		int sum = 1;
		for (int i = s;i <= b;i++)
		{
			if (a % i == 0)
			{
				flag++;

				sum = sum + f(a / i, i);
			}
		}
		if (flag == 0)
		{
			return 1;
		}
		else
		{
			return sum;
		}
	}



	public static int Main()
	{
		int a;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(a, 2));
			System.out.print("\n");
		}

		return 0;
	}

}

