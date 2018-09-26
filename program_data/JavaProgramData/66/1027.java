package <missing>;

public class GlobalMembers
{
	public static int leap(int year)
	{
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
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
		String[] weekday = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		int i;
		int fix = 0;
		int year;
		int month;
		int day;
		int total = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}

		//add year
		fix = fix + (year - 1) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

		//add month
		for (i = 1; i < month; i++)
		{
			switch (i)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
				{
						total += 31;
				}
					 break;
				case 4:
				case 6:
				case 9:
				case 11:
				{
						total += 30;
				}
					 break;
				case 2:
				{
						 if (leap(year) != 0)
						 {
							 total += 29;
						 }
						 else
						 {
							 total += 28;
						 }
				}
					 break;
			}
		}

		//add day
		total += day;
		System.out.printf("%s\n",weekday[(fix + total) % 7]);
		return 0;
	}
}

