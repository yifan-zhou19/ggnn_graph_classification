package <missing>;

public class GlobalMembers
{
	/*
	 * shuzu2.13.cpp
	 *
	 *  Created on: 2012-11-20
	 *      Author: wangrunhui
	 */


	public static int Main()
	{
		char[][] str = new char[105][105];
		int i;
		int j;
		for (i = 0; ;i++)
		{
			str[i][0] = 0;
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (str[i][0] == 0)
			{
				break;
			}
		}
		System.out.print(str[i - 1]);
		for (j = i - 2; j >= 0; j--)
		{
			System.out.print(' ');
			System.out.print(str[j]);
		}
		return 0;
	}

}

