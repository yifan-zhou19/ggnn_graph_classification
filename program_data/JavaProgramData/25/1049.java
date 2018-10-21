package <missing>;

public class GlobalMembers
{
	/*
	 * ??2?N??.cpp
	 *
	 *  Created on: 2012-12-31
	 *      Author: i
	 */
	public static int Main()
	{
		int[] num = new int[40];
		int[] temp = new int[40];
		int n = 0;
		int i = 0;
		num[0] = 1;
		temp[0] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			for (i = 0;i < 40;i++)
			{
				if (num[i] + temp[i] < 10)
				{
					temp[i] = num[i] + temp[i];
				}
				else
				{
					temp[i] = num[i] + temp[i] - 10;
					temp[i + 1]++;
				}
			}
			for (i = 0;i < 40;i++)
			{
				num[i] = temp[i];
			}
		}
		n = 0;
		for (i = 39;i >= 0;i--)
		{
			if (n != 0 || num[i] != 0)
			{
				System.out.print(num[i]);
				n++;
			}
		}
		return 0;
	}

}

