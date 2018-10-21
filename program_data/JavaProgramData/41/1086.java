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
						for (e = 1;e < 6;e++)
						{
							if ((a + b + c + d + e == 15) && (a * b * c * d * e == 120) && (e != 2) && (e != 3))
							{
									 int as;
									 int bs;
									 int cs;
									 int ds;
									 int es;
									 as = (e == 1);
									 bs = (b == 2);
									 cs = (a == 5);
									 ds = (c != 1);
									 es = (d == 1);
									 if (((a == 1 || a == 2) == as) && ((b == 1 || b == 2) == bs) && ((c == 1 || c == 2) == cs) && ((d == 1 || d == 2) == ds) && ((e == 1 || e == 2) == es))
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
