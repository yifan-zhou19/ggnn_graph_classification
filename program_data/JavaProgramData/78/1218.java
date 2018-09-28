package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		for (a = 10; a <= 50; a += 10)
		{
			for (b = 10; b <= 50; b += 10)
			{
				if (a == b)
				{
					continue;
				}
				for (c = 10; c <= 50; c += 10)
				{
					d = a + b - c;
					if (d == a || d == b || d == c || d < 10 || d > 50 || a == c || b == c)
					{
						continue;
					}
					if (a + d > b + c && a + c < b)
					{
						break;
					}
				}
				if (c != 60)
				{
				break;
				}
			}
			if (b != 60)
			{
				break;
			}
		}
		for (int i = 50; i >= 10; i -= 10)
		{
			if (a == i)
			{
				System.out.print("z");
				System.out.print(' ');
				System.out.print(a);
				System.out.print("\n");
			}
			else
			{
				if (b == i)
				{
					System.out.print("q");
					System.out.print(' ');
					System.out.print(b);
					System.out.print("\n");
				}
				else
				{
					if (c == i)
					{
						System.out.print("s");
						System.out.print(' ');
						System.out.print(c);
						System.out.print("\n");
					}
					else
					{
						if (d == i)
						{
							System.out.print("l");
							System.out.print(' ');
							System.out.print(d);
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}
}
