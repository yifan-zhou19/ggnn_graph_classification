package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int sum = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int p = 0;
		int[] y = new int[6];
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				if (b != a)
				{
					for (c = 1;c <= 5;c++)
					{
						if (c != a && c != b)
						{
							for (d = 1;d <= 5;d++)
							{
								if (d != a && d != b && d != c)
								{
									for (e = 1;e <= 5;e++)
									{
										if (e != a && e != b && e != c && e != d)
										{
											sum = 0;
											y[a] = (e == 1);
											y[b] = (b == 2);
											y[c] = (a == 5);
											y[d] = (c != 1);
											y[e] = (d == 1);
											if (y[a] + y[b] + y[c] + y[d] + y[e] == 2 && e != 2 && e != 3)
											{
												for (i = 1;i <= 5;i++)
												{
													if (y[i] == 1)
													{
													sum = sum + i;
													}
												}
												if (sum == 3)
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
													break;

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
