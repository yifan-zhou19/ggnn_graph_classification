package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 10;z <= 50;z += 10)
		{
			for (q = 10;q <= 50;q += 10)
			{
				if (q == z)
				{
					continue;
				}
				else
				{
					for (s = 10;s <= 50;s += 10)
					{
						if (s == z || s == q)
						{
							continue;
						}
						else
						{
							for (l = 10;l <= 50;l += 10)
							{
								if (l == z || l == q || l == s)
								{
									continue;
								}
								else
								{
									if ((z + q == s + l) && (z + l > s + q) && (q > z + s))
									{
										for (int j = 50;j >= 10;j -= 10)
										{
											if (z == j)
											{
												System.out.print('z');
												System.out.print(' ');
												System.out.print(j);
												System.out.print("\n");
											}
											else if (q == j)
											{
												System.out.print('q');
												System.out.print(' ');
												System.out.print(j);
												System.out.print("\n");
											}
											else if (s == j)
											{
												System.out.print('s');
												System.out.print(' ');
												System.out.print(j);
												System.out.print("\n");
											}
											else if (l == j)
											{
												System.out.print('l');
												System.out.print(' ');
												System.out.print(j);
												System.out.print("\n");
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
