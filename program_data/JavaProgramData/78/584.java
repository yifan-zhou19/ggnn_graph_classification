package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b,int c,int d)
	{
		int n = 0;
		if (a > n)
		{
			n = a;
		}
		if (b > n)
		{
			n = b;
		}
		if (c > n)
		{
			n = c;
		}
		if (d > n)
		{
			n = d;
		}
		return n;
	}
	public static int sec(int a,int b,int c,int d)
	{
		int n = 0;
		int m = max(a, b, c, d);
		if (a > n && a != m)
		{
			n = a;
		}
		if (b > n && b != m)
		{
			n = b;
		}
		if (c > n && c != m)
		{
			n = c;
		}
		if (d > n && d != m)
		{
			n = d;
		}
		return n;
	}
	public static int min(int a,int b,int c,int d)
	{
		int n = 100;
		if (a < n)
		{
			n = a;
		}
		if (b < n)
		{
			n = b;
		}
		if (c < n)
		{
			n = c;
		}
		if (d < n)
		{
			n = d;
		}
		return n;
	}
	public static int thi(int a,int b,int c,int d)
	{
		int n = 100;
		int m = min(a, b, c, d);
		if (a < n && a != m)
		{
			n = a;
		}
		if (b < n && b != m)
		{
			n = b;
		}
		if (c < n && c != m)
		{
			n = c;
		}
		if (d < n && d != m)
		{
			n = d;
		}
		return n;
	}
	public static int Main()
	{
		for (int z = 1;z <= 5;z += 1)
		{
			for (int q = 1;q <= 5;q += 1)
			{
				if (q != z)
				{
					for (int s = 1;s <= 5;s += 1)
					{
						if (s != z && s != q)
						{
							for (int l = 1;l <= 5;l += 1)
							{
								if (l != z && l != q && l != s)
								{
									if ((z + q) == (s + l)) //????????????????????????
									{
										if ((z + l) > (s + q)) //??????????????????????
										{
											if (z + s < q) //???????????????????
											{
												String m = new String(new char[6]);
												m = tangible.StringFunctions.changeCharacter(m, z, 'z');
												m = tangible.StringFunctions.changeCharacter(m, q, 'q');
												m = tangible.StringFunctions.changeCharacter(m, s, 's');
												m = tangible.StringFunctions.changeCharacter(m, l, 'l');
												System.out.print(m.charAt(max(z, q, s, l)));
												System.out.print(' ');
												System.out.print(10 * max(z, q, s, l));
												System.out.print("\n");
												System.out.print(m.charAt(sec(z, q, s, l)));
												System.out.print(' ');
												System.out.print(10 * sec(z, q, s, l));
												System.out.print("\n");
												System.out.print(m.charAt(thi(z, q, s, l)));
												System.out.print(' ');
												System.out.print(10 * thi(z, q, s, l));
												System.out.print("\n");
												System.out.print(m.charAt(min(z, q, s, l)));
												System.out.print(' ');
												System.out.print(10 * min(z, q, s, l));
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

