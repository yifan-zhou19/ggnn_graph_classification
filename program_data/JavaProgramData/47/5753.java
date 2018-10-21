package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ??
	//
	//  Created by Love on 13-1-12.
	//  Copyright (c) 2013? Love. All rights reserved.
	//

	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int e;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (n % 2 == 0)
		{
			m = n / 2;
		}
		else
		{
			m = (n - 1) / 2;
		}
		for (i = 0; i < m; i++)
		{
			e = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = e;
		}
		System.out.printf("%d",a[0]);
		for (i = 1; i < n; i++)
		{
			System.out.printf(" %d",a[i]);
		}



		return 0;
	}

}

