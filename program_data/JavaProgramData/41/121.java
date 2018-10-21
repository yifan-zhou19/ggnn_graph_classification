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
		int t;
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				for (c = 1;c <= 5;c++)
				{
					for (d = 1;d <= 5;d++)
					{
						for (e = 1;e <= 5;e++)
						{
							if ((e != 2) && (e != 3))
							{
								t = 0;
								if ((a <= 2 && e == 1) || (a >= 3 && e != 1))
								{
									t++;
								}
								if (b != 1)
								{
									t++;
								}
								if ((c <= 2 && a == 5) || (c >= 3 && a != 5))
								{
									t++;
								}
								if ((d <= 2 && c != 1) || (d >= 3 && c == 1))
								{
									t++;
								}
								if (e != 1 && d != 1)
								{
									t++;
								}
								if ((t == 5) && (a + b + c + d + e == 15) && (a * b * c * d * e == 120))
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
									break;
								}
							}
						}
					}
				}
			}
		}
		System.in.read();
		return 0;
	}
}
