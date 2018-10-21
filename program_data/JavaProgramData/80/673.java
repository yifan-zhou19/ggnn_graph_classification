package <missing>;

public class GlobalMembers
{
	public static int[] Month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int leapyear(int year)
	{
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		{
			return 366;
		}
		else
		{
			return 365;
		}
	}
	public static int Days(int startyear,int month,int day)
	{
		int days = 0;
		int j;
		for (j = 0;j < month;j++)
		{
		   days += Month[j];
		}
		days += day;
		if ((leapyear(startyear) == 366) && (month > 2))
		{
			return days + 1;
		}
		else
		{
			return days;
		}
	}
	public static int Main()
	{

		int StartY;
		int StartM;
		int StartD;
		int EndY;
		int EndM;
		int EndD;
		int sum = 0;
		int i;
		StartY = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		StartM = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		StartD = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		EndY = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		EndM = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		EndD = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (StartY == EndY)
		{
			System.out.print(Days(EndY, EndM, EndD) - Days(StartY, StartM, StartD));
		}
		else
		{
			for (i = StartY;i < EndY;i++)
			{
				sum += leapyear(i);
			}
			sum += Days(EndY, EndM, EndD) - Days(StartY, StartM, StartD);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

