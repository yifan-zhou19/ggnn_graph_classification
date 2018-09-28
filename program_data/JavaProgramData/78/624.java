package <missing>;

public class GlobalMembers
{
	/*
	 * 9.29?????.cpp
	 *
	 *  Created on: 2013-9-29
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int[] a = new int[4];
		int v;
		int i;
		int j;
		int flag = 0;
	char[] c = {'z', 'q', 's', 'l'};
	char cv;
	for (a[0] = 1;a[0] <= 5;a[0]++)
	{
		for (a[1] = 1;a[1] <= 5;a[1]++)
		{
			if (a[1] != a[0])
			{
				for (a[2] = 1;a[2] <= 5;a[2]++)
				{
					if ((a[2] != a[1]) && (a[2] != a[0]))
					{
						for (a[3] = 1;a[3] <= 5;a[3]++)
						{
							if ((a[3] != a[2]) && (a[3] != a[1]) && (a[3] != a[0] && a[0] + a[1] == a[2] + a[3]) && (a[0] + a[3] > a[1] + a[2]) && (a[0] + a[2] < a[1]))
							{
								flag = 1;
								break;
							}
						}
					}
					if (flag != 0)
					{
						break;
					}
				}
				if (flag != 0)
				{
					break;
				}
			}
		}
		if (flag != 0)
		{
			break;
		}
	}
	for (j = 0;j <= 2;j++)
	{
		for (i = 0;i <= 2 - j;i++)
		{
			if (a[i + 1] > a[i])
			{
				v = a[i];
				a[i] = a[i + 1];
				a[i + 1] = v;
				cv = c[i];
				c[i] = c[i + 1];
				c[i + 1] = cv;
			}
		}
	}
	for (i = 0;i <= 3;i++)
	{
		System.out.print(c[i]);
		System.out.print(' ');
		System.out.print(a[i] * 10);
		System.out.print("\n");
	}
	return 0;
	}

}
