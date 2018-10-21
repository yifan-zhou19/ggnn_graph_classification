package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		double p;
		double j;
		double s;
		s = 0;
		k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] xf = new int[100];
		int[] df = new int[100];
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xf[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				df[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (df[i] >= 90 && df[i] <= 100)
			{
				j = 4.0;
			}
				else if (df[i] >= 85 && df[i] <= 89)
				{
					j = 3.7;
				}
					else if (df[i] >= 82 && df[i] <= 84)
					{
						j = 3.3;
					}
						else if (df[i] >= 78 && df[i] <= 81)
						{
							j = 3.0;
						}
							else if (df[i] >= 75 && df[i] <= 77)
							{
								j = 2.7;
							}
								else if (df[i] >= 72 && df[i] <= 74)
								{
									j = 2.3;
								}
									else if (df[i] >= 68 && df[i] <= 71)
									{
										j = 2.0;
									}
										else if (df[i] >= 64 && df[i] <= 71)
										{
											j = 1.5;
										}
											else if (df[i] >= 60 && df[i] <= 63)
											{
												j = 1.0;
											}
												else if (df[i] < 60)
												{
													j = 0;
												}
		s = s + j * xf[i];
		k = k + xf[i];
		}
		p = (double)s / k;
		System.out.printf("%.2lf", p);
		return 0;
	}

}

