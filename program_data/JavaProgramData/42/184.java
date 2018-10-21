package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012730_25.cpp
	 *  ????????
	 *  Created on: 2010-10-29
	 *      Author: ???
	 */

	public static int Main()
	{
		int n; //n?????????i??????k??????
		int i;
		int k;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 1;i <= n;i++) //??a[i]
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (a[i] == k)
			{
				for (int j = i;j <= n;j++)
				{
					a[j] = a[j + 1];
				}
				i = i - 1;
				m = m + 1; //m???????????
			}
		}
		for (i = 1;i <= n - m - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[n - m]);
		return 0;
	}

}

