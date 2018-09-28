package <missing>;

public class GlobalMembers
{
	/*
	 * homework1105.cpp
	 *
	 *  Created on: 2012-11-5
	 *      Author: wangyinzhi
	 */


	public static int Main()
	{
		int n; //????
		int i;
		int[] a = new int[100001];
		int k;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if (k != a[i])
			{
				c = c + 1;
				if (c == 1)
				{
				System.out.print(a[i]);
				}
			else
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
			} //???????k????

		}
		return 0;
	}

}

