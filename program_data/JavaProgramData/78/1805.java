package <missing>;

public class GlobalMembers
{
	/*
	 * 13.cpp
	 *???
	 *  Created on: 2012-10-16
	 *      Author: ???
	 */
	public static int Main()
	{
		int z; //????
		int q;
		int s;
		int l;
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
					for (l = 10;l <= 50;l = l + 10)
					{
						if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q) //for???????????????
						{
							if (z != q && z != s && z != l && q != s && q != s && s != l) //????
							{
								System.out.print("l");
								System.out.print(" ");
								System.out.print(l);
								System.out.print("\n");
								System.out.print("q");
								System.out.print(" ");
								System.out.print(q);
								System.out.print("\n");
								System.out.print("z");
								System.out.print(" ");
								System.out.print(z);
								System.out.print("\n");
								System.out.print("s");
								System.out.print(" ");
								System.out.print(s);
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
	}

}
