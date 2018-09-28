package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int c;
		double d;
		double e;
		double[] b = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (b[i] >= 90)
			{
				b[i] = 4.0;
			}
				else
				{
					if (b[i] >= 85)
					{
						b[i] = 3.7;
					}
					else
					{
						if (b[i] >= 82)
						{
							b[i] = 3.3;
						}
						else
						{
							if (b[i] >= 78)
							{
								b[i] = 3.0;
							}
							else
							{
								if (b[i] >= 75)
								{
									b[i] = 2.7;
								}
								else
								{
									if (b[i] >= 72)
									{
										b[i] = 2.3;
									}
									else
									{
										if (b[i] >= 68)
										{
											b[i] = 2.0;
										}
										else
										{
											if (b[i] >= 64)
											{
												b[i] = 1.5;
											}
											else
											{
												if (b[i] >= 60)
												{
													b[i] = 1.0;
												}
												else
												{
													b[i] = 0;
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
		for (i = 0;i <= n - 1;i++)
		{
			b[i] = a[i] * b[i];
		}
		for (i = 0,c = 0;i <= n - 1;i++)
		{
			c = c + a[i];
		}
		for (i = 0,d = 0;i <= n - 1;i++)
		{
			d = d + b[i];
		}
		e = d / c;
		System.out.printf("%.2lf\n",e);
		return 0;
	}



}

