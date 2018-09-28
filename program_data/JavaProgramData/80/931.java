package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		int i;
		int sum;
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		for (i = month1;i <= 12;i++)
		{
			sum += a[i - 1];
		}
		sum -= day1;
		if (month1 <= 2 && ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)))
		{
			sum++;
		}
		for (i = 1;i <= month2 - 1;i++)
		{
			sum += a[i - 1];
		}
		sum += day2;
			if (month2 >= 2 && ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0)))
			{
			sum++;
			}
		for (i = year1 + 1;i <= year2 - 1;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		if (year1 != year2)
		{
		}
		else
		{
			sum -= 365;
		}
		System.out.printf("%d",sum);
		return 0;
	}


}

