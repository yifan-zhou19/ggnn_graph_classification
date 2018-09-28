package <missing>;

public class GlobalMembers
{
	/*
	 * ?????.cpp
	 *
	 *  Created on: 2012-11-14
	 *      Author: ???
	 */
	public static int Main()
	{
		int n = 0;
		int k = 0;
		int j = 1;
		int i = 1;
		int apples = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		apples = n + k;
		while (true)
		{
			while (apples % (n - 1) == 0 && i < n)
			{
				apples = apples / (n - 1) * n + k;
				++i;
			}
			if (i < n)
			{
				j++;
				apples = j * n + k;
				i = 1;
			}
			else
			{
				break;
			}
		}
		System.out.print(apples);
		return 0;
	}

}

