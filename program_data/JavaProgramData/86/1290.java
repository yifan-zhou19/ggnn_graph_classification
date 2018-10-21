package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2011-12-24
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int n;
		int i;
		int m;
		int[] num = new int[60];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			n--;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i <= m;i++)
			{
				num[i] = 60;
			}
			for (i = 0;i < m;i++)
			{
				num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			}
			for (i = 0;i < m;i++)
			{
				if ((num[i] + 3 * i) <= 57 && (num[i + 1] + 3 * i + 3)>60)
				{
					num[m] = 57 - 3 * i;
				}
				else if ((num[i] + 3 * i) < 57 && (num[i + 1] + 3 * i + 3) <= 60 && (num[i + 1] + 3 * i + 3) >= 57)
				{
					num[m] = num[i + 1];
				}
			}

			System.out.print(num[m]);
			System.out.print("\n");
		}
		return 0;
	}

}

