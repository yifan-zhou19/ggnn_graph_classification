package <missing>;

public class GlobalMembers
{
	/*
	 *  1000012850_32.1.cpp
	 *  ????????  ????????
	 *  Created on: 2010-11-20
	 *      Author: William
	 */
	public static int Main() //???
	{
		int[] apple = new int[1000];
		int n;
		int k;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;;i++)
		{
			apple[n] = i * (n - 1);
			for (j = n;j >= 2;j--)
			{
				apple[j - 1] = apple[j] * n / (n - 1) + k;
				if (apple[j - 1] % (n - 1) != 0)
				{
					break;
				}
			}
			if (j == 1)
			{
				System.out.print((apple[1] * n / (n - 1) + k));
				break;
			}
		}
		return 0;
	}
}

