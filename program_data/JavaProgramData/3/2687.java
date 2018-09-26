package <missing>;

public class GlobalMembers
{
	/*
	 * qujianl.cpp
	 *
	 *  Created on: 2013-1-17
	 *      Author: lenovo
	 */


	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int k;
		int x;
		int i;
		int ifind = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			if (x > k)
			{
				continue;
			}
			if (a[x] == 1)
			{
				ifind = 1;
				break;
			}
			a[k - x] = 1;
		}
		if (ifind != 0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

