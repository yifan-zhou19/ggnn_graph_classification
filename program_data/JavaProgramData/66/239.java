package <missing>;

public class GlobalMembers
{
	public static int cul(int month)
	{
		switch (month)
		{
		case 1:
		{
			return 0;
			break;
		}
		case 2:
		{
			return 3;
			break;
		}
		case 3:
		{
			return 3;
			break;
		}
		case 4:
		{
			return 6;
			break;
		}
		case 5:
		{
			return 1;
			break;
		}
		case 6:
		{
			return 4;
			break;
		}
		case 7:
		{
			return 6;
			break;
		}
		case 8:
		{
			return 2;
			break;
		}
		case 9:
		{
			return 5;
			break;
		}
		case 10:
		{
			return 0;
			break;
		}
		case 11:
		{
			return 3;
			break;
		}
		case 12:
		{
			return 5;
			break;
		}
		};
	}
	public static int Main()
	{
		int year;
		int month;
		int day;
		String[] stu = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sta = 0;
		sta = sta + year - 1 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		sta = sta + cul(month);
		sta = sta + (day - 1) % 7;
		if (year % 400 == 0 && month > 2)
		{
			sta++;
		}
		else
		{
			if (year % 4 == 0 && year % 100 != 0 && month > 2)
			{
				sta++;
			}
		}
		sta %= 7;
		System.out.print(stu[sta]);
		System.out.print("\n");
		return 0;
	}




}

