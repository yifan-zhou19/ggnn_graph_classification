int[] g1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
int[] g2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
int Counting = new int(int,int,int);
int IsLeapYear = int;
void main()
{
	int y1;
	int m1;
	int d1;
	int y2;
	int m2;
	int d2;
	int sum = 0;
	int i;
	int b1;
	int b2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		y1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m1 = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		d1 = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead("\n");
	if (tempVar4 != null)
	{
		y2 = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		m2 = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		d2 = Integer.parseInt(tempVar6);
	}
	for (i = y1;i < y2;i++)
	{
		if (IsLeapYear(i) == 1)
		{
			sum += 366;
		}
		else
		{
			sum += 365;
		}
	}
	b1 = Counting(m1,d1,IsLeapYear(y1));
	b2 = Counting(m2,d2,IsLeapYear(y2));
	System.out.printf("%d",sum + b2 - b1);
	return;

}



int IsLeapYear(int year)
{
	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	{
		return 1;
	}
	return 0;
}

int Counting(int month, int date, int leapYear)
{
	int count = 0;
	int i;
	if (leapYear == 1)
	{
		for (i = 1;i < month;i++)
		{
			count += g2[i];
		}
	}
	else
	{
		for (i = 1;i < month;i++)
		{
			count += g1[i];
		}
	}
	count += date;
	return count;
}


