package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] w = new int[6];
		String r = new String(new char[6]);
		int a;
		int b;
		int c;
		int d;
		int e;
		int i;
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
					if (c == a || c == b)
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
							if (e == a || e == b || e == c || e == d || e == 2 || e == 3)
							{
								continue;
							}
							w[a] = (e == 1);
							w[b] = (b == 2);
							w[c] = (a == 5);
							w[d] = (c != 1);
							w[e] = (d == 1);
							if (w[1] == 1 && w[2] == 1 && w[3] == 0 && w[4] == 0 && w[5] == 0)
							{
								r = tangible.StringFunctions.changeCharacter(r, a, 'A');
								r = tangible.StringFunctions.changeCharacter(r, b, 'B');
								r = tangible.StringFunctions.changeCharacter(r, c, 'C');
								r = tangible.StringFunctions.changeCharacter(r, d, 'D');
								r = tangible.StringFunctions.changeCharacter(r, e, 'E');
								System.out.print(a);
								System.out.print(" ");
								System.out.print(b);
								System.out.print(" ");
								System.out.print(c);
								System.out.print(" ");
								System.out.print(d);
								System.out.print(" ");
								System.out.print(e);

							}
						}
					}
				}
			}
		}

		return 0;
	}
}

