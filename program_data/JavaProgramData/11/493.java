package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int year;
	int month;
	int days;
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
		days = Integer.parseInt(tempVar3);
	}
		int day;
		if (month == 1)
		{
			day = days;
		}
		if (month == 2)
		{
			day = 31 + days;
		}
			if (month == 3)
			{
			  if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
			  {
				  day = 31 + 29 + days;
			  }
			  else
			  {
				  day = 31 + 28 + days;
			  }
			}
		if (month == 4)
		{
				 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				 {
				  day = 31 + 29 + 31 + days;
				 }
			  else
			  {
				  day = 31 + 28 + 31 + days;
			  }
		}
		   if (month == 5)
		   {
			   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			   {
				  day = 31 + 29 + 31 + 30 + days;
			   }
			  else
			  {
				  day = 31 + 28 + 31 + 30 + days;
			  }
		   }
		if (month == 6)
		{
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				{
				  day = 31 + 29 + 30 + 31 + 31 + days;
				}
			  else
			  {
				  day = 31 + 28 + 30 + 31 + 31 + days;
			  }
		}
		if (month == 7)
		{
				 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				 {
				  day = 31 + 29 + 31 + 30 + 31 + 30 + days;
				 }
			  else
			  {
				  day = 31 + 28 + 31 + 30 + 31 + 30 + days;
			  }
		}
		if (month == 8)
		{
			  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			  {
				  day = 31 + 29 + 31 + 30 + 31 + 30 + 31 + days;
			  }
			  else
			  {
				  day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + days;
			  }
		}
		if (month == 9)
		{
			  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			  {
				  day = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + days;
			  }
			  else
			  {
				  day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + days;
			  }
		}
		if (month == 10)
		{
			  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			  {
				  day = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + days;
			  }
			  else
			  {
				  day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + days;
			  }
		}
		if (month == 11)
		{
			  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			  {
				  day = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + days;
			  }
			  else
			  {
				  day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + days;
			  }
		}
		if (month == 12)
		{
			   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			   {
				  day = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + days;
			   }
			  else
			  {
				  day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + days;
			  }
		}
		System.out.printf("%d\n",day);
	}

}

