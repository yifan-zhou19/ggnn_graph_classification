package <missing>;

public class GlobalMembers
{
	/*
	 * linofjuz.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int n;
		int a;
		int b;
		int[][] juzhen = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int m = 1;m <= n;m++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i < a;i++)
			{
				for (int j = 0;j < b;j++)
				{
					*(*(juzhen + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			int s = 0;
			for (int i = 0;i < b;i++)
			{
				s = juzhen[0][i] + s;
				s = juzhen[a - 1][i] + s;
			}
			for (int j = 1;j < a - 1;j++)
			{
				s = juzhen[j][0] + s;
				s = juzhen[j][b - 1] + s;
			}
			System.out.print(s);
			System.out.print("\n");
		}
	}

}

