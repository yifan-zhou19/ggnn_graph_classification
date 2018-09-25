package <missing>;

public class GlobalMembers
{
	/*????
	 * 12.10.17a.cpp
	 *  Created on: 2012-10-17
	 *      Author:???
	 *      ???????????????????
	 */
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c = 0;
		int d = 0;
		int i = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= n)
		{
			for (;i <= n;i++)
			{
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
					d = d + 1;
				continue;
			}
			else
			{
					if (d > c)
					{
						c = d;
						d = 0;
						i++;
						break;
					}
				else
				{
					d = 0;
					i++;
					break;
				}
			}
			}
		}
		if (d > c)
		{
			c = d;
		}
		System.out.print(c);
	return 0;
	}
}

