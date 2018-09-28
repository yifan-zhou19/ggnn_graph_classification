package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
	int year;
	int month;
	int day;
	int days = 0;
	int i;
	int s;
	int k;
	int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
	if (isRunNian(year) != 0)
	{
		m[2] = 29;
	}
		else
		{
			m[2] = 28;
		}
	for (i = 0;i < month;i++)
	{
	  days += m[i];
	}
	 days += day;
	s = year - 1 + (int)((year - 1) / 4) - (int)((year - 1) / 100) + (int)((year - 1) / 400) + days;
	k = s % 7;
	System.out.printf("%s",week[k]);
	return 0;
	}
}

