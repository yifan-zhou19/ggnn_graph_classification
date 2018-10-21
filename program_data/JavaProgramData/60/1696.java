package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  test
	//
	//  Created by ? ? on 12-11-28.
	//  Copyright (c) 2012? ? ?. All rights reserved.
	//

	public static int pri(int x)
	{
		int k = Math.sqrt(x);
		int i;
		for (i = 2; i <= k; i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i == k + 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int j = 0;
		int n;
		int[] prime = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 5)
		{
			System.out.print("empty");
			return 0;
		}
		for (i = 3; i <= n - 2; i += 2)
		{
			if (pri(i) != 0 && pri(i + 2) != 0)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(i + 2);
				System.out.print("\n");
			}
		}


		return 0;
	}

}

