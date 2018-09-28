package <missing>;

public class GlobalMembers
{
	/*
	 * shehuimingliu.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: lz
	 */

	public static int[][] people = new int[20000][20000];
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a;
		int b;

		int i;
		int j;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != 0 || b != 0)
		{
			people[a][b] = 1;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (i != j)
				{
					if (people[i][j] == 1 && people[j][i] == 0)
					{
						continue;
					}
					else
					{
						break;
					}
				}
			}
			if (i == n)
			{
				System.out.print(j);
				break;
			}
		}
		if (j == n)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}

}

