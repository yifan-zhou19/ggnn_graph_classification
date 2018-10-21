package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = -1;
		int y;
		int d;
		int m;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
		{
			a[2] = 29;
		}
		if (y > 1)
		{
			y = (y - 1) % 400;
		}
		n = n - (y / 100) * 2;
		y = y % 100;
		while (y-- != 0)
		{
			if ((y + 1) % 400 == 0 || ((y + 1) % 4 == 0 && (y + 1) % 100 != 0))
			{
				n += 366;
			}
			else
			{
				n += 365;
			}
		}
		for (int i = 1;i < m;i++)
		{
			n += a[i];
		}
		n += d;
		System.out.print(week[n % 7]);
		return 0;
	}
}

