package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] month1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year;
		int month;
		int day;
		String[] out = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		int i;
		int days = 1;
		int temp;
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
		temp = year % 400 + 400;
		for (i = 2;i <= temp;i++)
		{
			if ((i - 1) % 4 == 0 && (i - 1) % 100 != 0 || (i - 1) % 400 == 0)
			{
				days = (days + 366) % 7;
			}
			else
			{
				days = (days + 365) % 7;
			}
		}
		for (i = 2;i <= month;i++)
		{
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				days = (days + month2[i - 2]) % 7;
			}
			else
			{
				days = (days + month1[i - 2]) % 7;
			}
		}
		days = (days + day - 1) % 7;
		if (days == 0)
		{
			System.out.printf("%s\n",out[6]);
		}
		else
		{
			System.out.printf("%s\n",out[days - 1]);
		}
	}





}

