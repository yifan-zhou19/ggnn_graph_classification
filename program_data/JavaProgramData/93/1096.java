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
		int[] a = {3, 5, 7};
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k;
		for (k = 0; k < 3; k++)
		{
			if (x % a[k] == 0)
			{
				System.out.print(a[k]);
				break;
			}
		}
		if (k == 3)
		{
			System.out.print("n");
		}
		for (int i = k + 1; i < 3; i++)
		{
			if (x % a[i] == 0)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}

	}

}

