package <missing>;

public class GlobalMembers
{
	/*
	 *????.cpp
	 *
	 *  Created on: 2012-10-15
	 *      Author: ???
	 */

	public static int Main()
	{
		int n = 0; //??????????????
		int b = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0; i < n; i++)
		{ //??
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n / 2; i++)
		{ //??????
			b = a[i];
			a[i] = a[n - 1 - i];
			a[n - 1 - i] = b;
		}
		System.out.print(a[0]);
		for (i = 1; i < n; i++)
		{ //??
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}

}

