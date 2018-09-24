package <missing>;

public class GlobalMembers
{
	/*
	 * 81.cpp
	 *
	 *  Created on: 2012-11-23
	 *      Author: 99013
	 */


	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float min = n + k;
		float temp;
		int suc = 1;
		for (i = 1;;i++)
		{
			min = i * n + k;
			for (j = 1;j < n;j++)
			{
				temp = 1 - (float)1 / n;
				suc = 1;
				if ((int)min % (n - 1) == 0)
				{
					min = min / temp + k;
				}
				else if ((int)min % (n - 1) != 0)
				{
					suc = 0;
					j = n;
				}
			}
			if (suc == 1)
			{
			break;
			}
		}
	System.out.print((int)min);


		return 0;
	}
}

