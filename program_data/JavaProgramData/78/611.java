package <missing>;

public class GlobalMembers
{
	/*
	 * chengtizhong.cpp
	 *??????
	 *  Created on: 2013-9-27
	 *      Author: ???
	 */
	public static int Main()
	{
		for (int z = 10;z <= 50;z += 10)
		{
			for (int q = 10;q <= 50;q += 10)
			{
				for (int s = 10;s <= 50;s += 10)
				{
					int l = z + q - s;
					if ((z + l > s + q) && (z + s < q) && (z != q) && (z != s) && (z != l) && (q != s) && (q != l) && (s != l) && (l>0) && (l <= 50))
					{
						for (int i = 50;i > 0;i -= 10)
						{
							if (z == i)
							{
								System.out.print("z ");
								System.out.print(z);
								System.out.print("\n");
							}
							if (q == i)
							{
								System.out.print("q ");
								System.out.print(q);
								System.out.print("\n");
							}
							if (s == i)
							{
								System.out.print("s ");
								System.out.print(s);
								System.out.print("\n");
							}
							if (l == i)
							{
								System.out.print("l ");
								System.out.print(l);
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
