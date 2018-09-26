package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		int n = 0;
	int m = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		startYear = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		startMonth = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		startDay = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead("\n");
	if (tempVar4 != null)
	{
		endYear = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		endMonth = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		endDay = Integer.parseInt(tempVar6);
	}
	int i;
	for (i = 1;i <= startMonth;i++)
	{
		if (i == 1)
		{
			n = n + 0;
		}
	if (i == 2)
	{
		n = n + 31;
	}
	if (i == 3)
	{
		n = n + 28;
	}
	if (i == 4)
	{
		n = n + 31;
	}
	if (i == 5)
	{
		n = n + 30;
	}
	if (i == 6)
	{
		n = n + 31;
	}
	if (i == 7)
	{
		n = n + 30;
	}
	if (i == 8)
	{
		n = n + 31;
	}
	if (i == 9)
	{
		n = n + 31;
	}
	if (i == 10)
	{
		n = n + 30;
	}
	if (i == 11)
	{
		n = n + 31;
	}
	if (i == 12)
	{
		n = n + 30;
	}
	}
	if (startMonth >= 3 && startMonth >= 3 && startYear % 4 == 0 && startYear % 100 != 0 || startYear % 400 == 0)
	{
	n = n + 1;
	}

	n = n + startDay;

	for (i = startYear;i < endYear;i++)
	{
		if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
		{
	m = m + 366;
		}
	else
	{
		m = m + 365;
	}
	}
	int q;
	for (q = 1;q <= endMonth;q++)
	{
		if (q == 1)
		{
			m = m + 0;
		}
	if (q == 2)
	{
		m = m + 31;
	}
	if (q == 3)
	{
		m = m + 28;
	}
	if (q == 4)
	{
		m = m + 31;
	}
	if (q == 5)
	{
		m = m + 30;
	}
	if (q == 6)
	{
		m = m + 31;
	}
	if (q == 7)
	{
		m = m + 30;
	}
	if (q == 8)
	{
		m = m + 31;
	}
	if (q == 9)
	{
		m = m + 31;
	}
	if (q == 10)
	{
		m = m + 30;
	}
	if (q == 11)
	{
		m = m + 31;
	}
	if (q == 12)
	{
		m = m + 30;
	}
	}
	if (endYear % 4 == 0 && endYear % 100 != 0 || endYear % 400 == 0 && endMonth >= 3)
	{
	m = m + 1;
	}


	m = m + endDay;

	System.out.printf("%d",m - n);
	}

}

