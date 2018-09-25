package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		int sum1 = 0;
		double gpa;
		double sum2 = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum1 += a[i];
		}
		for (int j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Integer.parseInt(tempVar3);
			}
			if (90 <= b[j] != 0 && b[j] <= 100)
			{
				sum2 += a[j] * 4.0;
			}
			else
			{
				if (85 <= b[j] != 0 && b[j] <= 89)
				{
					sum2 += a[j] * 3.7;
				}
				else
				{
					if (82 <= b[j] != 0 && b[j] <= 84)
					{
						sum2 += a[j] * 3.3;
					}
					else
					{
						if (78 <= b[j] != 0 && b[j] <= 81)
						{
							sum2 += a[j] * 3.0;
						}
						else
						{
							if (75 <= b[j] != 0 && b[j] <= 77)
							{
								sum2 += a[j] * 2.7;
							}
							else
							{
								if (72 <= b[j] != 0 && b[j] <= 74)
								{
									sum2 += a[j] * 2.3;
								}
								else
								{
									if (68 <= b[j] != 0 && b[j] <= 71)
									{
										sum2 += a[j] * 2.0;
									}
									else
									{
										if (64 <= b[j] != 0 && b[j] <= 67)
										{
											sum2 += a[j] * 1.5;
										}
										else
										{
											if (60 <= b[j] != 0 && b[j] <= 63)
											{
												sum2 += a[j] * 1.0;
											}
											else
											{
												sum2 = sum2;
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





		gpa = sum2 / sum1;
		System.out.printf("%.2lf",gpa);
		return 0;
	}

}

