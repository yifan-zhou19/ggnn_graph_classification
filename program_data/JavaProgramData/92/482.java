package <missing>;

public class GlobalMembers
{
	/*
	 * tianjisaima.cpp
	 *
	 *  Created on: 2012-3-19
	 *      Author: Hijack
	 */

	public static final int MAX = 1005;
	public static int[] a = new int[MAX];
	public static int[] b = new int[MAX];
	public static int cmp(int a, int b)
	{
		return a > b;
	}
	public static int Main()
	{
		int n;
		int i;
		while ((n != 0 && n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 0; i < n; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0; i < n; i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(a,a + n,cmp);
			sort(b,b + n,cmp);
			int num = 0;
			int al = 0;
			int bl = 0;
			int ar = n - 1;
			int br = n - 1;
			while (al <= ar)
			{
				if (a[ar] > b[br])
				{
					ar--;
					br--;
					num += 200;
				}
				else if (a[ar] < b[br])
				{
					ar--;
					bl++;
					num -= 200;
				}
				else if (a[ar] == b[br])
				{
					if (a[al] > b[bl])
					{
						al++;
						bl++;
						num += 200;
					}
					else if (a[al] < b[bl])
					{
						ar--;
						bl++;
						num -= 200;
					}
					else if (a[al] == b[bl])
					{
						if (a[ar] == b[bl])
						{
							ar--;
							bl++;
						}
						else
						{
							ar--;
							bl++;
							num -= 200;
						}
					}
				}
			}
			System.out.print(num);
			System.out.print("\n");

		}

	}

}

