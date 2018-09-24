package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int daynum;
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
		if (year % 4 == 0)
		{
			if (year % 100 == 0 && year % 400 != 0)
			{
				int[] num = {31, 50, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
				if (month >= 2)
				{
					daynum = num[month - 2] + day;
				}
				else
				{
					daynum = day;
				}
				System.out.printf("%d",daynum);
			}
			else
			{
				int[] num = {31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};
				if (month >= 2)
				{
					daynum = num[month - 2] + day;
				}
				else
				{
					daynum = day;
				}
				System.out.printf("%d",daynum);
			}
		}
		else
		{
			int[] num = {31, 50, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
				if (month >= 2)
				{
					daynum = num[month - 2] + day;
				}
				else
				{
					daynum = day;
				}
			System.out.printf("%d",daynum);
		}
		return 0;
	}

}

