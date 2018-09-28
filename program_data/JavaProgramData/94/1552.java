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
		int[] odd = new int[1000];
		int c = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			int num;
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num % 2 != 0)
			{
				odd[c] = num;
				c++;
			}
		}
		qsort(odd, c, (Integer.SIZE / Byte.SIZE), cmp);
		System.out.print(odd[0]);
		for (int i = 1; i < c; i++)
		{
			System.out.print(",");
			System.out.print(odd[i]);
		}
		return 0;
	}

}

