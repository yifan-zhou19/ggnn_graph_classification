package <missing>;

public class GlobalMembers
{
	public static int[] year = {365, 366};
	public static int[][] month =
	{
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	public static String[] week = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
	public static int leap(int a)
	{
		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) //??????????????????????????????
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int y;
		int m;
		int d;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int day = 0;
		for (int i = 1;i * 400 <= y - 1;i++) //????????
		{
			day = (day + 365 * 400 + 100 - 3) % 7;
		}
		for (int i = 1;i <= (y - 1) % 400;i++) //???????
		{
			day = (day + year[leap(i)]) % 7;
		}
		for (int i = 1;i < m;i++) //???????
		{
			day = (day + month[leap(y)][i - 1]) % 7;
		}
		day = (day + d - 1) % 7; //????
		System.out.print(week[day]);
		System.out.print("\n");
		return 0;
	}
}

