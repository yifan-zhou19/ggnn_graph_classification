package <missing>;

public class GlobalMembers
{
	public static int Main() //????????2?????????????
	{
		int year;
		int month;
		int day;
		int i;
		int j;
		String[] week = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum1 = 0; //?400???????
		for (i = 1;i < 401;i++)
		{
			sum1 = sum1 + 365;
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				sum1++;
			}
			sum1 %= 7; //????
		}
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num = (year - 1) / 400;
		int sum = num * sum1;
		sum %= 7;
		year = year - num * 400; //??????
		for (i = 1;i < year;i++)
		{
			sum += 365;
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				sum++; //???????????
			}
			sum %= 7;
		}

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			mon[2]++;
		}
		for (i = 1;i < month;i++)
		{
			sum += mon[i];
		}
		sum += day;
		sum--;
		sum = sum % 7;
		System.out.print(week[sum]);
		System.out.print("\n");
		return 0;
	}


}

