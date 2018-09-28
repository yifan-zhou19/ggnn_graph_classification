int dijitian = new int(int,int,int);
int isrunnian = int;

int main(int argc, char * argv[])
{
	int year1;
	int year2;
	int month1;
	int month2;
	int day1;
	int day2;
	int sum = 0;
	int i;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		year1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		month1 = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		day1 = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		year2 = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		month2 = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		day2 = Integer.parseInt(tempVar6);
	}

	if (year1 != year2)
	{
		if (isrunnian(year1) == 1)
		{
			sum = 366 - dijitian(year1,month1,day1);
		}
		else
		{
			sum = 365 - dijitian(year1,month1,day1);
		}

		for (i = year1 + 1;i < year2;i++)
		{
			if (isrunnian(i) == 1)
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		sum += dijitian(year2,month2,day2);
	}
	else
	{
		sum = dijitian(year2,month2,day2) - dijitian(year1,month1,day1);
	}

	System.out.printf("%d",sum);

	return 0;
}

int dijitian(int year,int month,int day)
{

	int sum = 0;
	int i;

	for (i = 1;i < month;i++)
	{
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		{
			sum += 31;
		}
		if (i == 4 || i == 6 || i == 9 || i == 11)
		{
			sum += 30;
		}
		if (i == 2)
		{
			if (isrunnian(year) == 1)
			{
				sum += 29;
			}
			else
			{
				sum += 28;
			}
		}
	}

	sum += day;

	return sum;

}

int isrunnian(int year)
{
	if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}





