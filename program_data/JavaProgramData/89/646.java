package <missing>;

public class GlobalMembers
{
	/*
	 * shehuimingliu.cpp
	 *
	 *  Created on: 2010-12-13
	 *      Author: ??
	 *      ????????
	 */
	public static int Main()
	{
		int i;
		int[] a = new int[10000];
		int n;
		int a1;
		int a2;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (true)
		{
			a1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a1 == 0 && a2 == 0)
			{
				break;
			}
			else
			{
				a[a1] = -1000;
				a[a2]++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == n - 1)
			{
				System.out.print(i);
			   flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}

}

