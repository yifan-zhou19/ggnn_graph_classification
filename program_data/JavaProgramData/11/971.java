package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int total = 0;
		int i;
		int[][] mon =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			for (i = 1;i < month;i++)
			{
				total += mon[1][i];
			}
			total += day;
		}
		else
		{
			for (i = 1;i < month;i++)
			{
				total += mon[0][i];
			}
			total += day;
		}
		System.out.print(total);
		System.out.print("\n");
		return 0;
	}
}

