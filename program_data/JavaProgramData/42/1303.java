package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-10-29
	 *      Author: AK
	 */
	public static int Main()
	{
		int n; //??????n?????i?j????k??????s
		int i;
		int k;
		int j;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int p = n; //???????p??????????????
		int[] a = new int[p];
		for (i = 0;i <= (n - 1);i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = n - 2;i >= 0;i--) //????????????
		{
			if (a[i] == k) //???????k
			{
				s = s + 1; //?s+1
				for (j = i;j <= n - 2;j++) //?????????
				{
					a[j] = a[j + 1];
				}
			}
		}
		if (a[n - 1] == k)
		{
			s = s + 1; //?????????????k???s+1
		}
		for (j = 1;j <= n - s - 1;j++)
		{
			System.out.print(a[j - 1]);
			System.out.print(' ');
		}
		System.out.print(a[n - s - 1]);
		return 0;
	}
}

