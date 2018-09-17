package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *???  ????????
	 *  Created on: 2011-11-14
	 *      Author: wangwenxia1963
	 */
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;x / i > 0;i = i * 2)
		{
		;
		}
		for (j = 1;y / j > 0;j = j * 2)
		{
		;
		}
		i = i / 2;
		j = j / 2; //i,j????2?????
		if (i > j)
		{
			x = x * j / i;
		}
		else
		{
			y = y * i / j;
		}
		while (x != y)
		{
			x = x / 2;
			y = y / 2;
		}
		System.out.print(x);






	}

}

