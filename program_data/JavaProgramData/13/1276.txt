package <missing>;

public class GlobalMembers
{
	/*
	 * homework1106.cpp
	 *
	 *  Created on: 2012-11-5
	 *      Author: wangyinzhi
	 */

	public static int Main()
	{
		int n;
		int i;
		int k;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n - 1;i++)
		{
		   for (k = 0;k <= i - 1;k++)
		   {
			   if (a[i] == a[k])
			   {
				   a[i] = 0;
				   break; //???????????????0
			   }
		   }
		}

		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] != 0)
			{
			if (i == 0)
			{
				System.out.print(a[i]);
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

