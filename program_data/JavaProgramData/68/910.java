package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ????
	//
	//  Created by ? ? on 12-11-21.
	//  Copyright (c) 2012? ? ?. All rights reserved.
	//

	public static int n;
	public static int prime(int j)
	{
		int i;
		int k;
		k = Math.sqrt(j);
		for (i = 2;i <= k;i++)
		{
			if (j % i == 0)
			{
				break;
			}
		}
		if (i > k)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main(String[] args)
	{
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6;i <= n;i += 2)
		{
			for (j = 3; j <= i / 2; j++)
			{
				if (prime(j) != 0 && prime(i - j) != 0)
				{
					System.out.print(i);
					System.out.print("=");
					System.out.print(j);
					System.out.print("+");
					System.out.print(i - j);
					System.out.print("\n");
					break;
				}

			}
		}
	}

}

