package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] xf = new int[n - 1];
		int[] cj = new int[n - 1];
		double[] jd = new double[n - 1];
		double GPA;
		double z = 0;
		for (int i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					xf[i] = Integer.parseInt(tempVar2);
				}
			}
			else
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					xf[i] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				cj[i] = Integer.parseInt(tempVar4);
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (cj[i] <= 100 && cj[i] >= 90)
			{
				jd[i] = 4.0;
			}
			else
			{
				if (cj[i] <= 89 && cj[i] >= 85)
				{
					jd[i] = 3.7;
				}
				else
				{
					if (cj[i] <= 84 && cj[i] >= 82)
					{
						jd[i] = 3.3;
					}
					else
					{
						if (cj[i] <= 81 && cj[i] >= 78)
						{
							jd[i] = 3.0;
						}
						else
						{
							if (cj[i] <= 77 && cj[i] >= 75)
							{
								jd[i] = 2.7;
							}
							else
							{
								if (cj[i] <= 74 && cj[i] >= 72)
								{
									jd[i] = 2.3;
								}
								else
								{
									if (cj[i] <= 71 && cj[i] >= 68)
									{
										jd[i] = 2.0;
									}
									else
									{
										if (cj[i] <= 67 && cj[i] >= 64)
										{
											jd[i] = 1.5;
										}
										else
										{
											if (cj[i] <= 63 && cj[i] >= 60)
											{
												jd[i] = 1.0;
											}
											else
											{
												jd[i] = 0.0;
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
		for (int i = 0;i < n;i++)
		{
			z += xf[i] * jd[i];
		}
		for (int i = 0;i < n;i++)
		{
			a += xf[i];
		}
		GPA = z / a;
		System.out.printf("%.2lf",GPA);
		return 0;
	}


}

