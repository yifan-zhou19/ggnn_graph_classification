package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int x;
			int y;
			int z;
			int a;
			int b;
			int c;
			int i;
			int j;
			for (i = 0;i <= 2;i++)
			{
				a = i;
				for (j = 0;j <= 2;j++)
				{
					if (j == i)
					{
						j++;
					}
					else
					{
						b = j;
						c = 3 - a - b;
						if (b > a && c == a)
						{
							x = 0;
						}
						else if (b <= a != 0 && c != a)
						{
							x = 2;
						}
						else
						{
							x = 1;
						}
						if (a > b && a > c)
						{
							y = 0;
						}
						else if (a <= b != 0 && a <= c)
						{
							y = 2;
						}
						else
						{
							y = 1;
						}
						if (c > b && b > a)
						{
							z = 0;
						}
						else if (c <= b != 0 && b <= a)
						{
							z = 2;
						}
						else
						{
							z = 1;
						}
						if (x == a && y == b && z == c)
						{
						if (b > c && a > c)
						{
							System.out.print('C');
							if (b > a)
							{
								System.out.print("AB");
							}
							else
							{
								System.out.print("BA");
							}
						}
						else if (a > b && c > b)
						{
							System.out.print('B');
							if (a > c)
							{
								System.out.print("CA");
							}
							else
							{
								System.out.print("AC");
							}
						}
						else if (a < b && b < c)
						{
							System.out.print("ABC");
						}
						else
						{
							System.out.print("ACB");
						}

						}
					}
				}
			}
	return 0;
	}
}
