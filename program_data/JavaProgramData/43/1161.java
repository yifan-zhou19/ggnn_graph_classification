package <missing>;

public class GlobalMembers
{
	/********************************************
	 *@file   4.cpp                             *
	 *@author ??                              *
	 *@date   2013-10-28                        *
	 *@description                              *
	 *??????5???????               *
	 ********************************************
	 */
	public static int Main()
	{
		int n;
		int x;
		int y;
		int i;
		int j;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 3; x <= n / 2; x++)
		{
			for (i = 2; i <= x / 2; i++)
			{
				if (x % i == 0)
				{
					break;
				}
					count++;
			}
			if (count == x / 2 - 1)
			{
				y = n - x;
				count = 0;
				for (j = 2; j <= y / 2; j++)
				{
					if (y % j == 0)
					{
						break;
					}
						count++;
				}
				if (count == y / 2 - 1)
				{
					System.out.print(x);
					System.out.print(" ");
					System.out.print(y);
					System.out.print("\n");
					count = 0;
				}
				else
				{
					count = 0;
				}
			}
			else
			{
				count = 0;
			}
		}
		return 0;
	}
}

