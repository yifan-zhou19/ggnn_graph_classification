package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int[] month1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day;
		int month;
		int number = 0;
		int i;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		{
			for (i = 0;i < month;i++)
			{
				number += month2[i];
			}
			number += day;
		}
		else
		{
			for (i = 0;i < month;i++)
			{
				number += month1[i];
			}
			number += day;
		}
		System.out.print(number);

		return 0;
	}

}

