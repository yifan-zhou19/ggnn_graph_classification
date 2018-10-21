package <missing>;

public class GlobalMembers
{
	/*
	 * 20.cpp
	 * function????????3?????
	 * Created on: 2012-10-24
	 * Author: sear
	 */
	public static int Main()
	{
		int a; //a b c????ABC??????
		int b;
		int c;
		for (a = 1;a <= 3;a++)
		{ //a?1?3????
			for (b = 1;b <= 3;b++)
			{ //b?1?3????
				for (c = 1;c <= 3;c++)
				{ //c?1?3????
					if ((a + (b > a) + (a == c) == 3) && (b + (a > b) + (a > c) == 3) && (c + (c > b) + (b > a) == 3))
					{
					//????????????????????3
		if (a > b)
		{ //???abc???????????????????
			if (a < c)
			{
				System.out.print('B');
				System.out.print('A');
				System.out.print('C');
			}
			else
			{
				if (b > c)
				{
					System.out.print('C');
					System.out.print('B');
					System.out.print('A');
				}
				else
				{
					System.out.print('B');
					System.out.print('C');
					System.out.print('A');
				}
			}
		}
		else
		{
			if (b < c)
			{
				System.out.print('A');
				System.out.print('B');
				System.out.print('C');
			}
			else
			{
				if (a < c)
				{
					System.out.print('A');
					System.out.print('C');
					System.out.print('B');
				}
				else
				{
					System.out.print('C');
					System.out.print('A');
					System.out.print('B');
				}
			}
		}
					}
				}
			}
		}
				return 0; //????
	}

}
