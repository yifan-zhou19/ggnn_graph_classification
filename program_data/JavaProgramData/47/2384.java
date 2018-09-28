package <missing>;

public class GlobalMembers
{
	/*
	 * daoxu.cpp
	 *
	 *  Created on: 2012-10-30
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int n; //??,i?????,a[]?????,b[]?????
		int i;
		int[] a = new int[150];
		int[] b = new int[150];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			b[i] = a[n - 1 - i]; //??????????
		}
		for (i = 0; i < n; i++)
		{
			a[i] = b[i]; //????????
		}
		System.out.print(a[0]);
		for (i = 1; i < n; i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0; //????

	}
}

