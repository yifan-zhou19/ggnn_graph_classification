package <missing>;

public class GlobalMembers
{
	/*
	 * test.cpp
	 *
	 *  Created on: Nov 7, 2012
	 *      Author: Sheldon
	 */

	public static int Main()
	{
		int[] flag = new int[101];
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int f = 0;
		for (int i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (flag[a] == 0)
			{
				flag[a] = 1;
				if (f == 0)
				{
					System.out.print(a);
					f = 1;
				}
				else
				{
					System.out.print(" ");
					System.out.print(a);
				}
			}
		}
		return 0;
	}

}

