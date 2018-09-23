package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012739_32_2.cpp
	 *
	 *  Created on: 2010-11-22
	 *      Author: ???
	 *		Title: 1062 ???
	 */



	public static int Main()
	{
		int x; //?????m??????x
		int y;
		int m;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (y != 1)
		{
			m = x; //m????x
			while (m != 1)
			{
				if (m == y) //?????
				{
					System.out.print(m);
					return 0; //????
				}
				m /= 2; //x???????
			}
			y /= 2; //y???????
		}
		System.out.print(1);
		return 0; //????
	}
}

