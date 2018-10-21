package <missing>;

public class GlobalMembers
{
	/*
	 * unrepeatedout.cpp
	 *
	 *  Created on: 2012-10-29
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int n; //i?????,used[k]?0??k?????,?1??k?????
		int i = 0;
		int[] a = new int[20001];
		int[] used = new int[200];
		for (i = 0; i < 200; i++)
		{
			used[i] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[0]);
		used[a[0]] = 1;
		for (i = 1; i < n; i++)
		{
			if (used[a[i]] != 0)
			{
				continue; //??????????"??"
			}
			System.out.print(" ");
			System.out.print(a[i]);
			used[a[i]] = 1; //?????????
		}
		return 0; //????
	}

}

