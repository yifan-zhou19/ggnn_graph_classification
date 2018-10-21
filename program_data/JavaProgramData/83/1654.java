package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		double m;
		double s = 0.0;
		double GPA;
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
			if (b[i] >= 90)
			{
				m = 4.0;
			}
			else if (b[i] >= 85)
			{
				m = 3.7;
			}
				else if (b[i] >= 82)
				{
						m = 3.3;
				}
					else if (b[i] >= 78)
					{
							m = 3.0;
					}
						else if (b[i] >= 75)
						{
							 m = 2.7;
						}
							else if (b[i] >= 72)
							{
								m = 2.3;
							}
								else if (b[i] >= 68)
								{
									 m = 2.0;
								}
									else if (b[i] >= 64)
									{
										 m = 1.5;
									}
										else if (b[i] >= 60)
										{
												m = 1.0;
										}
											else
											{
												m = 0.0;
											}
			s = s + a[i] * m;
			k = k + a[i];
		}
		GPA = s / k;
		System.out.printf("%.2f",GPA);
	}
}

