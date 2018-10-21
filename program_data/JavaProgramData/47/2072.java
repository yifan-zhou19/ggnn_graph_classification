package <missing>;

public class GlobalMembers
{
	/*
	 * 5.8ReversedOrder.cpp
	 *
	 *  Created on: 2012-11-11
	 *      Author: ???
	 *      ???????????????????
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		int[] a = new int[200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++) //??????????????????
			{
				temp = a[j]; //??????
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(a[i]);
			System.out.print((i < (n - 1)?" ":"\n"));
		}
		return 0;

	}

}

