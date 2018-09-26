package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int i;
		int j;
		int sum = 0;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y1 == y2 && m1 == m2)
		{
			System.out.print(d2 - d1);
			System.out.print("\n");
			return 1;
		}
		else if (y1 == y2)
		{
			if ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0)
			{
				month[2] = 29;
			}
			else
			{
				month[2] = 28;
			}
			sum += month[m1] - d1;
			if (m2 == m1 + 1)
			{
				sum += d2;
			}
			else
			{
				for (i = m1 + 1; i < m2; i++)
				{
					sum += month[i];
				}
				sum += d2;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		else
		{
			for (i = y1; i <= y2; i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
				{
					month[2] = 29;
				}
				else
				{
					month[2] = 28;
				}
				if (i == y1)
				{
					for (j = m1; j <= 12; j++)
					{
						if (j == m1)
						{
							sum += month[m1] - d1;
						}
						else
						{
							sum += month[j];
						}
					}
				}
				else if (i == y2)
				{
					for (j = 1; j <= m2; j++)
					{
						if (j != m2)
						{
							sum += month[j];
						}
						else
						{
							sum += d2;
						}
					}
				}
				else
				{
					if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
					{
						sum += 366;
					}
					else
					{
						sum += 365;
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

