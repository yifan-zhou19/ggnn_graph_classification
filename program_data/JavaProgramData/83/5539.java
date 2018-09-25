package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] t = new int[MAX];
		int n;
		int i;
		double s;
		double p = 0;
		double[] k = new double[MAX];
		double m = 0;
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
				k[i] = Double.parseDouble(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			m = m + k[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t[i] < 60)
			{
				p = p + 0 * k[i];
			}
			else
			{
				if (t[i] >= 60 && t[i] <= 63)
				{
					  p = p + 1 * k[i];
				}
				else
				{
					if (t[i] >= 64 && t[i] <= 67)
					{
							p = p + 1.5 * k[i];
					}
					else
					{
						if (t[i] >= 68 && t[i] <= 71)
						{
							   p = p + 2 * k[i];
						}
						else
						{
							if (t[i] >= 72 && t[i] <= 74)
							{
								  p = p + 2.3 * k[i];
							}
							else
							{
								if (t[i] >= 75 && t[i] <= 77)
								{
									   p = p + 2.7 * k[i];
								}
								else
								{
									if (t[i] >= 78 && t[i] <= 81)
									{
										   p = p + 3 * k[i];
									}
									else
									{
										if (t[i] >= 82 && t[i] <= 84)
										{
											   p = p + 3.3 * k[i];
										}
										else
										{
											if (t[i] >= 85 && t[i] <= 89)
											{
												   p = p + 3.7 * k[i];
											}
											else
											{
												if (t[i] >= 90 && t[i] <= 100)
												{
														 p = p + 4 * k[i];
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
		s = p / m;
		System.out.printf("%.2lf",s);
		return 0;
		System.out.printf("%lf",m);
		return 0;
	}

}

