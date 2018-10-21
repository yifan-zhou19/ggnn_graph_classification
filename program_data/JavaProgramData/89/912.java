package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-12-19
	 *      Author: 1100012870
	 */
	public static int[] whoknow = new int[1000000];
	public static int[] knowwho = new int[1000000];
	public static int Main()
	{
		int i;
		int n;
		int x;
		int y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (!(x == 0 && y == 0))
		{
			whoknow[y]++;
			knowwho[x]++;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i <= n;i++)
		{
			if (knowwho[i] == 0 && whoknow[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				return 0;
			}
		}
		System.out.print("NOT FOUND");
		System.out.print("\n");
		return 0;
	}
}

