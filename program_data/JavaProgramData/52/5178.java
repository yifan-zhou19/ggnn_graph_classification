package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  xunhuan
	//
	//  Created by blues cookie on 12-12-9.
	//  Copyright (c) 2012? blues cookie. All rights reserved.
	//


	public static void Main(String[] args)
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n - m + 1;i <= n;i++)
		{
			a[i + m] = (a + i); //??m????m
		}
		for (i = n - m;i >= 1;i--)
		{
			a[i + m] = (a + i); //?n-m?????
		}
		for (i = 1;i <= m;i++)
		{
			a[i] = (a + i + n); //?M?????
		}
		for (i = 1;i <= n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[n]);

	}

}

