package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-11-4
	 *      Author: 11288
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			b[i] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] == b[j])
				{
					b[j] = 0;
				}
			}
		}
		System.out.print(b[0]);
		for (i = 1;i < n;i++)
		{
			if (b[i] != 0)
			{
				System.out.print(' ');
				System.out.print(b[i]);
			}
		}
		return 0;

	}

}

