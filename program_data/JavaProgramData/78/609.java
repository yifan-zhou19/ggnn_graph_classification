package <missing>;

public class GlobalMembers
{
	/*
	 * ???.cpp
	 *
	 *  Created on: 2013-10-13
	 *      Author: 111
	 */
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		int sum = 0;
		for (z = 10;z <= 50;z = z + 10) //????for??
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
					for (l = 10;l <= 50;l = l + 10)
					{
						sum = (z != q) + (z != s) + (z != l) + (q != s) + (q != l) + (s != l) + (z + q == s + l) + (z + l > s + q) + (z + s < q);
								if (sum == 9) //??9??????
								{
									for (i = 50;i >= 10;i = i - 10)
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
