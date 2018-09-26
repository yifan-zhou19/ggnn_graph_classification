package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] u = new int[200];
		int[] r = new int[200];
		float[] s = new float[200];
		float k;
		float w;
		float p;
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
				r[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				u[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (u[i] >= 90)
			{
				s[i] = 4.0F;
			}
			else
			{
				if (u[i] >= 85)
				{
					s[i] = 3.7F;
				}
				else
				{
					if (u[i] >= 82)
					{
						s[i] = 3.3F;
					}
					else
					{
						if (u[i] >= 78)
						{
							s[i] = 3.0F;
						}
						else
						{
							if (u[i] >= 75)
							{
								s[i] = 2.7F;
							}
							else
							{
								if (u[i] >= 72)
								{
									s[i] = 2.3F;
								}
								else
								{
									if (u[i] >= 68)
									{
										s[i] = 2.0F;
									}
									else
									{
										if (u[i] >= 64)
										{
											s[i] = 1.5F;
										}
										else
										{
											if (u[i] >= 60)
											{
												s[i] = 1.0F;
											}
											else
											{
												s[i] = 0F;
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
		k = 0F;
		p = 0F;
			for (i = 1;i <= n;i++)
			{
				k = k + s[i] * r[i];
				p = p + r[i];
			}
			w = k / p;
			System.out.printf("%.2f",w);
			return 0;
	}


}

