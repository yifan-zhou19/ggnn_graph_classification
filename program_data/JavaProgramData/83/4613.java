package <missing>;

public class GlobalMembers
{
	public static float jd(int kccj)
	{
		float kcjd;
		if (kccj >= 90)
		{
			kcjd = 4F;
		}
		else
		{
			if (85 <= kccj != 0 && kccj <= 89)
			{
				kcjd = 3.7F;
			}
			else
			{
				if (82 <= kccj != 0 && kccj <= 84)
				{
					kcjd = 3.3F;
				}
				else
				{
					if (kccj >= 78 && kccj <= 81)
					{
						kcjd = 3.0F;
					}
					else
					{
						if (kccj >= 75 && kccj <= 77)
						{
							kcjd = 2.7F;
						}
						else
						{
							if (kccj >= 72 && kccj <= 74)
							{
								kcjd = 2.3F;
							}
							else
							{
								if (kccj <= 71 && kccj >= 68)
								{
									kcjd = 2.0F;
								}
								else
								{
									if (kccj <= 67 && kccj >= 64)
									{
										kcjd = 1.5F;
									}
									else
									{
										if (kccj <= 63 && kccj >= 60)
										{
											kcjd = 1.0F;
										}
										else
										{
											kcjd = 0F;
										}
									}
								}
							}
						}
					}
				}
			}
		}

	return kcjd;
	}

	public static int Main()
	{
		int n;

		int[] xf = new int[10];
		int i;
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
				xf[i] = Integer.parseInt(tempVar2);
			}
		}
		int[] cj = new int[10];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				cj[i] = Integer.parseInt(tempVar3);
			}
		}
		int sum_xf = 0;
		for (i = 0;i < n;i++)
		{
			sum_xf += xf[i];
		}
		float[] xfjd = new float[10];
		for (i = 0;i < n;i++)
		{
			xfjd[i] = xf[i] * jd(cj[i]);
		}
		float sum_xfjd = 0F;
		for (i = 0;i < n;i++)
		{
			sum_xfjd += xfjd[i];
		}
		float gpa;
		gpa = sum_xfjd / sum_xf;
		System.out.printf("%.2f",gpa);

		return 0;
	}

}

