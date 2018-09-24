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
		for (a = 2; a <= 5; a++)
		{
			for (b = 1; b <= 5; b++)
			{
				if (a != b)
				{
					for (c = 1; c <= 5; c++)
					{
						if ((c != a) && (c != b))
						{
							for (d = 1; d <= 5; d++)
							{
								if ((d != a) && (d != b) && (d != c))
								{
									for (e = 4; e <= 5; e++)
									{
										if ((e != a) && (e != b) && (e != c) && (e != d))
										{
											if (((a == 2) && (e == 1)) || ((a != 2) && (e != 1)))
											{
												if (b != 1)
												{
													if ((((c == 1) || (c == 2)) && a == 5) || ((c != 1) && (c != 2) && (a != 5)))
													{
														if ((d != 1) && ((d != 2 && c == 1) || (d == 2) && (c != 1)))
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
				}
			}
		}
														return 0;
	}
}
