package <missing>;

public class GlobalMembers
{
	public static float jd(int s)
	{
		float m;
		if (s >= 90 && s <= 100)
		{
			m = 4.0F;
		}
		else
		{
			if (s >= 85 && s <= 89)
			{
				m = 3.7F;
			}
			else
			{
				if (s >= 82 && s <= 84)
				{
					m = 3.3F;
				}
				else
				{
					if (s >= 78 && s <= 81)
					{
						m = 3.0F;
					}
					else
					{
						if (s >= 75 && s <= 77)
						{
							m = 2.7F;
						}
						else
						{
							if (s >= 72 && s <= 74)
							{
								m = 2.3F;
							}
							else
							{
								if (s >= 68 && s <= 71)
								{
									m = 2.0F;
								}
								else
								{
									if (s >= 64 && s <= 67)
									{
										m = 1.5F;
									}
									else
									{
										if (s >= 60 && s <= 63)
										{
											m = 1.0F;
										}
										else
										{
											if (s < 60)
											{
												m = 0.0F;
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
		return (m);
	}

	public static void Main()
	{
		int i;
		int n;
		int sum = 0;
		float x = 0F;
		int[] xf = new int[10];
		int[] cj = new int[10];
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
			sum = sum + xf[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				cj[i] = Integer.parseInt(tempVar3);
			}
			x = x + xf[i] * jd(cj[i]);
		}

		x = x / sum;
		System.out.printf("%.2f",x);
	}

}

