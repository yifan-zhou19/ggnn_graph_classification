package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,w,year,month,day,days=0;
	int i;
	int w;
	int year;
	int month;
	int day;
	int days = 0;
	int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
	if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
	{
	mon[2] = 29;
	}
	for (i = 0;i < month;i++)
	{
	days = days + mon[i];
	}
	days = days + day;
	w = year - 1 + (int)((year - 1) / 4) - (int)((year - 1) / 100) + (int)((year - 1) / 400) + days;

	System.out.printf("%s",week[w % 7]);
	return 0;
	}


}

