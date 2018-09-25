package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y;
		int m;
		int d;
		int i;
		int c;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
		{
			days[2]++;
		}
		c = d;
		for (i = 1; i < m; i++)
		{
			c += days[i];
		}
		System.out.print(c);
		System.out.print("\n");
		return 0;
	}

}

