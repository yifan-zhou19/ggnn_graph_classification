package <missing>;

public class GlobalMembers
{
	/*
	 * ???.cpp
	 *  Created on: 2012-10-18
	 *      Author: ??? 1200012899
	 */
	public static int Main()
	{
		int a; //?a,b,c,d?????????
		int b;
		int c;
		int d;
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				for (c = 1;c <= 5;c++)
				{
					for (d = 1;d <= 5;d++) //?????????a?b?c?d???1?2?3?4
					{
						if ((a + b == c + d) && (a + d > b + c) && (a + c < b)) //???????????????????
						{
							if (a != b && a != c && a != d && b != c && b != d && c != d) //????????
							{
								System.out.print("l");
								System.out.print(" ");
								System.out.print(d * 10);
								System.out.print("\n");
								System.out.print("q");
								System.out.print(" ");
								System.out.print(b * 10);
								System.out.print("\n");

							 System.out.print("z");
							 System.out.print(" ");
							 System.out.print(a * 10);
							 System.out.print("\n");
							 System.out.print("s");
							 System.out.print(" ");
							 System.out.print(c * 10);
							 System.out.print("\n");
							}
						}
					}
				}
			}
		}
		return 0;
	}

}
