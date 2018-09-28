package <missing>;

public class GlobalMembers
{
	/*
	 * ditui4.cpp
	 *   ?????
	 *  Created on: 2010-11-20
	 *      Author: ???
	 */

	public static int Main()
	{
		int n;
		int k;
		int i; //z???????????z=n??a????????
		int j;
		int z;
		int a;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = n - 1;;i = i + n - 1)
		{
				a = i;
			z = 1;
			for (j = 1;j <= n - 1;j++)
			{
					c = a * n / (n - 1) + k;
				if (c % (n - 1) == 0)
				{
							z++;
							a = c;
				}
				else
				{
					break;
				}
			}
			if (z == n)
			{
				a = a * n / (n - 1) + k;
				break;
			}
		}
		System.out.print(a);
		return 0;
	}
}

