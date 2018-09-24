package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int[] montable = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		String[] print = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		int sumday;
		int i;

		sumday = 0;
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

		year %= 400;
		if (year != 0)
		{
			sumday = year + 6;
		}
		else
		{
			sumday += 5;
		}




		for (i = 1;i < year;i++)
		{
			if (i % 4 == 0 && i % 100 != 0)
			{
				sumday++;
				continue;
			}
		}

		sumday += montable[month - 1];


		if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month > 2)
		{
			sumday++;
		}

		sumday += day;

		System.out.printf("%s",print[sumday % 7]);


		return 0;
	}


}

