package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n = 0;
		int year;
		int month;
		int day;
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
		if (month == 1)
		{
			n = n + day;
		}
		else if (month == 2)
		{
			n = n + 31 + day;
		}
		else if (month == 3)
		{
			n = n + 59 + day;
		}
		else if (month == 4)
		{
			n = n + 90 + day;
		}
		else if (month == 5)
		{
			n = n + 120 + day;
		}
		else if (month == 6)
		{
			n = n + 151 + day;
		}
		else if (month == 7)
		{
			n = n + 181 + day;
		}
		else if (month == 8)
		{
			n = n + 212 + day;
		}
		else if (month == 9)
		{
			n = n + 243 + day;
		}
		else if (month == 10)
		{
			n = n + 273 + day;
		}
		else if (month == 11)
		{
			n = n + 304 + day;
		}
		else
		{
			n = n + 334 + day;
		}
		if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) && (month > 2))
		{
			n = n + 1;
		}
		System.out.printf("%d",n);
	}

}

