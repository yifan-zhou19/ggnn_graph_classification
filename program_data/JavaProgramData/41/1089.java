package <missing>;

public class GlobalMembers
{
	public static int[] mat = new int[30000];
	public static int[] s = new int[30000];

	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int a1 = 0;
		int b1 = 0;
		int c1 = 0;
		int d1 = 0;
		int e1 = 0;
		for (a = 1; a < 6; a++)
		{
			for (b = 1; b < 6; b++)
			{
				for (c = 1; c < 6; c++)
				{
					for (d = 1; d < 6; d++)
					{
						for (e = 1; e < 6; e++)
						{
							if (a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e && d != e && e != 2 && e != 3)
							{
								a1 = 0, b1 = 0, c1 = 0, d1 = 0, e1 = 0;
								if (a == 1 || a == 2)
								{
									if (e == 1)
									{
										a1 = 1;
									}
								}
								else
								{
									if (e != 1)
									{
										a1 = 1;
									}
								}



								if (b == 1 || b == 2)
								{
									if (b == 2)
									{
										b1 = 1;
									}
								}
								else
								{
									if (b != 2)
									{
										b1 = 1;
									}
								}



								if (c == 1 || c == 2)
								{
									if (a == 5)
									{
										c1 = 1;
									}
								}
								else
								{
									if (a != 5)
									{
										c1 = 1;
									}
								}



								if (d == 1 || d == 2)
								{
									if (c == 5)
									{
										d1 = 1;
									}
								}
								else
								{
									if (c != 5)
									{
										d1 = 1;
									}
								}


								if (e == 1 || e == 2)
								{
									if (d == 1)
									{
										e1 = 1;
									}
								}
								else
								{
									if (d != 1)
									{
										e1 = 1;
									}
								}

								//cout << a1 << " " << b1 << " " << c1 << " " << d1 << " " << e1 << endl;
								//cout << a << " " << b << " " << c << " " << d << " " << e << endl;

								if (a1 == 1 && b1 == 1 && c1 == 1 && d1 == 1 && e1 == 1)
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
		}

		return 0;
	}


}
