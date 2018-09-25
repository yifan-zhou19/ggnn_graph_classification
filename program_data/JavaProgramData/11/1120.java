package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		System.out.print(d);
		return 0;
	}

}

