package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int year;
	int month;
	int date;
	int day = 0;
	year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	date = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
	{
		int[] a = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 1;i <= (month - 1);i++)
		{
			day += a[i];
		}
		day += date;
	}
	else
	{
		int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 1;i <= (month - 1);i++)
		{
			day += b[i];
		}
		day += date;
	}
	System.out.print(day);
	System.out.print("\n");
	return 0;
	}
}

