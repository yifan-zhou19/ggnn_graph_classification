package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int startyear;
		int startmonth;
		int startday;
		int endyear;
		int endmonth;
		int endday;
		int[] m = new int[13];
		int[] y = new int[3001];
		int i;
		int j;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startyear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			startmonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			startday = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			endyear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			endmonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			endday = Integer.parseInt(tempVar6);
		}
		for (i = 1;i <= 12;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || 1 == 8 || i == 10 || i == 12)
			{
				m[i] = 31;
			}
			else if (i != 2)
			{
				m[i] = 30;
			}
			else if (i == 2 && (((endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0)) || ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))))
			{
				m[i] = 29;
			}
			else
			{
				m[i] = 28;
			}
		}
		for (i = 1;i <= 3000;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				y[i] = 366;
			}
			else
			{
				y[i] = 365;
			}
		}
		if (endyear == startyear)
		{
			if (endmonth != startmonth)
			{
				for (i = startmonth + 1,k = m[startmonth] - startday + endday + 1;i <= endmonth - 1;i++)
				{
					k = k + m[i];
				}
			}
			else
			{
				k = endday - startday;
			}
		}
		else if ((startmonth <= 2) && ((endmonth>2) || (endmonth == 2 && endday == 29)))
		{
			for (i = startmonth + 1,k = m[startmonth] - startday + endday + 1;i <= 12;i++)
			{
				k = k + m[i];
			}
			for (j = endmonth - 1;j >= 1;j--)
			{
				k = k + m[j];
			}
			for (i = startyear + 1;i <= endyear - 1;i++)
			{
				k = k + y[i];
			}
		}
		else if (startyear != endyear && startmonth == endmonth && startday == endday)
		{
			for (i = startyear,k = 0;i < endyear;i++)
			{
				k = k + y[i];
			}
		}
		else
		{
			for (i = startmonth + 1,k = m[startmonth] - startday + endday;i <= 12;i++)
			{
				k = k + m[i];
			}
			for (j = endmonth - 1;j >= 1;j--)
			{
				k = k + m[j];
			}
			for (i = startyear + 1;i <= endyear - 1;i++)
			{
				k = k + y[i];
			}
		}
		System.out.printf("%d",k);
		return 0;
	}
}

