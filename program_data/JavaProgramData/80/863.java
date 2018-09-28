package <missing>;

public class GlobalMembers
{
	public static int years(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 366;
		}
		else
		{
			return 365;
		}
	}
	public static int months(int month,int year)
	{
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			return 31;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			return 30;
		}
		if (years(year) == 366)
		{
			return 29;
		}
		return 28;
	}
	public static int Main()
	{
		int[] day1 = new int[3];
		int[] day2 = new int[3];
		int sum = 0;
		for (int i = 0;i < 3;i++)
		{
			day1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < 3;i++)
		{
			day2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = day1[0] + 1;i < day2[0];i++)
		{
			sum = sum + years(i);
		}
		if (day1[0] != day2[0])
		{
		for (int i = day1[1];i <= 12;i++)
		{
			sum = sum + months(i, day1[0]);
		}
		for (int i = 1;i < day2[1];i++)
		{
			sum = sum + months(i, day2[0]);
		}

		}
		else
		{
				for (int i = day1[1];i < day2[1];i++)
				{
					sum = sum + months(i, day2[0]);
				}
		}
		sum = sum + day2[2] - day1[2];
		System.out.print(sum);
		System.out.print("\n");

		return 0;

	}
}

