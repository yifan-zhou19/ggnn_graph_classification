package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[10];
		int[] score = new int[10];
		int k;
		int i;
		int m;
		double[] jd = new double[10];
		double a;
		double sum;
		m = 0;
		sum = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			m += n[i];
		}
		i = 0;
		while (i < k)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score[i] = Integer.parseInt(tempVar3);
			}
			if (score[i] >= 90)
			{
				jd[i] = 4.0;
			}
			else
			{
				if ((score[i] >= 85) && (score[i] < 90))
				{
					jd[i] = 3.7;
				}
				else
				{
					if ((score[i] >= 82) && (score[i] < 85))
					{
						jd[i] = 3.3;
					}
					else
					{
						if ((score[i] >= 78) && (score[i] < 82))
						{
							jd[i] = 3.0;
						}
						else
						{
							if ((score[i] >= 75) && (score[i] < 78))
							{
								jd[i] = 2.7;
							}
							else
							{
								if ((score[i] >= 72) && (score[i] < 75))
								{
									jd[i] = 2.3;
								}
								else
								{
									if ((score[i] >= 68) && (score[i] < 72))
									{
										jd[i] = 2.0;
									}
									else
									{
										if ((score[i] >= 64) && (score[i] < 68))
										{
											jd[i] = 1.5;
										}
										else
										{
											if ((score[i] >= 60) && (score[i] < 64))
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
			sum += (jd[i]) * (n[i]);
			i++;
		}
		a = sum / ((double)(m));
		System.out.printf("%.2lf",a);
		return 0;
	}
}

