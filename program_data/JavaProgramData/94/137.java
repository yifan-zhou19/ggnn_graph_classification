package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012826_??????.cpp
	 *
	 *  Created on: 2010-12-24
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int[] a = new int[501];
		int[] b = new int[501];
		int[] c = new int[501];
		int i;
		int j = 0;
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 == 1)
			{
				b[a[i]] = a[i];
				c[a[i]]++;
			}
		}
		for (int k = 0;k < 501;k++)
		{
			if (b[k] != 0)
			{
				if (c[k] = 1)
				{
				System.out.print(b[k]);
				m = k + 1;
				break;
				}
				else
				{
					System.out.print(b[k]);
					m = k + 1;
					for (i = 1;i < c[k];i++)
					{
						System.out.print(",");
						System.out.print(b[k]);
					}

				break;
				}
			}
		}
		for (int k = m;k < 501;k++)
		{
			if (b[k] != 0)
			{
				for (int l = 0;l < c[k];l++)
				{
					System.out.print(",");
					System.out.print(b[k]);
				}
			}
		}
	}

}

