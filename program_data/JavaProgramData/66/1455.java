package <missing>;

public class GlobalMembers
{
	public static int rui(int y,int m)
	{
		if (((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) && m == 2)
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
		int d = 0;
		int i = 0;
		int y;
		int m;
		int r;
		int[] pp = {0, 3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
		String[] aa = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = y % 400;
		if (y == 0)
		{
		y = 400;
		}
		while (i < y - 1)
		{
		i++;
		d = d + 1 + rui(i, 2);
		}
		i = 1;
		while (i < m)
		{
		d = d + pp[i] + rui(y, i);
		i++;
		}
		d = d + r - 1;
		d = d % 7;
		System.out.print(aa[d]);

		return 0;
	}
}

