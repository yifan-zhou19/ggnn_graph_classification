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
				for (c = 1;c < 6;c++)
				{
					for (d = 1;d < 6;d++)
					{
						if (a != b && a != c && a != d && b != c && b != d && c != d)
						{
							e = 15 - a - b - c - d;
							if (e != 2 && e != 3)
							{
								if (((e == 1) && (b == 2) && (a != 5) && (c == 1) && (d != 1) && (a == 1)) || ((c == 1) && (e != 1) && (b == 2) && (a == 5) && (c == 1) && (d != 1)) || ((d == 1) && (e != 1) && (b == 2) && (a != 5) && (c != 1) && (d != 1)) || ((e == 1) && (e != 1) && (b == 2) && (a != 5) && (c == 1) && (d == 1)))
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
