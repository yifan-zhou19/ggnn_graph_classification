package <missing>;

public class GlobalMembers
{
	//
	//  File.cpp
	//  shuzu
	//
	//  Created by blues cookie on 12-10-28.
	//  Copyright (c) 2012? blues cookie. All rights reserved.
	//

	public static int Main()
	{
		int n;
		int i;
		int ex;
		int num;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num = n;
		int[] a = new int[n];
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		ex = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //??????n???
		{
			if (a[i] == ex)
			{
				for (k = i;k < n;k++) //?????????????????????
				{
					a[k] = a[k + 1];
				}
				n = n - 1;
				i = i - 1;
			}
		}
	   System.out.print(a[1]);
		for (i = 2;i <= n;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}
}

