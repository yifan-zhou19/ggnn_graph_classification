package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2011-12-30
	 *      Author: ???
	 */

	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (num > 0)
		{
			num--;
			int badtimes;
			int total = 60;
			int i;
			badtimes = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (badtimes == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				while (badtimes > 0)
				{
					badtimes--;
					i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (total < i)
					{
						continue;
					}
					else if (total < i + 3)
					{
						total = i;
					}
					else
					{
						total -= 3;
					}
				}
				System.out.print(total);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

