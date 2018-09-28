package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] year = new int[2];
		int[] month = new int[2];
		int[] day = new int[2];
		int i;
		for (i = 0; i < 2; i++)
		{
			year[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			day[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int sum_days = 0;
		for (i = year[0]; i < year[1]; i++)
		{
			sum_days += 365 + ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0);
		}
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		sum_days -= day[0];
		month[0]--;
		while (month[0] > 0)
		{
			if (month[0] == 2)
			{
				sum_days -= mon[month[0]] + ((year[0] % 4 == 0 && year[0] % 100 != 0) || year[0] % 400 == 0);
			}
			else
			{
				sum_days -= mon[month[0]];
			}
			month[0]--;
		}
		sum_days += day[1];
		month[1]--;
		while (month[1] > 0)
		{
			if (month[1] == 2)
			{
				sum_days += mon[month[1]] + ((year[1] % 4 == 0 && year[1] % 100 != 0) || year[1] % 400 == 0);
			}
			else
			{
				sum_days += mon[month[1]];
			}
			month[1]--;
		}
		System.out.print(sum_days);
		System.out.print("\n");
		return 0;
	}
}

