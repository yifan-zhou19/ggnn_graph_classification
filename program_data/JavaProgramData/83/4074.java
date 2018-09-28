package <missing>;

public class GlobalMembers
{
	//
	//  main.c
	//  Track 43, ????
	//
	//  Created by Charles.thRay.Lee on 9/11/12.
	//  Copyright (c) 2012 Peking University. All rights reserved.
	/*??
	 ?????????????????????GPA?????????????????????????????????
	 ??????????
	 ???? ??
	 90-100 4.0
	 85-89  3.7
	 82-84  3.3
	 78-81  3.0
	 75-77  2.7
	 72-74  2.3
	 68-71  2.0
	 64-67  1.5
	 60-63  1.0
	 60?? 0
	 1??????????=????*????
	 2?????=????????/????????
	 ????????????A??????GPA??
	 ????
	 ??? ?????n?n<10??
	 ??? ????????????????????
	 ??? ??????????
	 ??????????????
	*/


	public static int Main()
	{
		int n;
		int n1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		double[][] a = new double[2][11];
		double gpa = 0;
		double gpa1 = 0;


		for (n1 = 1; n1 <= n; n1++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[0][n1 - 1] = Double.parseDouble(tempVar2);
			}
		}

		for (n1 = 1; n1 <= n; n1++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[1][n1 - 1] = Double.parseDouble(tempVar3);
			}
			if (a[1][n1 - 1] >= 90 && a[1][n1 - 1] <= 100)
			{
				a[1][n1 - 1] = 4.0 * a[0][n1 - 1];
			}
			else
			{
				if (a[1][n1 - 1] >= 85)
				{
					a[1][n1 - 1] = 3.7 * a[0][n1 - 1];
				}
				else
				{
					if (a[1][n1 - 1] >= 82)
					{
						a[1][n1 - 1] = 3.3 * a[0][n1 - 1];
					}
					else
					{
						if (a[1][n1 - 1] >= 78)
						{
							a[1][n1 - 1] = 3.0 * a[0][n1 - 1];
						}
						else
						{
							if (a[1][n1 - 1] >= 75)
							{
								a[1][n1 - 1] = 2.7 * a[0][n1 - 1];
							}
							else
							{
								if (a[1][n1 - 1] >= 72)
								{
									a[1][n1 - 1] = 2.3 * a[0][n1 - 1];
								}
								else
								{
									if (a[1][n1 - 1] >= 68)
									{
										a[1][n1 - 1] = 2.0 * a[0][n1 - 1];
									}
									else
									{
										if (a[1][n1 - 1] >= 64)
										{
											a[1][n1 - 1] = 1.5 * a[0][n1 - 1];
										}
										else
										{
											if (a[1][n1 - 1] >= 60)
											{
												a[1][n1 - 1] = 1.0 * a[0][n1 - 1];
											}
											else
											{
												a[1][n1 - 1] = 0 * a[0][n1 - 1];
											}
										}
									}
								}
							}
						}
					}
				}
			}
			gpa = gpa + a[1][n1 - 1];
			gpa1 = gpa1 + a[0][n1 - 1];
		}
		gpa = gpa / gpa1;
		System.out.printf("%.2lf",gpa);
		return 0;
	}
}

