package <missing>;

public class GlobalMembers
{
	/*
	 *  Name: tizhong.cpp
	 *
	 *  Created on: 2012-10-16
	 *  Author: 00948343_??
	 *  Function????
	 */



	public static int Main()
	{
		int z; //??????????
		int q;
		int s;
		int l;
		for (z = 10;z <= 50;z = z + 10)
		{ //?????????????????
			for (q = 10;q <= 50;q = q + 10)
			{
				if (q != z)
				{
					for (s = 10;s <= 50;s = s + 10)
					{
						if ((s != z) && (s != q))
						{
							for (l = 10;l <= 50;l = l + 10)
							{
								if ((l != s) && (l != z) && (l != q))
								{
									if ((l + s - z == q) && (z + l - s > q) && (z + s < q))
									{ //????????????????
										for (int i = 50;i > 0;i = i - 10)
										{
											if (i == z)
											{
												System.out.print("z ");
												System.out.print(i);
												System.out.print("\n");
											}
											else if (i == q)
											{
												System.out.print("q ");
												System.out.print(i);
												System.out.print("\n");
											}
											else if (i == s)
											{
												System.out.print("s ");
												System.out.print(i);
												System.out.print("\n");
											}
											else if (i == l)
											{
												System.out.print("l ");
												System.out.print(i);
												System.out.print("\n");
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
		return 0;
	}






}
