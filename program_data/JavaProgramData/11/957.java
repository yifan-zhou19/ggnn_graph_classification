package <missing>;

public class GlobalMembers
{
	public static int[][] month =
	{
		{31, 28, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31}
	};
	public static int Main()
	{
		int year;
		int monthq;
		int day;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		monthq = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int ans = 0;
		for (int i = 1;i < monthq;i++)
		{
				int xx;
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
				{
				 xx = 1;
				}
				else
				{
					xx = 0;
				}
				ans += month[xx][i - 1];
		}
		ans += day;
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}


}

