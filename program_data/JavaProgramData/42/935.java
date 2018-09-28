package <missing>;

public class GlobalMembers
{
	/*
	 * 123.cpp
	 *
	 *  Created on: 2011-10-21
	 *      Author: 11061
	 */
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int l;
		int m;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100001];
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = 0;
		while (j < n)
		{
			while (a[j] == k && j <= n - 1)
			{
				for (l = j; l <= n - 2; l++)
				{
					a[l] = a[l + 1];
				}
				n--;
			}
			j++;
		}

		for (m = 0;m <= n - 2;m++)
		{
			System.out.print(a[m]);
			System.out.print(' ');
		}
		System.out.print(a[m]);

		return 0;
	}

}

