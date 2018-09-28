package <missing>;

public class GlobalMembers
{
	//
	//  8.cpp
	//  poj
	//
	//  Created by ChuPan,Wong on 10/25/13.
	//  Copyright (c) 2013 ChuPan,Wong. All rights reserved.
	//


	public static int Main()
	{
		int n;
		int[] num;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		num = new int[n];
		j = n;
		i = 0;
		while (j-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		for (i = 0; i <= (n - 1) / 2; i++)
		{
			j = num[i];
			num[i] = num[n - 1 - i];
			num[n - 1 - i] = j;
		}
		for (i = 0; i < n; i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%d", num[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

