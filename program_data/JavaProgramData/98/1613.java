package <missing>;

public class GlobalMembers
{
	/********************************************
	 *@file   2.cpp                             *
	 *@author ??                              *
	 *@date   2013-12-13                        *
	 *@description                              *
	 *??????12?????                  *
	 ********************************************
	 */
	public static int Main()
	{
		int n;
		int i;
		int len;
		int Count = 0;
		String ch = new String(new char[50]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = ch.length();
			Count = Count + len + 1;
			if (Count > 81)
			{
				System.out.print("\n");
				System.out.print(ch);
				Count = len + 1;
			}
			else
			{
				if (i == 0)
				{
					System.out.print(ch);
				}
				else
				{
					System.out.print(' ');
					System.out.print(ch);
				}
			}
		}
		return 0;
	}
}

