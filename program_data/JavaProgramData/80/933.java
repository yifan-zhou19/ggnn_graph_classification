package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int startyear;
		int startmonth;
		int startday;
		int endyear;
		int endmonth;
		int endday;
		int year;
		int month;
		int m;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startyear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			startmonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			startday = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			endyear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			endmonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			endday = Integer.parseInt(tempVar6);
		}
		if (startyear != endyear)
		{
		for (year = startyear + 1;year < endyear;year++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				s = s + 366;
			}
			else
			{
				s = s + 365;
			}
		}
		for (month = 1;month < endmonth;month++)
		{
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			{
				s = s + 31;
			}
			else if (month == 4 || month == 6 || month == 9 || month == 11)
			{
				s = s + 30;
			}
			else
			{
						if ((endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0))
						{
							s = s + 29;
						}
						else
						{
							s = s + 28;
						}
			}
		}
		s = s + endday - 1;
		m = 0;
		for (month = 1;month < startmonth;month++)
		{
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			{
				m = m + 31;
			}
			else if (month == 4 || month == 6 || month == 9 || month == 11)
			{
				m = m + 30;
			}
			else
			{
						if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
						{
							m = m + 29;
						}
						else
						{
							m = m + 28;
						}
			}
		}
			 m = m + startday - 1;
		if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
		{
			   s = s + 366 - m;
		}
		   else
		   {
			   s = s + 365 - m;
		   }
		}
		else
		{
				if (startmonth != endmonth)
				{
					for (month = startmonth + 1;month < endmonth;month++)
					{
						if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
						{
				s = s + 31;
						}
			else if (month == 4 || month == 6 || month == 9 || month == 11)
			{
				s = s + 30;
			}
			else
			{
						if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
						{
							s = s + 29;
						}
						else
						{
							s = s + 28;
						}
			}
					}
					s = s + endday - 1;
					if (startmonth == 1 || startmonth == 3 || startmonth == 5 || startmonth == 7 || startmonth == 8 || startmonth == 10 || startmonth == 12)
					{
				s = s + 31 - startday;
					}
			else if (startmonth == 4 || startmonth == 6 || startmonth == 9 || startmonth == 11)
			{
				s = s + 30 - startday;
			}
			else
			{
						if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
						{
							s = s + 29 - startday;
						}
						else
						{
							s = s + 28 - startday;
						}
			}
				}
				else
				{
					s = endday - startday;
				}
		}
				  System.out.printf("%d",s);
		   return 0;
	}
}

