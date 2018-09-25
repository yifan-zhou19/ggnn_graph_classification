package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[13];
		int n;
		int i;
		int m;
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		a[0] = 0;
		a[1] = 1;
		a[2] = -2;
		a[3] = 1;
		a[4] = 0;
		a[5] = 1;
		a[6] = 0;
		a[7] = 1;
		a[8] = 1;
		a[9] = 0;
		a[10] = 1;
		a[11] = 0;
		a[12] = 1;
		m = 0;
		n = 0;
			if (year1 == year2)
			{
				if (month1 == month2)
				{
					n = day2 - day1;
				}
				else
				{
					for (i = month1;i < month2;i++)
					{
						m = m + a[i];
						if (year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0)
						{
							m = m + 1;
						}
						n = (month2 - month1 - 1) * 30 + day2 + 30 - day1 + m;
					}
				}
			}
			else
			{
				m = 30 + a[month1] - day1;
				for (i = month1 + 1;i <= 12;i++)
				{
					m = m + 30 + a[i];
				}
				m = m + day2;
				for (i = 1;i < month2;i++)
				{
					m = m + 30 + a[i];
				}
				if ((year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0) && month1 <= 2)
				{
					m = m + 1;
				}
				if ((year2 % 4 == 0 && year2 % 100 != 0 || year2 % 400 == 0) && month2 > 2)
				{
					m = m + 1;
				}
				for (i = year1 + 1;i < year2;i++)
				{
					if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
					{
						n = n + 366;
					}
					else
					{
						n = n + 365;
					}

				}
				n = n + m;
			}
			System.out.printf("%d\n",n);
			return 0;
	}













}

