package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		z = 10;
		int a;
		int b;
		int c;
		int d;
		char x1;
		char x2;
		char x3;
		char x4;
		int y1;
		int y2;
		int y3;
		int y4;
		for (a = 10; a <= 50 ; a = a + 10)
		{
			q = 10;
			for (b = 10; b <= 50;b = b + 10)
			{
				s = 10;
				for (c = 10; c <= 50; c = c + 10)
				{
					l = 10;
					for (d = 10; d <= 50; d = d + 10)
					{
						if (z != q && q != s && s != l && z + q == s + l && z + l > s + q && z + s < q)
						{
							y1 = z;
							x1 = 'z';
							if (y1 < q)
							{
								y2 = q;
								x2 = 'q';
							}
							else
							{
								y1 = q;
								x1 = 'q';
								y2 = z;
								x2 = 'z';
							}
							if (y2 < s)
							{
								y3 = s;
								x3 = 's';
							}
							else
							{
								if (s > y1)
								{
									y3 = y2;
									x3 = x2;
									y2 = s;
									x2 = 's';
								}
								else
								{
									y3 = y2;
									x3 = x2;
									y2 = y1;
									x2 = x1;
									y1 = s;
									x1 = 's';
								}

							}
							if (y3 < l)
							{
								y4 = l;
								x4 = 'l';
							}
							else
							{
								y4 = y3;
								x4 = x3;
								if (l > y2)
								{
									y3 = l;
									x3 = 'l';
								}
								else
								{
									y3 = y2;
									x3 = x2;
									if (l > y1)
									{
										y2 = l;
										x2 = 'l';
									}
									else
									{
										y2 = y1;
										x2 = x1;
										y1 = l;
										x1 = 'l';
									}
								}

							}
							System.out.print(x4);
							System.out.print(" ");
							System.out.print(y4);
							System.out.print("\n");
							System.out.print(x3);
							System.out.print(" ");
							System.out.print(y3);
							System.out.print("\n");
							System.out.print(x2);
							System.out.print(" ");
							System.out.print(y2);
							System.out.print("\n");
							System.out.print(x1);
							System.out.print(" ");
							System.out.print(y1);
							System.out.print("\n");
							break;
						}
						else
						{
							l = l + 10;
						}
					}
					s = s + 10;
				}
				q = q + 10;
			}
			z = z + 10;
		}
		return 0;
	}
}
