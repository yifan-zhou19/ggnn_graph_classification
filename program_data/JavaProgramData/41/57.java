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
		for (a = 1;a < 6;a++)
		{
			for (b = 1;b < 6;b++)
			{
				if (a == b)
				{
					continue;
				}
				for (c = 1;c < 6;c++)
				{
					if (a == c || b == c)
					{
						continue;
					}
					for (d = 1;d < 6;d++)
					{
						if (a == d || b == d || c == d)
						{
							continue;
						}
						e = 15 - a - b - c - d;
						if ((e != 2 && e != 3) && (((b == 1 || b == 2) && (b == 2)) || (b != 1 && b != 2 && b != 2)) && (((a == 1 || a == 2) && e == 1) || (a != 1 && a != 2 && e != 1)) && (((c == 1 || c == 2) && a == 5) || (c != 1 && c != 2 && a != 5)) && (((d == 1 || d == 2) && (c != 1)) || ((d != 1) && (d != 2) && c == 1)) && (((e == 1 || e == 2) && d == 1) || (e != 1 && e != 2 && d != 1)))
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
