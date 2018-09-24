package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] weekday = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			day[1] = 29;
		}
		for (int i = 0;i < m - 1;i++)
		{
			d += day[i];
		}
		d = d % 7;
		d += (y - 1) + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
		d = d % 7;
		System.out.print(weekday[d]);
		System.out.print("\n");
		return 0;
	}

}

