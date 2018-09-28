package <missing>;

public class GlobalMembers
{
	public static int[] x = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int ctr = 0;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (y2 - y1 >= 2)
		{
			ctr += 365;
			if (((m1 == 1 || (m1 == 2 && d1 <= 28)) && ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))) || (m1 >= 3 && (((y1 + 1) % 4 == 0 && (y1 + 1) % 100 != 0) || ((y1 + 1) % 400 == 0))))
			{
				ctr++;
			}
			y1++;
		}
		if (y2 - y1 == 1)
		{
			while (m1 != 13)
			{
				ctr += x[m1];
				if (m1 == 2 && ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0)))
				{
					ctr++;
				}
				m1++;
			}
			m1 = 1;
			y1++;
		}
		while (m1 != m2)
		{
			ctr += x[m1];
			if (m1 == 2 && ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0)))
			{
				ctr++;
			}
			m1++;
		}
		ctr += d2 - d1;
		System.out.print(ctr);
		System.out.print("\n");
	}
}

