package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year;
		int month;
		int day;
		int isleapyear;
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

		isleapyear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		if (isleapyear != 0 && month == 2 && (day < 1 || day > 29))
		{
				System.out.print("Illegal input.\n");
				return -1;
		}
		if (isleapyear != 0 && month != 2 && (day < 1 || day > days[month]))
		{
				System.out.print("Illegal input.\n");
				return -1;
		}
		if (isleapyear == 0 && (day < 1 || day > days[month]))
		{
				System.out.print("Illegal input.\n");
				return -1;
		}


		int n = 0;
		int i;
		for (i = 0;i < month;i++)
		{
			n += days[i];
		}
		n += day;
		if (month > 2 && isleapyear != 0)
		{
			n++;
		}
		System.out.printf("%d",n);
		return 0;
	}

}

