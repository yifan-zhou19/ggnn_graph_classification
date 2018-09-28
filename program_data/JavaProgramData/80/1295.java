int judge = int;
int main()
{
	int[] mon1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] mon2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int year1;
	int year2;
	int month1;
	int month2;
	int day1;
	int day2;
	int i;
	int j;
	int sum = 0;
	year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = year1; i < year2; i++)
	{
		if (judge(i))
		{
			sum += 366;
		}
		else
		{
			sum += 365;
		}
	}
		if (judge(year2))
		{
			for (j = 1; j < month2; j++)
			{
				sum += mon2[j];
			}
		}
		else
		{
			for (j = 1; j < month2; j++)
			{
				sum += mon1[j];
			}
		}
		sum += day2;
		if (judge(year1))
		{
			for (j = 1; j < month1; j++)
			{
				sum -= mon2[j];
			}
			sum -= day1;
		}
		else
		{
			for (j = 1; j < month1; j++)
			{
				sum -= mon1[j];
			}
			sum -= day1;
		}
		System.out.print(sum);
	return 0;
}
int judge(int year)
{
	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

