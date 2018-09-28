package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		int a;
		int b;
		int c;
		int d;
		int tempyear;
		int tempmonth;
		int tempday;
		d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		int[] montha = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
		int[] monthb = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		if (year1 == year2)
		{
			if (month1 == month2)
			{
				System.out.printf("%d",day2 - day1);
			}
			else
			{
				if ((year1 % 4 == 0) && (year1 % 100 != 0) || (year1 % 400 == 0))
				{
					System.out.printf("%d",montha[month2 - 1] - montha[month1 - 1] + day2 - day1);
				}
				else
				{
					System.out.printf("%d",monthb[month2 - 1] - monthb[month1 - 1] + day2 - day1);
				}
			}
		}
		else
		{
			a = year1 + 1;
			b = year2;
			c = 0;
			while (a < b)
			{
				if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0))
				{
					c += 366;
				}
				else
				{
					c += 365;
				}
				a++;
			}

			if (year1 > year2)
			{
				d = 1;

				tempyear = year1;
				year1 = year2;
				year2 = tempyear;

				tempmonth = month1;
				month1 = month2;
				month2 = tempmonth;

				tempday = day1;
				day1 = day2;
				day2 = tempday;
			}
			if ((year1 % 4 == 0) && (year1 % 100 != 0) || (year1 % 400 == 0))
			{
				c += 366 - (montha[month1 - 1] + day1);
			}
			else
			{
				c += 365 - (monthb[month1 - 1] + day1);
			}

			if ((year2 % 4 == 0) && (year2 % 100 != 0) || (year2 % 400 == 0))
			{
				c += (montha[month2 - 1] + day2);
			}
			else
			{
				c += (monthb[month2 - 1] + day2);
			}

			if (d == 0)
			{
				System.out.printf("%d",c);
			}
			else
			{
				System.out.printf("%d",0 - c);
			}
		}
	}
}

