package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ????
	//
	//  Created by mac on 12-10-28.
	//  Copyright (c) 2012? mac. All rights reserved.
	//

	public static int Main()
	{
		int n; //???????????
		int i;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			if (90 <= a[i] != 0 && a[i] <= 140 && 60 <= b[i] != 0 && b[i] <= 90) //????
			{
				c[i] = c[i - 1] + 1;
			}
				else
				{
					c[i] = 0;
				}
		}
		int max = 0;
		for (i = 1;i <= n;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
			else
			{
				max = max;
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0; //????
	}
}

