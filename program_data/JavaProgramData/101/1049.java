package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;

		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++)
				{
					n = 0;
					if (a == 2 - (b > a) - (c == a))
					{
						n = n + 1;
					}
					if (b == 2 - (a > b) - (a > c))
					{
						n = n + 1;
					}
					if (c == 2 - (c > b) - (b > a))
					{
						n = n + 1;
					}
					if (a != b && a != c && b != c)
					{
						n = n + 1;
					}
					if (n == 4)
					{
						if (a == 0)
						{
							System.out.print("A");
							if (b < c)
							{
								System.out.print("BC");
							}
							else
							{
								System.out.print("CB");
							}
						}
						if (b == 0)
						{
							System.out.print("B");
							if (a < c)
							{
								System.out.print("AC");
							}
							else
							{
								System.out.print("CA");
							}
						}
						if (c == 0)
						{
							System.out.print("C");
							if (a < b)
							{
								System.out.print("AB");
							}
							else
							{
								System.out.print("BA");
							}
						}
					}
				}
			}
		}
		return 0;
	}

}
