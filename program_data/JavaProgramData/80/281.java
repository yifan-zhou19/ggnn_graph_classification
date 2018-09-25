int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
int spec_year = int;
int main()
{

	void scan(int * year,int * month,int * day);
	int com_year = new int(int y1,int y2);
	int com_month = new int(int y1,int m1,int y2,int m2);
	int com_day = new int(int y1,int m1,int d1,int y2,int m2,int d2);

	int year1;
	int month1;
	int day1;
	int year2;
	int month2;
	int day2;

	int sum = 0;
	int k = 0;

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

	sum += com_year(year1,year2);
	sum += com_month(year1,month1,year2,month2);
	sum += com_day(year1,month1,day1,year2,month2,day2);

	System.out.printf("%d",sum);

	return 0;
}
int com_year(int y1,int y2) //???????????
{
	int i;
	int sum = 0;
	for (i = y1 + 1;i < y2;i++)
	{
		if (spec_year(i))
		{
			sum += 366;
		}
		else
		{
			sum += 365;
		}
	}
	return sum;
}
int com_month(int y1,int m1,int y2,int m2) //???????????
{
	int i;
	int sum = 0;
	if (y1 != y2)
	{
		if (spec_year(y1))
		{
			mon[1] = 29;
		}
		if (m1 != m2)
		{
			for (i = m1;i < 12;i++)
			{
				sum += mon[i];
			}
			mon[1] = 28;

			if (spec_year(y2))
			{
				mon[1] = 29;
			}

			for (i = 0;i < m2 - 1;i++)
			{
				sum += mon[i];
			}
			mon[1] = 28;
		}
		else
		{
			for (i = m1 - 1;i < 12;i++)
			{
				sum += mon[i];
			}
			mon[1] = 28;

			if (spec_year(y2))
			{
				mon[1] = 29;
			}

			for (i = 0;i < m2 - 1;i++)
			{
				sum += mon[i];
			}
			mon[1] = 28;
		}
	}
	else
	{
		if (spec_year(y1))
		{
			mon[1] = 29;
		}
		for (i = m1;i < m2 - 1;i++)
		{
			sum += mon[i];
		}
			mon[1] = 28;
	}
	return sum;
}

int com_day(int y1,int m1,int d1,int y2,int m2,int d2) //?????????
{
	int sum = 0;

	if (m1 != m2)
	{
		if (spec_year(y1))
		{
			mon[1] = 29;
		}

		sum += (mon[m1 - 1] - d1);

		sum += d2;

		mon[1] = 28;
	}
	else
	{
		sum += d2 - d1;

	}

	return sum;
}
int spec_year(int year) //???????
{
	if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}


