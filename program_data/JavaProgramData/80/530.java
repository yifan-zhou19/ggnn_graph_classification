int pan = int;
int main()
{
	int[][] mou =
	{
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};

	int year1;
	int mou1;
	int date1;
	int year2;
	int mou2;
	int date2;
	int day1 = 0;
	int day2 = 0;
	int i;
	year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	mou1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	date1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	mou2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	date2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (i = 1; i <= mou1 - 1; i++)
	{
		day1 += mou[pan(year1)][i];
	}
	day1 += date1;

	for (i = year1; i < year2; i++)
	{
		day2 = day2 + 365 + pan(i);
	}
	for (i = 1; i <= mou2 - 1; i++)
	{
		day2 += mou[pan(year2)][i];
	}
	day2 += date2;

	int cha = Math.abs(day1 - day2);
	System.out.print(cha);
	System.out.print("\n");





return 0;
}
int pan(int year)
{
	if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

