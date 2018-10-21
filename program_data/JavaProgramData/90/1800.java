package <missing>;

public class GlobalMembers
{
	//
	//  main.c
	//  ???
	//
	//  Created by ?  on 12-12-1.
	//  Copyright (c) 2012? ? . All rights reserved.
	//

	public static int f(int a, int b)
	{
		if (a == 1)
		{
			return (1);
		}
		else
		{
			if (a > b)
			{
				return (f1(a, b));
			}
			else
			{
				return (f1(a, b) + f2(a, b));
			}
		}
	}
	public static int f1(int a,int b)
	{
		if (a == 2)
		{
			return (1);
		}
		else
		{
			return (f(a - 1, b));
		}
	}
	public static int f2(int a,int b)
	{
		if (a == b)
		{
			return (1);
		}
		else
		{
			return (f(a, b - a));
		}
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",f(n, m));
		}
		return 0;
	}
}

