package <missing>;

public class GlobalMembers
{
	/*
	 * tiaoshenjishu.cpp
	 *
	 *  Created on: 2011-12-21
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int n;
		int broke;
		int times;
		int last;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			broke = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			last = 0;
			while (broke-- != 0)
			{
				times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (last + times < 60)
				{
					if (last + times + 3 < 60)
					{
						last = last + 3;
					}
					else
					{
						last = 60 - times;
					}
				}
			}
			System.out.print(60 - last);
			System.out.print("\n");
		}
		return 0;
	}
}

