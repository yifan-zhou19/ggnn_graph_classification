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
		int n;
		int t;
		for (i = 1; i <= 5; i++)
		{
			z = i;
			for (j = 1; j <= 5; j++)
			{
				q = j;
				if (q != z)
				{
					for (k = 1 ; k <= 5; k++)
					{
						s = k;
						if (s != q && s != z)
						{
							for (n = 1; n <= 5; n++)
							{
								l = n;
								if (l != z && l != q && l != s)
								{
									if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q)
									{
										z = z * 10;
										q = q * 10;
										s = s * 10;
										l = l * 10;
										for (t = 50; t >= 0; t = t - 10)
										{
											if (z == t)
											{
												System.out.print("z ");
												System.out.print(z);
												System.out.print("\n");
											}
											if (q == t)
											{
												System.out.print("q ");
												System.out.print(q);
												System.out.print("\n");
											}
											if (s == t)
											{
												System.out.print("s ");
												System.out.print(s);
												System.out.print("\n");
											}
											if (l == t)
											{
												System.out.print("l ");
												System.out.print(l);
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
