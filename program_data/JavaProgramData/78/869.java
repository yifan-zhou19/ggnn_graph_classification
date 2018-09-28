package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		int j;
		int k;
		int p;
		int x;
		for (i = 1;i <= 5;i++)
		{
			z = i;
			for (j = 1;j <= 5;j++)
			{
				if (j == i)
				{
					continue;
				}
				else
				{
					q = j;
					for (k = 1;k <= 5;k++)
					{
						if (k == i || k == j)
						{
							continue;
						}
						else
						{
							s = k;
							for (p = 1;p <= 5;p++)
							{
								if (p == i || p == j || p == k)
								{
									continue;
								}
								else
								{
									l = p;
									if (z + q == s + l && z + l > s + q && z + s < q)
									{
										for (x = 5;x >= 1;x--)
										{
											if (z == x)
											{
												System.out.print('z');
												System.out.print(' ');
												System.out.print(10 * x);
												System.out.print("\n");
											}
											if (q == x)
											{
												System.out.print('q');
												System.out.print(' ');
												System.out.print(10 * x);
												System.out.print("\n");
											}
											if (s == x)
											{
												System.out.print('s');
												System.out.print(' ');
												System.out.print(10 * x);
												System.out.print("\n");
											}
											if (l == x)
											{
												System.out.print('l');
												System.out.print(' ');
												System.out.print(10 * x);
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
