package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double GPA;
		double[] xf = new double[100];
		double[] cj = new double[100];
		double[] jd = new double[100];
		double[] s = new double[100];
		double p = 0;
		double sumxf = 0;
		double sumjd = 0;
		int i = 0;
		int j = 0;
		int n;
		double t;
		double[] a = new double[100];
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
			xf[i] = Double.parseDouble(tempVar2);
		}
		sumxf = sumxf + xf[i];

		}

		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			cj[i] = Double.parseDouble(tempVar3);
		}
		t = cj[i];
		if (t >= 90)
		{
			jd[i] = 4.0;
		}
		else
		{
				if (t >= 85)
				{
				jd[i] = 3.7;
				}
			else
			{
					if (t >= 82)
					{
					jd[i] = 3.3;
					}
				else
				{
					if (t >= 78)
					{
					jd[i] = 3.0;
					}
				else
				{
						if (t >= 75)
						{
						jd[i] = 2.7;
						}
					else
					{
							if (t >= 72)
							{
							jd[i] = 2.3;
							}
						else
						{
								if (t >= 68)
								{
								jd[i] = 2.0;
								}
							else
							{
								if (t >= 64)
								{
								jd[i] = 1.5;
								}
							else
							{
									if (t >= 60)
									{
									jd[i] = 1;
									}
								else
								{
									jd[i] = 0;
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
		s[i] = xf[i] * jd[i];
		p = p + s[i];
		}
		GPA = p / sumxf;

		System.out.printf("%.2lf",GPA);



	return 0;

	}




}

