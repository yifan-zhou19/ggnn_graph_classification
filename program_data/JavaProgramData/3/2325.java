package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  hw
	//
	//  Created by ? ? on 12-12-13.
	//  Copyright (c) 2012? ? ?. All rights reserved.
	//

	public static int cmp(Object a, Object b)
	{
		return ((int)a - (int)b);
	}

	public static int Main()
	{
		int n;
		int k;
		int[] num = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		qsort(num, n, (Integer.SIZE / Byte.SIZE), cmp);
		if (k > num[0] + num[n - 1])
		{
			System.out.print("no");
			return 0;
		}
		int p = 0;
		for (int i = 0; i < n; i++,p++)
		{
			int sum;
			for (int j = i + 1; j < n; j++)
			{
				sum = num[i] + num[j];
				if (sum == k)
				{
					System.out.print("yes");
					return 0;
				}
			}
		}
		if (p == n)
		{
			System.out.print("no");
		}
		return 0;
	}

}

