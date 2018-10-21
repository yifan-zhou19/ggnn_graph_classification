package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int y1;
		int y2;
		String[] str = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
		y2 = y - 1 - y1;
		d += (2 * y1 + y2);
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
		{
			month[1] += 1;
		}
		for (i = 0;i < m - 1;i++)
		{
			d += month[i];
		}
		System.out.print(str[d % 7]);
		System.out.print("\n");
		return 0;
	}


}

