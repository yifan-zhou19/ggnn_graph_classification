package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		for (int a = 1 ; a < 6 ; a++)
		{
			for (int b = 1 ; b < 6 ; b++)
			{
				if (b == a)
				{
					continue;
				}
				for (int c = 1 ; c < 6 ; c++)
				{
					if (c == a || c == b)
					{
						continue;
					}
					for (int d = 1 ; d < 6 ; d++)
					{
						if (d == a || d == c || d == b)
						{
							continue;
						}
						for (int e = 1 ; e < 6 ; e++)
						{
							if (e == a || e == b || e == c || e == d || e == 2 || e == 3)
							{
								continue;
							}
							if ((e != 1 ^ (a == 2 || a == 1)) && (b != 2 ^ (b == 2 || b == 1)) && (a != 5 ^ (c == 2 || c == 1)) && (c == 1 ^ (d == 1 || d == 2)) && (d != 1 ^ (e == 1 || e == 2)))
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
							a = b = c = d = e = 6;
							}

						}
					}
				}
			}
		}
		return 0;
	}
}
