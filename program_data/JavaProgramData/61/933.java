package <missing>;

public class GlobalMembers
{
	/*
	 * ??????.cpp
	 *
	 *  Created on: 2013-10-11
	 *      Author: 111
	 */

	public static int Main()
	{
		int[] f = new int[21]; //???????a[20]?????????f[20]
		int n;
		int i;
		int[] a = new int[20];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f[1] = 1;
		f[2] = 1;
		for (i = 3;i <= 20;i++)
		{
			f[i] = f[i - 1] + f[i - 2]; //?????????
		}
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = f[a[i]]; //?a[i]???????
		}
		for (i = 1;i <= n;i++)
		{
			System.out.print(a[i]);
			System.out.print("\n");
		}

	}

}

