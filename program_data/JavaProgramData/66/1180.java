package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int year;
	int month;
	int day;
	int totalday;
	int week;
	int[] monthday = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
	int[] monthdayLeap = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
	String[] weekname = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};


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

	totalday = ((year - 1) % 7) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

	if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
	{
	 totalday += monthdayLeap[month - 1];
	}
	else
	{
	 totalday += monthday[month - 1];
	}

	 totalday += day;

	 week = totalday % 7;

	System.out.printf("%s\n",weekname[week]);

	}



}

