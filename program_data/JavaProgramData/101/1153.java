package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int a1 = 0;
		int b1 = 0;
		int c1 = 0;
		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++)
				{
					if ((a != b) && (a != c) && (b != c))
					{
						a1 = (b > a) + (c == a);
						b1 = (a > b) + (a > c);
						c1 = (c > b) + (b > a);
						if (((a + a1) == 2) && ((b + b1) == 2) && ((c + c1) == 2))
						{
							if (a == 0)
							{
								System.out.print('A');
							}
							if (b == 0)
							{
								System.out.print('B');
							}
							if (c == 0)
							{
								System.out.print('C');
							}
							if (a == 1)
							{
								System.out.print('A');
							}
							if (b == 1)
							{
								System.out.print('B');
							}
							if (c == 1)
							{
								System.out.print('C');
							}
							if (a == 2)
							{
								System.out.print('A');
							}
							if (b == 2)
							{
								System.out.print('B');
							}
							if (c == 2)
							{
								System.out.print('C');
							}
						}
					}
				}
			}
		}
			return 0;
	}
}
