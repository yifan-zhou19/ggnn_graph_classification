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
	int[] p = new int[6];
	for (a = 1;a <= 5;a++)
	{
		for (b = 1;b <= 5;b++)
		{
			if (a == b || b == 5)
			{
				continue;
			}
			for (c = 1;c <= 5;c++)
			{
				if (a == c || b == c || c == 5)
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
						if (e == a || e == b || e == c || e == d)
						{
							continue;
						}
						{
							p[1] = (a == 5);
							p[2] = (b == 2);
							p[3] = (e == 1);
							p[4] = (a != 3);
							p[5] = (a == 4);
							if (p[a] == 1 && p[b] == 1 && p[c] == 0 && p[d] == 0 && p[e] == 0)
							{
								if (a == 1)
								{
									System.out.print("1 ");
								}
								if (b == 1)
								{
									System.out.print("2 ");
								}
								if (c == 1)
								{
									System.out.print("3 ");
								}
								if (d == 1)
								{
									System.out.print("4 ");
								}
								if (e == 1)
								{
									System.out.print("5 ");
								}
								if (a == 2)
								{
									System.out.print("1 ");
								}
								if (b == 2)
								{
									System.out.print("2 ");
								}
								if (c == 2)
								{
									System.out.print("3 ");
								}
								if (d == 2)
								{
									System.out.print("4 ");
								}
								if (e == 2)
								{
									System.out.print("5 ");
								}
								if (a == 3)
								{
									System.out.print("1 ");
								}
								if (b == 3)
								{
									System.out.print("2 ");
								}
								if (c == 3)
								{
									System.out.print("3 ");
								}
								if (d == 3)
								{
									System.out.print("4 ");
								}
								if (e == 3)
								{
									System.out.print("5 ");
								}
								if (a == 4)
								{
									System.out.print("1 ");
								}
								if (b == 4)
								{
									System.out.print("2 ");
								}
								if (c == 4)
								{
									System.out.print("3 ");
								}
								if (d == 4)
								{
									System.out.print("4 ");
								}
								if (e == 4)
								{
									System.out.print("5 ");
								}
								if (a == 5)
								{
									System.out.print("1");
								}
								if (b == 5)
								{
									System.out.print("2");
								}
								if (c == 5)
								{
									System.out.print("3");
								}
								if (d == 5)
								{
									System.out.print("4");
								}
								if (e == 5)
								{
									System.out.print("5");
								}
								return 0;
							}
					}
					}
				}
			}
		}
	}
	}

}
