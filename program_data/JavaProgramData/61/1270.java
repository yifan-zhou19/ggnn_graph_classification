package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ??????
	//
	//  Created by Hsu Tzuyen on 12-11-17.
	//  Copyright (c) 2012? Hsu Tzuyen. All rights reserved.
	//

	public static int f(int n)
	{
		int[] a = new int[21];
		a[1] = 1;
		a[2] = 1;
		for (int i = 3; i <= n; i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		return a[n];
	}
	public static int Main()
	{
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(a));
			System.out.print("\n");
		}
		return 0;
	}
}

