package <missing>;

public class GlobalMembers
{
	/*
	 * h040_kongtiaopaiming.cpp
	 * name:????
	 *  Created on: 2011-11-8
	 *      Author: zhujile
	 */
	public static int Main()
	{
		int a; //a~e?????
		int b;
		int c;
		int d;
		int e;
		for (e = 1;e <= 5;e++) //????????
		{
			if (e == 2 || e == 3)
			{
				continue; //??????e???????
			}
			for (a = 1;a <= 5;a++)
			{
				if (a == e)
				{
					continue; //??????
				}
				for (b = 1;b <= 5;b++)
				{
					if (b == a || b == e)
					{
						continue; //??????
					}
					for (c = 1;c <= 5;c++)
					{
						if (c == a || c == b || c == e)
						{
							continue; //??????
						}
						for (d = 1;d <= 5;d++)
						{
							if (d == a || d == b || d == c || d == e)
							{
								continue; //??????
							}
							if (a > 2 && e == 1)
							{
								continue; //???????????????
							}
							if (b > 2 && b == 2)
							{
								continue; //???????????????
							}
							if (c > 2 && a == 5)
							{
								continue; //???????????????
							}
							if (d > 2 && c != 1)
							{
								continue; //???????????????
							}
							if (e > 2 && d == 1)
							{
								continue; //???????????????
							}
							if (((a < 3 && e == 1) + (b < 3 && b == 2) + (c < 3 && a == 5) + (d < 3 && c != 1) + (e < 3 && d == 1)) != 2)
							{
								continue;
							}
																  //??????????
							System.out.print(a);
							System.out.print(" ");
							System.out.print(b);
							System.out.print(" ");
							System.out.print(c);
							System.out.print(" ");
							System.out.print(d);
							System.out.print(" ");
							System.out.print(e);
							System.out.print("\n");
							a = b = c = d = e = 6; //?????????
						}
					}
				}
			}
		}
		return 0;
	}
}
