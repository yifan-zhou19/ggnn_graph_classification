package <missing>;

public class GlobalMembers
{
	/*
	 * 001.cpp
	 * name:????
	 *  Created on: 2011-12-25
	 *      Author: 11029
	 */
	public static int Main()
	{
		char c;
		int flag = 1;
		while ((c = System.in.read()) != '\n')
		{
			if (c >= '0' && c <= '9')
			{
				System.out.print(c);
				flag = 0;
			}
			else
			{
				if (flag == 0)
				{
					System.out.print("\n");
				}
				flag = 1;
			}
		}
		return 0;
	}

}
