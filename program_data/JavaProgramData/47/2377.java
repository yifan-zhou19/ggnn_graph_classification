package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  nixu
	//
	//  Created by blues cookie on 12-12-9.
	//  Copyright (c) 2012? blues cookie. All rights reserved.
	//

	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n + 3];
		int[] p = a;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n / 2;i++) //??
		{
			j = (p + i);
			p[i] = (p + n - i - 1);
				p[n - i - 1] = j;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print((a + i));
			System.out.print(' ');
		}
		System.out.print((a + n - 1));

	}

}

