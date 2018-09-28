package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012858_25.cpp
	 *
	 *  Created on: 2010-11-3
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int n; //????n??????????num????????
		int i;
		int num;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = 0; //?k????n-1
		int[] a = new int[n]; //??????a[n]
		for (i = 0;i < n;i++) //????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = n - 1;i >= 0;i--)
		{ //??????num????,??????
			if (a[i] == num)
			{ //???i???num???i??????
						for (;i < n - 1 - k;i++)
						{
							a[i] = a[i + 1];
						}
						k = k + 1; //??k??????????
			}
		}
				System.out.print(a[0]);
				for (i = 1;i <= n - 1 - k;i++)
				{
				System.out.print(' ');
				System.out.print(a[i]);
				}
				return 0;
	}
}

