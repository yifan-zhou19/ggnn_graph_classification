package <missing>;

public class GlobalMembers
{
	/*
	 * practice.cpp
	 *
	 *  Created on: 2013-12-26
	 *      Author: 111
	 */

	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 10;z < 60;z += 10)
		{
			for (q = 10;q < 60;q += 10)
			{
				for (s = 10;s < 60;s += 10)
				{
					for (l = 10;l < 60;l += 10)
					{
						if (z == q || z == s || z == l || q == s || q == l || s == l)
						{
							continue;
						}
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							for (int i = 50;i > 0;i = i - 10)
							{
								if (z == i)
								{
									System.out.print('z');
									System.out.print(' ');
									System.out.print(z);
									System.out.print("\n");
								}
								if (q == i)
								{
									System.out.print('q');
									System.out.print(' ');
									System.out.print(q);
									System.out.print("\n");
								}
								if (s == i)
								{
									System.out.print('s');
									System.out.print(' ');
									System.out.print(s);
									System.out.print("\n");
								}
								if (l == i)
								{
									System.out.print('l');
									System.out.print(' ');
									System.out.print(l);
									System.out.print("\n");
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}

}
