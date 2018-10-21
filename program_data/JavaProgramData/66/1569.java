package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		long year;
		long month;
		long day;
		year = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		month = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		day = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		long[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		long num = 0;
		long mod = (year / 100) % 4;
		//cout << mod << " ";
		num = year / 4 - (year / 100 - mod) * 3 / 4 - mod;
		//cout << num << " ";
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			num--;
			a[2] = 29;
		}
		//cout << num << " ";
		long sum = 0;
		sum = sum + num * 366 + (year - num - 1) * 365;
		//cout << sum << " ";
		for (int i = 1; i < month; i++)
		{
			sum = sum + a[i];
		}
		//cout << sum << " ";
		sum = sum + day;
		//cout << sum << " ";
		sum = sum % 7;
		//cout << sum << " ";
		System.out.print(week[sum]);
		System.out.print("\n");
		return 0;
	}
}

