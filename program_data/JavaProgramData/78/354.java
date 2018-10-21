package <missing>;

public class GlobalMembers
{
	/*
	 *????pro30.cpp
	 *??????
	 *?????2012-10-10
	 *??????
	 */



	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int zz;
		int qq;
		int ss;
		int ll;
		for (z = 10;z <= 50;z += 10) // ????
		{
			for (q = 10;q <= 50;q += 10)
			{
				for (s = 10;s <= 50;s += 10)
				{
					for (l = 10;l <= 50;l += 10)
					{
						if (z + q == s + l && z + l > s + q && z + s < q) // ??
						{
							zz = (z < q) + (z < s) + (z < l); // ????
							qq = (q < z) + (q < s) + (q < l);
							ss = (s < z) + (s < q) + (s < l);
							ll = (l < z) + (l < q) + (l < s);
							if (zz == 0)
							{
								System.out.print("z ");
								System.out.print(z);
								System.out.print("\n");
							}
							if (qq == 0)
							{
								System.out.print("q ");
								System.out.print(q);
								System.out.print("\n");
							}
							if (ss == 0)
							{
								System.out.print("s ");
								System.out.print(s);
								System.out.print("\n");
							}
							if (ll == 0)
							{
								System.out.print("l ");
								System.out.print(l);
								System.out.print("\n");
							}
							if (zz == 1)
							{
								System.out.print("z ");
								System.out.print(z);
								System.out.print("\n");
							}
							if (qq == 1)
							{
								System.out.print("q ");
								System.out.print(q);
								System.out.print("\n");
							}
							if (ss == 1)
							{
								System.out.print("s ");
								System.out.print(s);
								System.out.print("\n");
							}
							if (ll == 1)
							{
								System.out.print("l ");
								System.out.print(l);
								System.out.print("\n");
							}
							if (zz == 2)
							{
								System.out.print("z ");
								System.out.print(z);
								System.out.print("\n");
							}
							if (qq == 2)
							{
								System.out.print("q ");
								System.out.print(q);
								System.out.print("\n");
							}
							if (ss == 2)
							{
								System.out.print("s ");
								System.out.print(s);
								System.out.print("\n");
							}
							if (ll == 2)
							{
								System.out.print("l ");
								System.out.print(l);
								System.out.print("\n");
							}
							if (zz == 3)
							{
								System.out.print("z ");
								System.out.print(z);
								System.out.print("\n");
							}
							if (qq == 3)
							{
								System.out.print("q ");
								System.out.print(q);
								System.out.print("\n");
							}
							if (ss == 3)
							{
								System.out.print("s ");
								System.out.print(s);
								System.out.print("\n");
							}
							if (ll == 3)
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
