package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int x;
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
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			if (month == 1)
			{
			x = day;
			}
		else if (month == 2)
		{
			x = 31 + day;
		}
		else if (month == 3)
		{
			x = 31 + 29 + day;
		}
		else if (month == 4)
		{
			x = 31 + 29 + 31 + day;
		}
		else if (month == 5)
		{
			x = 31 + 29 + 31 + 30 + day;
		}
		else if (month == 6)
		{
			x = 31 + 29 + 31 + 30 + 31 + day;
		}
		else if (month == 7)
		{
			x = 31 + 29 + 31 + 30 + 31 + 30 + day;
		}
		else if (month == 8)
		{
			x = 31 + 29 + 31 + 30 + 31 + 30 + 31 + day;
		}
		else if (month == 9)
		{
			x = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day;
		}
		else if (month == 10)
		{
			x = 31 + 29 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		}
		else if (month == 11)
		{
			x = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
		}
		else if (month == 12)
		{
			x = 31 + 29 + 30 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		}
		}
		else
		{
			if (month == 1)
			{
			x = day;
			}
		else if (month == 2)
		{
			x = 31 + day;
		}
		else if (month == 3)
		{
			x = 31 + 28 + day;
		}
		else if (month == 4)
		{
			x = 31 + 28 + 31 + day;
		}
		else if (month == 5)
		{
			x = 31 + 28 + 31 + 30 + day;
		}
		else if (month == 6)
		{
			x = 31 + 28 + 31 + 30 + 31 + day;
		}
		else if (month == 7)
		{
			x = 31 + 28 + 31 + 30 + 31 + 30 + day;
		}
		else if (month == 8)
		{
			x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
		}
		else if (month == 9)
		{
			x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
		}
		else if (month == 10)
		{
			x = 31 + 28 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		}
		else if (month == 11)
		{
			x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
		}
		else if (month == 12)
		{
			x = 31 + 28 + 30 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		}
		}

		System.out.printf("%d\n",x);
	}


}

