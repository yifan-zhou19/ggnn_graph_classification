package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int as;
		int bs;
		int cs;
		int ds;
		int es;
		int a;
		int b;
		int c;
		int d;
		int e;
		int g = 0;
		for (a = 5;a >= 1;a--)
		{
			for (b = 5;b >= 1;b--)
			{
				if (a == b)
				{
					continue;
				}
				for (c = 5;c >= 1;c--)
				{
					if (c == a || c == b)
					{
						continue;
					}
					for (d = 5;d >= 1;d--)
					{
						if (d == a || d == b || d == c)
						{
							continue;
						}
						for (e = 5;e >= 1;e--)
						{
							if (e == a || e == b || e == c || e == d)
							{
								continue;
							}
							as = (e == 1);
							bs = (b == 2);
							cs = (a == 5);
							ds = (c != 1);
							es = (d == 1);
							if (as + bs + cs + ds + es == 2 && e != 2 && e != 3)
							{
								System.out.print(a);
								System.out.print(" ");
								System.out.print(b);
								System.out.print(" ");
								System.out.print(c);
								System.out.print(" ");
								System.out.print(d);
								System.out.print(" ");
								System.out.print(e);
								System.out.print("\n");
								g = 1;
								break;
							}
						}
						if (g == 1)
						{
							break;
						}
					}
					if (g == 1)
					{
							break;
					}
				}
				if (g == 1)
				{
							break;
				}
			}
			if (g == 1)
			{
							break;
			}
		}
		return 0;
	}

}
