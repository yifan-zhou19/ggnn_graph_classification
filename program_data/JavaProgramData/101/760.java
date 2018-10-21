package <missing>;

public class GlobalMembers
{
	/*
	 * homework9.cpp
	 *
	 *  Created on: 2012-10-11
	 *      Author: wangyinzhi
	 */

	public static int Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;

		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
						A = ((b > a) + (a == c));
						B = ((a > b) + (a > c));
						C = ((c > b) + (b > a)); //????ABC??????
					if ((A > B > C) && (c > b) && (b > a))
					{
						System.out.print("A");
						System.out.print("B");
						System.out.print("C");
					break;
					}
					if ((A > C > B) && (b < c) && (c < a))
					{
						System.out.print("A");
						System.out.print("C");
						System.out.print("B");
						break;
					}
					if ((B > A > C) && (b < a) && (a < c))
					{
						System.out.print("B");
						System.out.print("A");
						System.out.print("C");
						break;
					}
					if ((B > C > A) && (b < c) && (c < a))
					{
						System.out.print("B");
						System.out.print("C");
						System.out.print("A");
						break;
					}
					if ((C > B > A) && (c < b) && (b < a))
					{
						System.out.print("C");
						System.out.print("B");
						System.out.print("A");
						break;
					}
					if ((C > A > B) && (c < a) && (a < b))
					{
						System.out.print("C");
						System.out.print("A");
						System.out.print("B");
						break;
					} //??????????????????????????




				}
			}
		}

			return 0;
	}


}
