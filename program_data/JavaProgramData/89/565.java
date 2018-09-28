package <missing>;

public class GlobalMembers
{
	/*
	 * ceyan5.cpp
	 *??:??????
	 *  Created on: 2011-1-8
	 *      Author: 10154
	 */

	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int N = n;
		int[] knowme = new int[N];
		for (i = 0;i < n;i++)
		{
			knowme[i] = 0;
		}
		i = 0;
		j = 0;
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i != 0 || j != 0)
		{
			knowme[j]++;
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (knowme[i] == n - 1)
			{
				j = 1;
				System.out.print(i);
				System.out.print("\n");
			}
		}
		if (j == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

