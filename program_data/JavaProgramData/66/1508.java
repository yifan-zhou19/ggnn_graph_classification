package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'num', so pointers on this parameter are left unchanged:
	public static void countdate(int year, int month, int date, int * num)
	{
		int i;
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for (i = 1;i < month;i++)
		{
			*num += day[i];
		}
		*num += date;
		if (month > 2)
		{
			if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
			{
				(*num)++;
			}
		}
	}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'num', so pointers on this parameter are left unchanged:
	public static void countyear(int year, int * num)
	{
		*num += (year - 1) * 365;
		*num += (year - 1) / 4;
		*num -= (year - 1) / 100;
		*num += (year - 1) / 400;
	}

	public static int Main()
	{
		int month;
		int date;
		int year;
		int num = 0;

		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		date = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (year > 7000)
		{
			year -= 7000;
		}
		countdate(year, month, date, num);
		countyear(year, num);

		switch (num % 7)
		{
			case 0:
				System.out.print("Sun.");
				System.out.print("\n");
				break;
			case 1:
				System.out.print("Mon.");
				System.out.print("\n");
				break;
			case 2:
				System.out.print("Tue.");
				System.out.print("\n");
				break;
			case 3:
				System.out.print("Wen.");
				System.out.print("\n");
				break;
			case 4:
				System.out.print("Thu.");
				System.out.print("\n");
				break;
			case 5:
				System.out.print("Fri.");
				System.out.print("\n");
				break;
			case 6:
				System.out.print("Sat.");
				System.out.print("\n");
				break;
		}

		return 0;
	}
}

