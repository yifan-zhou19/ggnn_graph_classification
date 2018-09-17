package <missing>;

public class GlobalMembers
{
	public static int leap(int n)
	{
		if (n % 4 == 0 && n % 100 != 0)
		{
			return 1;
		}
		else if (n % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
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
		if (leap(year) == 1)
		{
			if (month == 1)
			{
				x = day;
			}
			if (month == 2)
			{
				x = day + 31;
			}
			if (month == 3)
			{
				x = day + 60;
			}
			if (month == 4)
			{
				x = day + 91;
			}
			if (month == 5)
			{
				x = day + 121;
			}
			if (month == 6)
			{
				x = day + 152;
			}
			if (month == 7)
			{
				x = day + 182;
			}
			if (month == 8)
			{
				x = day + 213;
			}
			if (month == 9)
			{
				x = day + 244;
			}
			if (month == 10)
			{
				x = day + 274;
			}
			if (month == 11)
			{
				x = day + 305;
			}
			if (month == 12)
			{
				x = day + 335;
			}
		}
		else
		{
			if (month == 1)
			{
				x = day;
			}
			if (month == 2)
			{
				x = day + 31;
			}
			if (month == 3)
			{
				x = day + 59;
			}
			if (month == 4)
			{
				x = day + 90;
			}
			if (month == 5)
			{
				x = day + 120;
			}
			if (month == 6)
			{
				x = day + 151;
			}
			if (month == 7)
			{
				x = day + 181;
			}
			if (month == 8)
			{
				x = day + 212;
			}
			if (month == 9)
			{
				x = day + 243;
			}
			if (month == 10)
			{
				x = day + 273;
			}
			if (month == 11)
			{
				x = day + 304;
			}
			if (month == 12)
			{
				x = day + 334;
			}
		}
		System.out.printf("%d",x);
	}
}

