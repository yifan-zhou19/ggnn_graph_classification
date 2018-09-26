package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int numofafter = 0;
		int num = 0;
		int final = 0;
		double numofleap;
		String[] xingqi = {"0", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		numofleap = Math.floor((y - 1) / 4.0) - (Math.floor((y - 1) / 100.0) - Math.floor(Math.floor((y - 1) / 100.0) / 4.0));
		numofafter = numofleap * 2 + y - numofleap - 1;
		int start = 0;
		start = numofafter % 7 + 1;
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			mon[2] = 29;
		}
		for (int i = 0;i < m;i++)
		{
			num = num + mon[i];
		}
		num = num + d;
		final = (num % 7 + start - 1) % 7;
			System.out.print(xingqi[final]);
			System.out.print("\n");
		return 0;
	}
}

