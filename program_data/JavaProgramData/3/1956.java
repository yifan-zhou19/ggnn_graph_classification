package <missing>;

public class GlobalMembers
{
	/*
	 * wanyi.cpp
	 *
	 *  Created on: 2012-10-23
	 *      Author: 7
	 */

	public static int Main()
	{
		int n;
		int k;
		int flag;
		int[] num = new int[1000];
		int i = 0;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i < n)
		{
			i++;
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				if (num[i] + num[j] == k)
				{
					System.out.print("yes");
					System.out.print("\n");
					flag = 0;
					i = n;
					j = n;
					break;
				}
			}
		}
		if (flag != 0)
		{
			System.out.print("no");
			System.out.print("\n");
		}
	}

}

