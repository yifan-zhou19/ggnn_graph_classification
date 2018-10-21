package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int i;
		int sum = 0;
	int[][] DaysOfMonth =
	{
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	int flag;
	year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (year % 4 != 0 || (year % 4 == 0 && year % 100 == 0 && year % 400 != 0))
	{
		flag = 0;
	}
	else
	{
		flag = 1;
	}
	if (month == 1)
	{
		System.out.print(day);
		System.out.print("\n");
	}
	else
	{
		for (i = 1;i < month;i++)
		{
			sum += DaysOfMonth[flag][i];
		}
		sum += day;
	System.out.print(sum);
	System.out.print("\n");
	}
	return 0;
	}






}

