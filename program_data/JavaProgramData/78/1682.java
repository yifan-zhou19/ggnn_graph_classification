package <missing>;

public class GlobalMembers
{
	public static int Main() //????
	{
		int a;
		int b;
		int c;
		int d;
		char[] name = {'z', 'q', 's', 'l', '\0'};
		for (a = 10; a <= 50; a++)
		{
			for (b = 10; b <= 50; b++)
			{
				if (a == b)
				{
					continue;
				}
				for (c = 10; c <= 50; c++)
				{
					if (a == c || b == c)
					{
						continue;
					}
					for (d = 10; d <= 50; d++)
					{
						if (a == d || b == d || c == d)
						{
							continue;
						}
					if (a + b == c + d && a + d > b + c && a + c < b && a % 10 == 0 && b % 10 == 0 && c % 10 == 0 && d % 10 == 0)
					{
						if (a > b && b > c && c > d)
						{
							System.out.print("z");
							System.out.print(' ');
							System.out.print(a);
							System.out.print("\n");
							System.out.print("q");
							System.out.print(' ');
							System.out.print(b);
							System.out.print("\n");
							System.out.print("s");
							System.out.print(' ');
							System.out.print(c);
							System.out.print("\n");
							System.out.print("l");
							System.out.print(' ');
							System.out.print(d);
							System.out.print("\n");
						}
						else if (a > b && b > d && d > c)
						{
							System.out.print("z");
							System.out.print(' ');
							System.out.print(a);
							System.out.print("\n");
							System.out.print("q");
							System.out.print(' ');
							System.out.print(b);
							System.out.print("\n");
							System.out.print("s");
							System.out.print(' ');
							System.out.print(d);
							System.out.print("\n");
							System.out.print("l");
							System.out.print(' ');
							System.out.print(c);
							System.out.print("\n");
						}
						else if (a > c && c > d && d > b)
						{
							System.out.print("z");
							System.out.print(' ');
							System.out.print(a);
							System.out.print("\n");
							System.out.print("q");
							System.out.print(' ');
							System.out.print(c);
							System.out.print("\n");
							System.out.print("s");
							System.out.print(' ');
							System.out.print(d);
							System.out.print("\n");
							System.out.print("l");
							System.out.print(' ');
							System.out.print(b);
							System.out.print("\n");
						}
						else if (d > b && b > a && a > c)
						{
							System.out.print("l");
							System.out.print(' ');
							System.out.print(d);
							System.out.print("\n");
							System.out.print("q");
							System.out.print(' ');
							System.out.print(b);
							System.out.print("\n");
							System.out.print("z");
							System.out.print(' ');
							System.out.print(a);
							System.out.print("\n");
							System.out.print("s");
							System.out.print(' ');
							System.out.print(c);
							System.out.print("\n");
						}

					}
					}
				}

			}
		}

		return 0; //???????????
	} //????

}
