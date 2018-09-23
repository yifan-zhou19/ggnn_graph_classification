package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int sum = 0;
		int i;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0)))
		{
			int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for (i = 0;i < month - 1;i++)
			{
				sum = sum + days[i];
			}
		}
		else
		{
			int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for (i = 0;i < month - 1;i++)
			{
				sum = sum + days[i];
			}
		}
		sum = sum + day;
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

