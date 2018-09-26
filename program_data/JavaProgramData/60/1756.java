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

	public static int prime(int n)
	{
		int j;
		for (j = 2; j < n / 2 + 1; j++)
		{
			if (n % j == 0)
			{
				break;
			}
		}
		if (j == n / 2 + 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	//????
	public static int Main()
	{
		int n;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 2; i <= n; i++)
		{
			if (prime(i) == 1)
			{
				if (prime(i + 2) == 1 && i + 2 <= n)
				{
					System.out.printf("%d %d\n",i,i + 2);
					p = 1;
				}
			}
		}
		if (p == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

