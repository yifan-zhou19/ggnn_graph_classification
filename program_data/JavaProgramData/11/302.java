package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
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
		int x;
		int Jan = 1;
		int feb = 2;
		int Mar = 3;
		int Apr = 4;
		int May = 5;
		int Jun = 6;
		int Jul = 7;
		int Aug = 8;
		int Sep = 9;
		int Oct = 10;
		int Nov = 11;
		int Dec = 12;
		int Feb;
		{
			if (year % 4 == 0)
			{
				if (year % 100 == 0)
				{
					if (year % 400 == 0)
					{
						Feb = 29;
					}
					else
					{
						Feb = 28;
					}
				}
				else
				{
					Feb = 29;
				}
			}
			else
			{
				Feb = 28;
			}
		}
		if (month == Jan)
		{
			x = day;
		}
		if (month == feb)
		{
			x = 31 + day;
		}
		if (month == Mar)
		{
			x = 31 + Feb + day;
		}
		if (month == Apr)
		{
			x = 31 + Feb + 31 + day;
		}
		if (month == May)
		{
			x = 31 + Feb + 31 + 30 + day;
		}
		if (month == Jun)
		{
			x = 31 + Feb + 31 + 30 + 31 + day;
		}
		if (month == Jul)
		{
			x = 31 + Feb + 31 + 30 + 31 + 30 + day;
		}
		if (month == Aug)
		{
			x = 31 + Feb + 31 + 30 + 31 + 30 + 31 + day;
		}
		if (month == Sep)
		{
			x = 31 + Feb + 31 + 30 + 31 + 30 + 31 + 31 + day;
		}
		if (month == Oct)
		{
			x = 31 + Feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
		}
		if (month == Nov)
		{
			x = 31 + Feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
		}
		if (month == Dec)
		{
			x = 31 + Feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		}
		System.out.printf("%d\n",x);
		return 0;
	}


}

