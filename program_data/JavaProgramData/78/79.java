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
		int r;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				if (j == i)
				{
					continue;
				}
				else
				{
					for (k = 1;k <= 5;k++)
					{
						if (k == j || k == i)
						{
							continue;
						}
						else
						{
							for (r = 1;r <= 5;r++)
							{
								if (r == k || r == j || r == i)
								{
									continue;
								}
								else
								{
									z = 10 * i;
									q = 10 * j;
									s = 10 * k;
									l = 10 * r;
									if (z + q == s + l && z + l > s + q && z + s < q)
									{
										if (i == 5)
										{
											System.out.print("z 50\n");
										}
										if (j == 5)
										{
											System.out.print("q 50\n");
										}
										if (k == 5)
										{
											System.out.print("s 50\n");
										}
										if (r == 5)
										{
											System.out.print("l 50\n");
										}
										if (i == 4)
										{
											System.out.print("z 40\n");
										}
										if (j == 4)
										{
											System.out.print("q 40\n");
										}
										if (k == 4)
										{
											System.out.print("s 40\n");
										}
										if (r == 4)
										{
											System.out.print("l 40\n");
										}
										if (i == 3)
										{
											System.out.print("z 30\n");
										}
										if (j == 3)
										{
											System.out.print("q 30\n");
										}
										if (k == 3)
										{
											System.out.print("s 30\n");
										}
										if (r == 3)
										{
											System.out.print("l 30\n");
										}
										if (i == 2)
										{
											System.out.print("z 20\n");
										}
										if (j == 2)
										{
											System.out.print("q 20\n");
										}
										if (k == 2)
										{
											System.out.print("s 20\n");
										}
										if (r == 2)
										{
											System.out.print("l 20\n");
										}
										if (i == 1)
										{
											System.out.print("z 10\n");
										}
										if (j == 1)
										{
											System.out.print("q 10\n");
										}
										if (k == 1)
										{
											System.out.print("s 10\n");
										}
										if (r == 1)
										{
											System.out.print("l 10\n");
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
