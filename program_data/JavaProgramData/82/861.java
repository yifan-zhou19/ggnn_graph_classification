package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-10-8
	 *      Author: Lixurong
	 */


	public static int Main()
	{
		int n; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int s = 0; //??????
		int h = 0;
		for (int i = 0; i < n; i++) //??
		{
			int a; //????
			int b;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((90 - a <= 0) + (140 - a >= 0) + (b - 60 >= 0) + (b - 90 <= 0) == 4) //??
			{
				s++;
				h = Math.max(s, h);
			}
			else
			{
				s = 0;
			}
		}
		System.out.print(h);
		return 0;
	}

}

