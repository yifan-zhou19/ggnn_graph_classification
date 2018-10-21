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
		int sa;
		int sb;
		int sc;
		int sd;
		int se;
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
						if (e == 2 || e == 3)
						{
							continue;
						}
						sa = (e == 1);
						sb = (b == 2);
						sc = (a == 5);
						sd = (c != 1);
						se = (d == 1);
						if (sa + sb + sc + sd + se == 2 && sa * a + sb * b + sc * c + sd * d + se * e == 3)
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
						}


					}
				}
			}
		}

			return 0;

	}


}
