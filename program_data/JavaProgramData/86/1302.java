package <missing>;

public class GlobalMembers
{
	/*
	 * 111230_Skipping.cpp
	 *
	 *  Created on: 2011-12-30
	 *      Author: Alfalfa
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			n--;
			int miss;
			int all = 60;
			int time = 0;
			int allmiss = 0;
			int flag = 0;
			int all1;
			miss = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			while (miss != 0)
			{
				miss--;
				allmiss++;
				int num;
				num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				time = num + allmiss * 3;
				all = num;
				if (time >= 63 && flag == 0)
				{
					all1 = 60 - (allmiss - 1) * 3;
					flag = 1;
				}
				else if (time >= 60 && flag == 0)
				{
					all1 = all;
					flag = 1;
				}
			}
			if (flag == 1)
			{
				System.out.print(all1);
				System.out.print("\n");
			}
			else
			{
				System.out.print(60 - allmiss * 3);
				System.out.print("\n");
			}
		}
	}

}

