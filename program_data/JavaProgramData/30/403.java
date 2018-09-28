package <missing>;

public class GlobalMembers
{
	/*
	 * ?7????????1045?.cpp
	 *
	 *  Created on: 2010-11-16
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int s = 0;
		for (int i = 1;i <= n;i++)
		{
		int a = i % 10;
		int b = (i - a) / 10;
		if (a != 7 && b != 7 && i % 7 != 0)
		{
			s = s + i * i;
		}
		}
		System.out.print(s);
		return 0;

	}

}

