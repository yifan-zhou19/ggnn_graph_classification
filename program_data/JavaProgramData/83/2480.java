package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[11];
		int[] c = new int[11];
		int i;
		int j;
		int k = 0;
		float[] b = new float[11];
		float GPA;
		float m = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			k = k + a[i];
		}
		for (j = 1;j <= n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[j] = Integer.parseInt(tempVar3);
			}
			if (c[j] >= 90)
			{
				b[j] = 4.0F;
			}
			else
			{
				if (c[j] >= 85)
				{
					b[j] = 3.7F;
				}
				else
				{
					if (c[j] >= 82)
					{
						b[j] = 3.3F;
					}
					else
					{
						if (c[j] >= 78)
						{
							b[j] = 3.0F;
						}
						else
						{
							if (c[j] >= 75)
							{
								b[j] = 2.7F;
							}
							else
							{
								if (c[j] >= 72)
								{
									b[j] = 2.3F;
								}
								else
								{
									if (c[j] >= 68)
									{
										b[j] = 2.0F;
									}
									else
									{
										if (c[j] >= 64)
										{
											b[j] = 1.5F;
										}
										else
										{
											if (c[j] >= 60)
											{
												b[j] = 1.0F;
											}
											else
											{
												b[j] = 0F;
											}
										}
									}
								}
							}
						}
					}
				}
			}
											m = m + b[j] * a[j];
		}
		GPA = (float)m / k;
		System.out.printf("%.2lf",GPA);
	}




}

