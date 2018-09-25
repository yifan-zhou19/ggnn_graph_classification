package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x = 0;
		int[] sz = new int[100];
		int[] sa = new int[100];
		double g = 0.0;
		double G;
		double[] sb = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sa[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sa[i] > 89)
			{
				sb[i] = 4.0;
			}
				else
				{
					if (sa[i] > 84)
					{
						sb[i] = 3.7;
					}
					else
					{
						if (sa[i] > 81)
						{
							sb[i] = 3.3;
						}
						else
						{
							if (sa[i] > 77)
							{
								sb[i] = 3.0;
							}
							else
							{
								if (sa[i] > 74)
								{
									sb[i] = 2.7;
								}
								else
								{
									if (sa[i] > 71)
									{
										sb[i] = 2.3;
									}
									else
									{
										if (sa[i] > 67)
										{
											sb[i] = 2.0;
										}
										else
										{
											if (sa[i] > 63)
											{
												sb[i] = 1.5;
											}
											else
											{
												if (sa[i] > 59)
												{
													sb[i] = 1.0;
												}
													else
													{
														sb[i] = 0;
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
		for (i = 0;i < n;i++)
		{
			g = g + (sz[i]) * (sb[i]);
			x = x + sz[i];
		}
		 G = g / x;
		 System.out.printf("%.2lf",G);
		return 0;
	}
}

