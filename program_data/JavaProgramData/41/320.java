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
	for (a = 1;a <= 5;a++)
	{
		for (b = 1;b <= 5;b++)
		{
			  if (b == a)
			  {
				  continue;
			  }
			for (c = 1;c <= 5;c++)
			{
					if (c == b || c == a)
					{
						continue;
					}
				for (d = 1;d <= 5;d++)
				{
						if (d == a || d == b || d == c)
						{
							continue;
						}
					for (e = 1;e <= 5;e++)
					{
						if (e != a && e != b && e != c && e != d)
						{
						if (e != 3 && e != 2 && (a == 1 || a == 2) == (e == 1) && (b == 1 || b == 2) == (b == 2) && (c == 1 || c == 2) == (a == 5) && (d == 1 || d == 2) == (c != 1) && (e == 1 || e == 2) == (d == 1))
						{
					System.out.print(a);
					System.out.print(' ');
					System.out.print(b);
					System.out.print(' ');
					System.out.print(c);
					System.out.print(' ');
					System.out.print(d);
					System.out.print(' ');
					System.out.print(e);
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
