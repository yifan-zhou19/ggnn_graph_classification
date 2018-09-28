package <missing>;

public class GlobalMembers
{
	/*
	 * 5-6.cpp
	 *
	 *  Created on: 2011-11-5
	 *      Author: 11095
	 */

	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int as;
		int bs;
		int cs;
		int ds;
		int es;
		int ha;
		int hb;
		int hc;
		int hd;
		int he;
		int aa;
		int ab;
		int ac;
		int ad;
		int ae;
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				if (b == a)
				{
					continue;
				}
				for (c = 1;c <= 5;c++)
				{
					if (c == a || c == b)
					{
						continue;
					}
					for (d = 1;d <= 5;d++)
					{
						if (d == a || d == b || d == c)
						{
							continue;
						}
						e = 15 - a - b - c - d;
						as = (e == 1);
						bs = (b == 2);
						cs = (a == 5);
						ds = (c != 1);
						es = (d == 1);
						ha = a + as;
						hb = b + bs;
						hc = c + cs;
						hd = d + ds;
						he = e + es;
						if (ha * hb * hc * hd * he == 360 && as + bs + cs + ds + es == 2 && e != 2 && e != 3)
						{
							aa = a;
							ab = b;
							ac = c;
							ad = d;
							ae = e;
						}
					}
				}
			}
		}
		System.out.print(aa);
		System.out.print(" ");
		System.out.print(ab);
		System.out.print(" ");
		System.out.print(ac);
		System.out.print(" ");
		System.out.print(ad);
		System.out.print(" ");
		System.out.print(ae);
		System.out.print("\n");
	}

}
