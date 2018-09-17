package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int a;
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
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			if (month == 1)
			{
				a = day;
			}
			if (month == 2)
			{
				a = day + 31;
			}
			if (month == 3)
			{
				a = day + 60;
			}
			if (month == 4)
			{
				a = day + 91;
			}
			if (month == 5)
			{
				a = day + 121;
			}
			if (month == 6)
			{
				a = day + 152;
			}
			if (month == 7)
			{
				a = day + 182;
			}
			if (month == 8)
			{
				a = day + 213;
			}
			if (month == 9)
			{
				a = day + 244;
			}
			if (month == 10)
			{
				a = day + 274;
			}
			if (month == 11)
			{
				a = day + 305;
			}
			if (month == 12)
			{
				a = day + 335;
			}
		}
			else
			{
			if (month == 1)
			{
				a = day;
			}
			if (month == 2)
			{
				a = day + 31;
			}
			if (month == 3)
			{
				a = day + 59;
			}
			if (month == 4)
			{
				a = day + 90;
			}
			if (month == 5)
			{
				a = day + 120;
			}
			if (month == 6)
			{
				a = day + 151;
			}
			if (month == 7)
			{
				a = day + 181;
			}
			if (month == 8)
			{
				a = day + 212;
			}
			if (month == 9)
			{
				a = day + 243;
			}
			if (month == 10)
			{
				a = day + 273;
			}
			if (month == 11)
			{
				a = day + 304;
			}
			if (month == 12)
			{
				a = day + 334;
			}
			};
		System.out.printf("%d\n",a);
	}


}

