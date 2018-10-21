package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				if (a == b)
				{
					continue;
				}
				else
				{
					c = 3 - a - b;
					if (((a + (b > a) + (c == a)) == 2) && ((b + (a > b) + (a > c)) == 2) && ((c + (c > b) + (b > a)) == 2))
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
						break;
					}
				}
			}
		}
		return 0;
	}
}
