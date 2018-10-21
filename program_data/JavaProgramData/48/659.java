package <missing>;

public class GlobalMembers
{
	/**
	* @file 1.cpp
	* @author ??? 1100012944
	* @date 2011-11-23
	* @description
	* ???????????????
	*/
	public static int day;
	public static int num0;
	public static int germf(int x, int y, int t)
	{
		if (t == 0 && x == 5 && y == 5)
		{
			return num0;
		}
		else if (t == 0 && x >= 0 && x <= 10 && y >= 0 && y <= 10)
		{
			return 0;
		}
		else if (x >= 5 - day && x <= 5 + day && y >= 5 - day && y <= 5 + day)
		{
			return (germf(x - 1, y - 1, t - 1) + germf(x - 1, y, t - 1) + germf(x - 1, y + 1, t - 1) + germf(x, y - 1, t - 1) + germf(x, y + 1, t - 1) + germf(x + 1, y - 1, t - 1) + germf(x + 1, y, t - 1) + germf(x + 1, y + 1, t - 1) + 2 * germf(x, y, t - 1));
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		num0 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= 9; i++)
		{
			System.out.print(germf(i, 1, day));
			for (j = 2; j <= 9; j++)
			{
				System.out.print(" ");
				System.out.print(germf(i, j, day));
			}
			System.out.print("\n");
		}
		return 0;
	}


}

