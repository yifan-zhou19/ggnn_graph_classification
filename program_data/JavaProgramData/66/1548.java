package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int day = 0;
		day = y - 1 + (y - 1 - ((y - 1) % 4)) / 4 - (y - 1 - ((y - 1) % 100)) / 100 + (y - 1 - ((y - 1) % 400)) / 400;
		int[] a = {3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2};
		if ((y % 4 == 0 && y % 4 != 100) || y % 400 == 0)
		{
			a[1] = 1;
		}
		for (int i = 1;i < m;i++)
		{
			day += a[i - 1];
		}
		day += d;
		day = day % 7;
			if (day == 1)
			{
				System.out.print("Mon.");
			}
			if (day == 2)
			{
				System.out.print("Tue.");
			}
			if (day == 3)
			{
				System.out.print("Wed.");
			}
			if (day == 4)
			{
				System.out.print("Thu.");
			}
			if (day == 5)
			{
				System.out.print("Fri.");
			}
			if (day == 6)
			{
				System.out.print("Sat.");
			}
			if (day == 0)
			{
				System.out.print("Sun.");
			}
		return 0;
	}
}

