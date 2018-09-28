package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] a = new int[4];
		char[] name = {'z', 'q', 's', 'l'};
		for (z = 1; z <= 5;z++)
		{
			for (q = 1; q <= 5; q++)
			{
				if (q == z)
				{
					continue;
				}
				else
				{
					for (s = 1; s <= 5; s++)
					{
						if (s == z || s == q || z + s >= q)
						{
							continue;
						}
						else
						{
							for (l = 1; l <= 5;l++)
							{
								if (l == z || l == q || l == s || z + q != s + l || z + l <= s + q)
								{
									continue;
								}
								else if (l != z && l != q && l != s && z + q == s + l && z + l > s + q)
								{
									int k;
									int i;
									int t;
									int max = 0;
									char char1;
									a[0] = z;
									a[1] = q;
									a[2] = s;
									a[3] = l;
									for (k = 0;k < 4;k++)
									{
										for (i = 3 - k;i > 0;i--)
										{
											if (a[i - 1] < a[i])
											{
												t = a[i - 1];
												a[i - 1] = a[i];
												a[i] = t;
												char1 = name[i - 1];
												name[i - 1] = name[i];
												name[i] = char1;
											}
										}

									}
									for (k = 0;k < 4;k++)
									{
										System.out.print(name[k]);
										System.out.print(' ');
										System.out.print(a[k] * 10);
										System.out.print("\n");
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
