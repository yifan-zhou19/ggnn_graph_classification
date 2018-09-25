package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year;
		int month;
		int day;
		int n;
		int a = 0;
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
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			a = 1;
		}
		if (month == 1)
		{
			n = day;
		}
		if (month == 2)
		{
			n = 31 + day;
		}
		if (month == 3)
		{
			n = 59 + day;
		}
		if (month == 4)
		{
			n = 90 + day;
		}
		if (month == 5)
		{
			n = 120 + day;
		}
		if (month == 6)
		{
			n = 151 + day;
		}
		if (month == 7)
		{
			n = 181 + day;
		}
		if (month == 8)
		{
			n = 212 + day;
		}
		if (month == 9)
		{
			n = 243 + day;
		}
		if (month == 10)
		{
			n = 273 + day;
		}
		if (month == 11)
		{
			n = 304 + day;
		}
		if (month == 12)
		{
			n = 334 + 12;
		}
		if (month > 2 && a == 1)
		{
			n++;
		}
		System.out.printf("%d",n);
	}
}

