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

	public static int Main()
	{
		int n;
		int[] figure = new int[20000];
		int[] num = new int[100];
		int[] flag = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			figure[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		flag[figure[0]]++;
		System.out.print(figure[0]);
		for (int i = 1; i < n; i++)
		{
			if (flag[figure[i]] == 0)
			{
				flag[figure[i]]++;
				System.out.print(" ");
				System.out.print(figure[i]);
				continue;
			}
		}
		return 0;
	}

}

