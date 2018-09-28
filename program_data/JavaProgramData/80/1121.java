package <missing>;

public class GlobalMembers
{
	public static int judge(int n)
	{
		if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
		{
		return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year1;
		int month1;
		int day1;
		int year2;
		int day2;
		int month2;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 1;
		int time1 = 0;
		int time2 = 0;
		a[1] = judge(year1) + 28;
		for (i = 1;i < month1;i++)
		{
			time1 += a[i - 1];
		}
		time1 += day1 - 1;
		a[1] = judge(year2) + 28;
		for (i = 1;i < month2;i++)
		{
			time2 += a[i - 1];
		}
		time2 += day2 - 1;
		int time = 0;
		for (i = year1;i < year2;i++)
		{
			time += 365 + judge(i);


		}
		int result;

		result = time + time2 - time1;

		System.out.print(result);
			return 0;
	}

}

