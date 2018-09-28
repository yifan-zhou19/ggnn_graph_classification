package <missing>;

public class GlobalMembers
{
	/*
	 * zuoye5.cpp?????5?
	 *
	 *  Created on: 2011-11-9
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int[] x = {0, 1, 1, 0, 0, 0}; //??????1???????0
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				if (a == b)
				{
					continue;
				}
			for (c = 1;c <= 5;c++)
			{
				if (c == b || c == a)
				{
					continue;
				}
			for (d = 1;d <= 5;d++)
			{
				if (d == a || d == b || d == c)
				{
					continue;
				}
				for (e = 1;e <= 5;e++)
				{
					if (e == a || e == b || e == c || e == d || e == 2 || e == 3)
					{
						continue;
					}
				if ((e == 1) == x[a] && (b == 2) == x[b] && (a == 5) == x[c] && (c != 1) == x[d] && (d == 1) == x[e])
				{
					//????????????????????
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
				}
				}
			}

			}
			}
		}
	return 0;
	}

}
