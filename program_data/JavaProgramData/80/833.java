package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int d = 0;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = y1;i < y2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				d += 366;
			}
			else
			{
				d += 365;
			}
		}
		for (i = 1;i < m1;i++)
		{
			d -= m[i];
		}
		if (((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0)) && m1 > 2)
		{
			d -= 1;
		}
		d -= d1;
		for (i = 1;i < m2;i++)
		{
			d += m[i];
		}
		if (((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0)) && m2 > 2)
		{
			d += 1;
		}
		d += d2;
		System.out.print(d);
		return 0;
	}

}

