package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012795-????.cpp
	 *
	 *  Created on: 2010-12-19
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			int m;
			int j;
			int a1;
			int a2;
			int k;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1;j <= m;j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (a[m] + 3 * (m - 1) <= 57)
			{
				a1 = 60 - 3 * m;
				System.out.print(a1);
				System.out.print("\n");
			}
			if (a[m] + 3 * (m - 1) == 58 || a[m] + 3 * (m - 1) == 59 || a[m] + 3 * (m - 1) == 60)
			{
				System.out.print(a[m]);
				System.out.print("\n");
			}
			if (a[m] + 3 * (m - 1) > 60)
			{
				for (k = m - 1;k >= 1;k--)
				{
					if (a[k] + 3 * (k - 1) <= 57)
					{
						a2 = 60 - 3 * k;
						System.out.print(a2);
						System.out.print("\n");
						break;
					}
					if (a[k] + 3 * (k - 1) == 58 || a[k] + 3 * (k - 1) == 59 || a[k] + 3 * (k - 1) == 60)
					{
						 System.out.print(a[k]);
						 System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}

}

