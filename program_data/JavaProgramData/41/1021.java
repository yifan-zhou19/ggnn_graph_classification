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
		int[] x = new int[6];
		int i;
		int t = 0;
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				if (b == a)
				{
					continue;
				}
				else
				{
					for (c = 1;c <= 5;c++)
					{
						if (c == b || c == a)
						{
							continue;
						}
						else
						{
							for (d = 1;d <= 5;d++)
							{
								if (d == a || d == b || d == c)
								{
									continue;
								}
								else
								{
									for (e = 1;e <= 5;e++)
									{
										if (e == a || e == b || e == c || e == d || e == 2 || e == 3)
										{
											continue;
										}
									else
									{
										x[1] = (e == 1);
										x[2] = (b == 2);
										x[3] = (a == 5);
										x[4] = (c != 1);
										x[5] = (d == 1);
										if (a == 1 && x[1] == 1 || a == 2 && x[1] == 1)
										{
											t += 1;
										}
										if (b == 1 && x[2] == 1 || b == 2 && x[2] == 1)
										{
											t += 1;
										}
										if (c == 1 && x[3] == 1 || c == 2 && x[3] == 1)
										{
											t += 1;
										}
										if (d == 1 && x[4] == 1 || d == 2 && x[4] == 1)
										{
											t += 1;
										}
										if (e == 1 && x[5] == 1 || e == 2 && x[5] == 1)
										{
											t += 1;
										}
										if (t == 2)
										{
											if (x[1] + x[2] + x[3] + x[4] + x[5] == 2)
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
												return 0;
											}
											else
											{
												t = 0;

												continue;
											}
										}
										if (t != 2)
										{
											t = 0;
											continue;
										}
									}
									}
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
