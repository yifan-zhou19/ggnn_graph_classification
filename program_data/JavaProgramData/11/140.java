package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
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
		int i;

		if (year % 4 == 0 || year % 100 == 0)
		{
			if (month == 1)
			{
				i = day;
			}
			else if (month == 2)
			{
				i = (month - 1) * 31 + day;
			}
			else
			{
				i = (month - 1) * 31 + day - month / 2 - 1;
			}
		}
		else
		{
			if (month == 1)
			{
				i = day;
			}
			else if (month == 2)
			{
				i = (month - 1) * 31 + day;
			}
			else
			{
				i = (month - 1) * 31 + day - month / 2 - 1;
			}
		}

		System.out.printf("%d",i);






		return 0;
	}
}

