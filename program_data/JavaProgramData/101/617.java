package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int x;
		int y;
		int z;
		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				if (a == b)
				{
					continue;
				}
				c = 3 - a - b;
				x = (b > a) + (a == c);
				y = (a > b) + (a > c);
				z = (c > b) + (b > a);
				;
				if ((x - y) == (b - a) && (y - z) == (c - b) && (x - z) == (c - a))
				{
					for (int i = 0;i < 3;i++)
					{
						if (a == i)
						{
							System.out.print('A');
						}
						if (b == i)
						{
							System.out.print('B');
						}
						if (c == i)
						{
							System.out.print('C');
						}
					}
				}
			}
		}

		return 0;
	}
}
