package <missing>;

public class GlobalMembers
{
	/*
	 * tsyx.cpp
	 *
	 *  Created on: 2010-12-29
	 *      Author: dell
	 */
	public static int Main()
	{
		int i;
		int n;
		int s = 0;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] cishu = new int[n];
		int[] time = new int[n];
		int[] shijian = new int[n];
		for (i = 0;i < n;i++)
		{
			time[i] = 0;
			shijian[i] = 0;
			cishu[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (cishu[i] == 0)
			{
				System.out.print(60);
				System.out.print("\n");
				continue;
			}
			int[[]] cxia = new int[cishu[i]];
			for (j = 0;j < cishu[i];j++)
			{
				cxia[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if ((cishu[i] * 3 + cxia[j - 1]) <= 60)
			{
				time[i] = 60 - cishu[i] * 3;
			}
			else
			{
				s = 0;
				for (time[i] = 0;time[i] < 60;)
				{
					if (time[i] == cxia[s])
					{
						shijian[i] = shijian[i] + 3;
						s++;
					}
					else
					{
						shijian[i]++;
						time[i]++;
					}
					if (shijian[i] >= 60)
					{
						break;
					}
				}
			}
			System.out.print(time[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

