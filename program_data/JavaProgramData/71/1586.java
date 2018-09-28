package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int year;
	int month1;
	int month2;
	int leap;
	int days = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n-- != 0)
	{
	year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int temp;
	if (month1 > month2)
	{
		temp = month2;
		month2 = month1;
		month1 = temp;
	}
	if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
	{
		leap = 0;
	}
	else
	{
		leap = 1;
	}
	int[][] day =
	{
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	for (int i = month1;i < month2;i++)
	{
		days += day[leap][i - 1];
	}
	if (days % 7 == 0)
	{
		System.out.print("YES");
		System.out.print("\n");
	}
	else
	{
		System.out.print("NO");
		System.out.print("\n");
	}
	days = 0;
	}

	return 0;
	}
}

