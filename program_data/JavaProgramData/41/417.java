package <missing>;

public class GlobalMembers
{
	/*
	 * pr10.cpp
	 *
	 *  Created on: 2011-11-15
	 *      Author: Gan Hua
	 */

	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int[] f = new int[6];
	for (a = 1;a <= 5;a++)
	{
		for (b = 1;b <= 5;b++)
		{
			for (c = 1;c <= 5;c++)
			{
				for (d = 1;d <= 5;d++)
				{
					for (e = 1;e <= 5;e++)
					{
						if ((a + b + c + d + e == 15) && (a * b * c * d * e == 120))
						{
							if ((e != 2) && (e != 3))
							{
							f[a] = (e == 1);
							f[b] = (b == 2);
							f[c] = (a == 5);
							f[d] = (c != 1);
							f[e] = (d == 1);
							  if ((f[1] + f[2] == 2) && (f[3] + f[4] + f[5] == 0))
							  {

							  System.out.print(a);
							  System.out.print(' ');
							  System.out.print(b);
							  System.out.print(' ');
							  System.out.print(c);
							  System.out.print(' ');
							  System.out.print(d);
							  System.out.print(' ');
							  System.out.print(e);
							  }
							}
						}
					}
				}
			}
		}
	}
	}

}
