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
		int days = 0;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] mo = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		if (y2 == y1)
		{
			if (m1 != m2)
			{
			if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				for (int j = m1;j < m2;j++)
				{
					days = days + mo[j];
				}
				days = days + mo[m1 - 1] - d1;
			}
			else
			{
				for (int j = m1;j < m2;j++)
				{
					days = days + m[j];
				}
				days = days + m[m1 - 1] - d1;
			}
			}
			if (m1 == m2)
			{
				days = d2 - d1;
			}
			System.out.print(days);
			System.out.print("\n");
		}
		if (y2 - y1 == 1)
		{
			if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				for (int j = m1;j < 12;j++)
				{
					days = days + mo[j];
				}
				days = days + mo[m1 - 1] - d1;
			}
			else
			{
				for (int j = m1;j < 12;j++)
				{
					days = days + m[j];
				}
				days = days + m[m1 - 1] - d1;
			}
			if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
			{
				if (m2 == 1)
				{
					days = days + d2;
				}
				if (m2 > 1)
				{
				for (int j = 0;j < m2 - 1;j++)
				{
					days = mo[j] + days;
				}
				days = days + d2;
				}
			}
			else
			{
				if (m2 == 1)
				{
					days = days + d2;
				}
				if (m2 > 1)
				{
				for (int j = 0;j < m2 - 1;j++)
				{
					days = m[j] + days;
				}
				days = days + d2;
				}
			}
			System.out.print(days);
			System.out.print("\n");
		}
		if (y2 - y1 > 1)
		{
			if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				for (int j = m1;j < 12;j++)
				{
					days = days + mo[j];
				}
				days = days + mo[m1 - 1] - d1;
			}
			else
			{
				for (int j = m1;j < 12;j++)
				{
					days = days + m[j];
				}
				days = days + m[m1 - 1] - d1;
			}
			for (int k = 1;k < y2 - y1;k++)
			{
				if (((y1 + k) % 4 == 0 && (y1 + k) % 100 != 0) || ((y1 + k) % 400 == 0))
				{
					days = days + 366;
				}
				else
				{
					days = days + 365;
				}
			}
			if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
			{
				if (m2 == 1)
				{
					days = days + d2;
				}
				else
				{
					for (int x = 0;x < m2 - 1;x++)
					{
						days = days + mo[x];
					}
					days = days + d2;
				}
			}
			else
			{
				if (m2 == 1)
				{
					days = days + d2;
				}
				else
				{
					for (int x = 0;x < m2 - 1;x++)
					{
						days = days + m[x];
					}
					days = days + d2;
				}
			}
			System.out.print(days);
			System.out.print("\n");
		}
		return 0;
	}

}

