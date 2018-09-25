package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year1;
		int month1;
		int day1;
		int year2;
		int month2;
		int day2;
		int len1 = 0;
		int len2 = 0;
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
		String tempVar4 = ConsoleInput.scanfRead(" ");
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
		int year;
		int i;
		int c;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (year = 0;year < year1;year++)
		{
			if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0))
			{
			len1 += 366;
			}
			else
			{
				len1 += 365;
			}
		}
		 for (year = 0;year < year2;year++)
		 {
			if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0))
			{
			len2 += 366;
			}
			else
			{
				len2 += 365;
			}
		 }
		for (i = 0;i < month1;i++)
		{
			len1 += month[i];
		}
		for (i = 0;i < month2;i++)
		{
			len2 += month[i];
		}
		if ((year1 % 4 == 0 && year1 % 100 != 0 || (year1 % 400 == 0)) && (month1 > 2))
		{
		 len1 += 1;
		}
		 if ((year2 % 4 == 0 && year2 % 100 != 0 || (year2 % 400 == 0)) && (month2 > 2))
		 {
		len2 += 1;
		 }
		len1 += day1;
		len2 += day2;
		c = len2 - len1;
		System.out.printf("%d",c);

	}
}

