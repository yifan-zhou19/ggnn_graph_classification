int panduan = (int)year;
int main()
{
	int sum = 0;
	int year;
	int month;
	int day;
	int i;
	int[] Month1 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] Month2 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (panduan(year) == 1)
	{
		for (i = 1;i < month;i++)
		{
			sum += Month1[i];
		}
		sum += day;
		System.out.print(sum);
		return 0;
	}
	else
	{
		for (i = 1;i < month;i++)
		{
			sum += Month2[i];
		}
		sum += day;
		System.out.print(sum);
		return 0;
	}
	return 0;
}
int panduan(int year)
{
	if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}


