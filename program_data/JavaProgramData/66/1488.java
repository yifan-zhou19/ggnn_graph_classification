package <missing>;

public class GlobalMembers
{
	public static int number_of_leap_years(int yr, int mth, int day)
	{
		int additionalDay = 0;
		int remainder = 0;

		additionalDay = (yr - 1) / 400;
		additionalDay *= 97;
		remainder = (yr - 1) % 400;

		for (int i = 0; i <= remainder; i += 4)
		{
			if (i == 0)
			{
				continue;
			}
			if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0))
			{
				additionalDay++;
			}
		}

		if (yr % 4 == 0 && (yr % 100 != 0 || yr % 400 == 0))
		{
			if (mth > 2)
			{
				additionalDay++;
			}
		}

		return additionalDay;
	}

	public static int Main()
	{
		int i = 0;
		String[] dayName = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		long inputYear = 0;
		long inputMonth = 0;
		long inputDay = 0;
		int totalDay = 0;

		inputYear = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		inputMonth = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		inputDay = Long.parseLong(ConsoleInput.readToWhiteSpace(true));

		totalDay += (365 * (inputYear - 1)) % 7;
		for (int j = 1; j < inputMonth; j++)
		{
			totalDay += daysInMonth[j];
		}
		totalDay += inputDay - 1;

		totalDay += number_of_leap_years(inputYear, inputMonth, inputDay);
		System.out.print(dayName[totalDay % 7]);
		System.out.print("\n");

		return 0;
	}
}

