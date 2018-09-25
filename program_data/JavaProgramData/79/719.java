package <missing>;

public class GlobalMembers
{
	/*
	 * wanyi.cpp
	 *
	 *  Created on: 2012-11-10
	 *      Author: 7
	 */
	public static int Main()
	{
		int[] a = new int[301];
		int count;
		int n;
		int m;
		int i;
		int j;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (m != 0 && n != 0 && m != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 0;i < 301;i++)
			{
			a[i] = i;
			}
			count = n;
			j = m;
			while (count > 1)
			{
				for (i = 1;i <= n;i++)
				{
					if (a[i] != 0)
					{
						j--;
						if (j == 0)
						{
							a[i] = 0;
							j = m;
							count--;
							if (count == 1)
							{
								break;
							}
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				if (a[i] != 0)
				{
					System.out.print(i);
					System.out.print("\n");
				}
			}
		}
	}

}

