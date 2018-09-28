package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int n;
		int i;
		int[] b = new int[1000];
		double[] c = new double[1000];
		double e;
		double x = 0;
		double y = 0;
		double z;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			c[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 90)
			{
				c[i] = 4.0;
			}
			else
			{
				if (b[i] < 90 && b[i] >= 85)
				{
					c[i] = 3.7;
				}
				else
				{
					if (b[i] < 85 && b[i] >= 82)
					{
						c[i] = 3.3;
					}
					else
					{
						if (b[i] < 82 && b[i] >= 78)
						{
							c[i] = 3.0;
						}
						else
						{
							if (b[i] < 78 && b[i] >= 75)
							{
								c[i] = 2.7;
							}
							else
							{
								if (b[i] < 75 && b[i] >= 72)
								{
									c[i] = 2.3;
								}
								else
								{
									if (b[i] < 72 && b[i] >= 68)
									{
										c[i] = 2.0;
									}
									else
									{
										if (b[i] < 68 && b[i] >= 64)
										{
											c[i] = 1.5;
										}
										else
										{
											if (b[i] < 64 && b[i] >= 60)
											{
												c[i] = 1.0;
											}
											else
											{
												if (b[i] < 60)
												{
													c[i] = 0;
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
		for (i = 0;i < n;i++)
		{
			e = c[i] * a[i];
			x += e;
			y += a[i];
		}
		z = x / y;
		System.out.printf("%.2lf\n",z);
		return 0;
	}
}

