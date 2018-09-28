package <missing>;

public class GlobalMembers
{
	/*
	 * pratise.cpp
	 *
	 *  Created on: 2013-10-29
	 *      Author: dyx
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int[] z = new int[n];
		int a = 0;
		for (i = 0;i < n;i++)
		{
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		sort(z[0], z[n]);
		for (i = 0;i < n;i++)
		{
			if (z[i] % 2 == 1)
			{
				if (a == 0)
				{
					System.out.print(z[i]);
					a++;
				}
				else
				{
					System.out.print(",");
					System.out.print(z[i]);
				}
			}

		}





	}

}

