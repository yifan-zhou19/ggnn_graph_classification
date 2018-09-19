package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012858_26.cpp
	 *
	 *  Created on: 2010-11-3
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int[] f = new int[20001];
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			f[i] = 0;
		}
		for (i = 1;i <= n;i++)
		{
			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (f[a] == 0)
			{
				f[a] = 1;
				if (i != 1)
				{
					System.out.print(' ');
				}
				System.out.print(a);
			}
		}
		return 0;
	}



}

