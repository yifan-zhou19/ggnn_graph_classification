package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int day = 0;
		int y;
		int m;
		int d;
		int i;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))
		{
			month[2] = 29;
		}
		for (i = 1; i < m; i++)
		{
			day += month[i];
		}
		day += d;
		System.out.print(day);


		return 0;
	}


}

