package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int leap;
		int year;
		int month;
		int day;
		int sum = 0;
		int[][] a =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		leap = ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0));
		for (int i = 0;i < month - 1;i++)
		{
		   sum = sum + a[leap][i];
		}
		sum = sum + day;
		System.out.print(sum);
		System.out.print("\n");
		return 0;

	}

}

