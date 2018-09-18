package <missing>;

public class GlobalMembers
{
	/*
	 * 4.cpp
	 *
	 *  Created on: 2011-12-30
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int[] a = new int[10005];
		int n;
		int i;
		int j;
		int flag = 1;
		int flag2 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			flag = 1;
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1; j <= i - 1; j++)
			{
				if (a[j] == a[i])
				{
					flag = 0;
				}
			}
			if (flag != 0)
			{
				if (flag2 == 0)
				{
					System.out.print(a[i]);
					flag2 = 1;
				}
				else
				{
					System.out.print(" ");
					System.out.print(a[i]);
				}
			}
		}
		return 0;
	}

}

