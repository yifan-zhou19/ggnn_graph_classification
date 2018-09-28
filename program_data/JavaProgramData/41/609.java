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
		int[] word = new int[6];
		int[] rank = new int[6];
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
							if (e == 2 || e == 3 || e == a || e == b || e == c || e == d)
							{
								continue;
							}
							word[a] = (e == 1);
							word[b] = (b == 2);
							word[c] = (a == 5);
							word[d] = (c != 1);
							word[e] = (d == 1);
							if (word[1] == 1 && word[2] == 1 && word[3] == 0 && word[4] == 0 && word[5] == 0)
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
							}
						}
					}
				}
			}
		}

			return 0;
	}
}
