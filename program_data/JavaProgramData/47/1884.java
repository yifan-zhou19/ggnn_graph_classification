package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2012-12-14
	 *      Author: ??
	 *      ?????????????????????????8,6,5,4,1?????1,4,5,6,8?
	 */
	public static int Main()
	{
		int[] a = new int[105]; //????a???
		int[] p = a;
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			p[0]++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		}
		for (i = n - 1;i >= 1;i--)
		{
			System.out.print((a + i));
			System.out.print(' ');
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}

}

