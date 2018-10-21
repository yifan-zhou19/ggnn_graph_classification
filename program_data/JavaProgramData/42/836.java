package <missing>;

public class GlobalMembers
{
	/*
	 * ???????.cpp
	 *
	 *  Created on: 2011-10-19
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int i;
		int n;
		int s;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < (n - 1);i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		a[n - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] == s)
			{
				for (j = i;j < (n - k + 1);j++)
				{
					a[j] = a[j + 1];
				}
				i = i - 1;
				k = k + 1;
			}
		}
		for (i = 0;i < (n - k - 1);i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - k - 1]);
		System.out.print("\n");
		return 0;
	}

}

