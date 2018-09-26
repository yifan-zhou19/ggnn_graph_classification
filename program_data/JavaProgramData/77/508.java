package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012739_finaltest3_7.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: ???
	 *		Title: ????
	 */


	public static int indexx = -1;
	public static char boy = '\0';
	public static char girl = '\0';

	public static int slv()
	{
		char c;
		int ind;
		int m;
		while (true)
		{
			indexx++;
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (indexx == 0)
			{
				boy = c;
			}
			else
			{
				if (girl == '\0' && c != boy)
				{
					girl = c;
				}
			}
			if (c == girl)
			{
				return indexx;
			}
			else
			{
				ind = indexx;
				m = slv();
				System.out.print(ind);
				System.out.print(' ');
				System.out.print(m);
				System.out.print("\n");
			}
		}
	}

	public static int Main()
	{
		slv();
		return 0;
	}

}

