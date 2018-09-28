package <missing>;

public class GlobalMembers
{
	/*
	 * 1049.cpp
	 *
	 *  Created on: 2011-12-21
	 *      Author: wuch
	 */

	public static int Main()
	{
		int n;
		int i;
		int j;
		int num;
		int[] a = new int[21];
		int ans;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (j = 1;j <= num;j++)
				{
					a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (j = 1;j <= num;j++)
				{
					a[j] = a[j] + (j - 1) * 3; //?a????????????????
				}
				ans = 60;
				for (j = 1;j <= num;j++)
				{
					if (a[j] <= 57)
					{
						ans = ans - 3; //????57??????3?
					}
					else if (a[j] < 60)
					{
						ans = ans - (60 - a[j]); //58,59?????????????
					}
				}
				System.out.print(ans);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

