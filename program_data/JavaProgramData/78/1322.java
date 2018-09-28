package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		for (a = 1; a <= 5; a++)
		{
			for (b = 1; b <= 5; b++)
			{
				if (b == a)
				{
					continue;
				}
				for (c = 1; c <= 5; c++)
				{
					if (c == a || c == b)
					{
						continue;
					}
					for (d = 1; d <= 5; d++)
					{
						if (a + b == c + d && a + d > b + c && a + c < b)
						{
							if (b > d && b > c && c > a)
							{
								System.out.print('q');
								System.out.print(" ");
								System.out.print(10 * b);
								System.out.print("\n");
								System.out.print('l');
								System.out.print(" ");
								System.out.print(10 * d);
								System.out.print("\n");
								System.out.print('s');
								System.out.print(" ");
								System.out.print(10 * c);
								System.out.print("\n");
								System.out.print('z');
								System.out.print(" ");
								System.out.print(10 * a);
								System.out.print("\n");
							}
							if (d > b && b > a && a > c)
							{
								System.out.print('l');
								System.out.print(" ");
								System.out.print(10 * d);
								System.out.print("\n");
								System.out.print('q');
								System.out.print(" ");
								System.out.print(10 * b);
								System.out.print("\n");
								System.out.print('z');
								System.out.print(" ");
								System.out.print(10 * a);
								System.out.print("\n");
								System.out.print('s');
								System.out.print(" ");
								System.out.print(10 * c);
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
