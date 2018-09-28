package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  final
	//
	//  Created by blues cookie on 13-1-11.
	//  Copyright (c) 2013? blues cookie. All rights reserved.
	//

	public static int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static int len = 1;
	public static void cal(int num)
	{
		if (num == 0)
		{
			return;
		}
		int carrybit = 0;
		int i;
		for (i = 0;i < len;i++)
		{
			a[i] = a[i] * 2 + carrybit;
			carrybit = a[i] / 10;
			a[i] = a[i] % 10;
		}
		if (carrybit == 1)
		{
			len++;
			a[i] = 1;
		}
		cal(num - 1);
	}
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cal(num);
		for (int j = len - 1;j >= 0;j--)
		{
			System.out.print(a[j]);
		}
	}

}

