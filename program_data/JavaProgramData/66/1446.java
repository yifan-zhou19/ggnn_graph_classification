package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int dd = 1;
		int[] m1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] m2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] f = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)))
		{
			dd += ((y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400);
		}
		else
		{
			dd += (y / 4 - y / 100 + y / 400);
		}
		dd = dd % 7;
		dd += y - 1;
		dd = dd % 7;
		for (i = 0;i < m - 1;i++)
		{
			if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
			{
				dd += m2[i];
			}
			else
			{
				dd += m1[i];
			}
		}
		dd += d - 1;
		dd = dd % 7;
		if (dd == 0)
		{
			dd = 7;
		}
		System.out.print(f[dd - 1]);
		System.out.print("\n");
		return 0;
	}
}

