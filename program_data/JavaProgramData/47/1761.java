package <missing>;

public class GlobalMembers
{
	/*
	 * shuzunixuzhi.cpp
	 *???????????
	 *  Created on: 2012-12-17
	 *      Author: ??
	 */

	public static int Main()
	{
		int[] a = new int[101];
		int i; //??
		int n;
		int[] p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			p[+] = ConsoleInput.readToWhiteSpace(true);
		}
		p = a;
		for (i = 0; i < n / 2; i++)
		{
			swap(p[i], p[n - i - 1]); //??
		}
		System.out.print((p++));
		n--;
		while (n > 0)
		{
			System.out.print(" ");
			System.out.print((p++));
			n--; //??????
		}
		return 0;
	}

}

