int leap = int;
int main()
{
	int[][] daymonth =
	{
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	int YEAR;
	int MON;
	int DAY;
	int i;
	int counter = 0;
	YEAR = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	MON = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	DAY = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < MON - 1;i++)
	{
		counter += daymonth[leap(YEAR)][i];
	}
	counter += DAY;
	System.out.print(counter);
	System.out.print("\n");
	return 0;
}
int leap(int YEAR)
{
	if ((YEAR % 4 == 0) && (YEAR % 100 != 0) || (YEAR % 400 == 0))
	{
			return 1;
	}
	else
	{
		return 0;
	}
}


