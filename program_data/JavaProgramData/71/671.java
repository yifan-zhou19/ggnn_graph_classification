package <missing>;

public class GlobalMembers
{
	public static int leap(int a)
	{
		if (((a % 4 == 0) && (a % 100 != 0)) || a % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int bigger(int a, int b)
	{
		if (a >= b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}

	public static int Main()
	{
		int n;
		int year;
		int month1;
		int month2;
		int big;
		int small;
		int countdays;
		int[][] days =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			big = bigger(month1, month2);
			small = month1 + month2 - big;
			countdays = 0;
			for (int j = small - 1; j < big - 1; j++)
			{
				countdays += days[leap(year)][j];
			}
			if (countdays % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}

		return 0;
	}

}

