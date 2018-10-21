package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int i;
		int temp;
		int day_year = 365 % 7;
		int[] day_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		temp = day_year * (year - 1);
		temp += year / 4 - year / 100 + year / 400;
		for (i = 0; i < month - 1;i++)
		{
			temp += day_month[i];
		}
		temp += day;

		if (year % 100 == 0 && year % 400 == 0)
		{
			if (month <= 2)
			{
				temp--;
			}
		}
		temp = temp % 7;
		System.out.printf("%s\n", week[temp]);

		return 0;
	}



}

