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
		int aa;
		int ab;
		int ac;
		int ad;
		int ae;
		int[] s = new int[6];
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
						s[a] = (e == 1);
						s[b] = (b == 2);
						s[c] = (a == 5);
						s[d] = (c != 1);
						s[e] = (d == 1);
						if (s[1] + s[2] == 2 && s[3] + s[4] + s[5] == 0 && e != 2 && e != 3)
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
		return 0;
	}

}
