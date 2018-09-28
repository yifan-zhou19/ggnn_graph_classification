package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				if (a == b)
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
						for (e = 1;e <= 5;e++)
						{
							if (e == a || e == b || e == c || e == d)
							{
								continue;
							}
							if (e != 2 && e != 3 && ((e == 1) + (a == 1 || a == 2)) % 2 == 0 && ((b == 2) + (b == 1 || b == 2)) % 2 == 0 && ((a == 5) + (c == 1 || c == 2)) % 2 == 0 && ((c != 1) + (d == 1 || d == 2)) % 2 == 0 && ((d == 1) + (e == 1 || e == 2)) % 2 == 0)
							{
								System.out.print(a);
								System.out.print(' ');
								System.out.print(b);
								System.out.print(' ');
								System.out.print(c);
								System.out.print(' ');
								System.out.print(d);
								System.out.print(' ');
								System.out.print(e);
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
