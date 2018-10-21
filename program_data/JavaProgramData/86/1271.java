package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-12-19
	 *      Author: 1100012870
	 */
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int time;
		int num;
		int x;
		int y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			time = 0;
			num = 0;
			x = 0;
			for (j = 1;j <= m;j++)
			{
				x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				num = x;
				if (x + time >= 60)
				{
					break;
				}
				else
				{
					time += 3;
					if (x + time >= 60)
					{
						time = 60 - x;
						break;
					}
				}
			}
			for (int k = j + 1;k <= m;k++)
			{
				y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			num += 60 - (x + time);
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}
}

