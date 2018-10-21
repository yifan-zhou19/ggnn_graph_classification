package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *
	 *  Created on: 2013-1-13
	 *      Author: i
	 */
	public static int Main()
	{
		int[] num = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] temp = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			for (i = 0;i < 40;i++)
			{
				if (num[i] == 0 && num[i + 1] == 0 && num[i + 2] == 0)
				{
					break;
				}
				if (num[i] + temp[i] > 9)
				{
					temp[i + 1]++;
					temp[i] = num[i] + temp[i] - 10;
				}
				else
				{
					temp[i] = num[i] + temp[i];
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
			if (n != 0)
			{
				System.out.print(num[i]);
			}
			else if (num[i] != 0)
			{
				System.out.print(num[i]);
				n++;
			}
		}
		System.out.print("\n");
		return 0;
	}

}

