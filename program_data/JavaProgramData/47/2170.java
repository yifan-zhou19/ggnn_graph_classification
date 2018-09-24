package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 * ??????????????
	 *  Created on: 2012-11-16
	 *      Author: ???
	 */
	public static int Main()
	{
		int[] a = new int[101];
		int i;
		int n;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		if (n % 2 == 0)
		{ //??????????
			for (i = n / 2 + 1;i <= n;i++)
			{ //????????????????
				temp = a[i];
				a[i] = a[n - i + 1];
				a[n - i + 1] = temp;
			}
		}
		else
		{
			for (i = (i + 1) / 2;i <= n;i++)
			{ //??????????????????????????
				temp = a[i];
				a[i] = a[n + 1 - i];
				a[n + 1 - i] = temp;
			}
		}
		System.out.print(a[1]);
		for (i = 2;i <= n;i++)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
	}

}

