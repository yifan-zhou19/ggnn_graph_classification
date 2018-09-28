package <missing>;

public class GlobalMembers
{
	/*
	 *@file 5.cpp
	 *@author ???
	 *@date 10.24
	 *@description ????????
	 */

	public static int Main()
	{
		int m; //??????m?????????x,?????????????
		int x;
		int shuchu;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 3; x <= m / 2; x += 2)
		{
			shuchu = 1;
			for (int i = 2; i <= Math.sqrt(x); i++)
			{
				if ((x % i) == 0)
				{
					shuchu = 0;
					break;
				}
			}

			if (shuchu == 1)
			{
					for (int j = 2; j <= Math.sqrt(m - x); j++)
					{
						if (((m - x) % j) == 0)
						{
							shuchu = 0;
							break;
						}
					}
					if (shuchu == 1)
					{
						System.out.print(x);
						System.out.print(" ");
						System.out.print(m - x);
						System.out.print("\n");
					}
			}
		}
		return 0;
	}
}

