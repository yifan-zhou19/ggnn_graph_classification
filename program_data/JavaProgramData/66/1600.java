package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int yorn;
		int day = 0;
		int[][] days =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int[] year = {365, 366};
		String[] week = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < a;i = i + 400)
		{
			day = day;
		}
		for (i = i - 400;i < a;i++)
		{
			day += year[((i % 100 != 0) && (i % 4 == 0)) || (i % 400 == 0)];
		}
		yorn = ((a % 100 != 0) && (a % 4 == 0)) || (a % 400 == 0);
		for (i = 0;i < b - 1;i++)
		{
			day += days[yorn][i];
		}
		day += c;
		System.out.print(week[day % 7]);
		System.out.print(".");
		System.out.print("\n");
		return 0;
	}

}

