package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int ysum = 0;
		int msum = 0;
		int dsum = 0;
		int i;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = y1 + 1;i < y2;i++)
		{
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
			{
				ysum = ysum + 366;
			}
			else
			{
				ysum = ysum + 365;
			}
		}
		if (y2 - y1 == 0)
		{
			for (i = m1 + 1;i < m2;i++)
			{
			if ((((y1 % 4 == 0) && (y1 % 100 != 0)) || (y1 % 400 == 0)) && (i == 2))
			{
				msum = msum + 29;
			}
			else
			{
				msum = msum + a[i];
			}
			}
			if (m1 == m2)
			{
				dsum = d2 - d1;
			}
			else
			{
				if ((((y1 % 4 == 0) && (y1 % 100 != 0)) || (y1 % 400 == 0)) && (m1 == 2))
				{
				dsum = dsum + 29 - d1;
				}
			else
			{
				dsum = dsum + a[m1] - d1;
			}
			dsum = dsum + d2;
			}
		}
		else
		{
			for (i = m1 + 1;i <= 12;i++)
			{
				if ((((y1 % 4 == 0) && (y1 % 100 != 0)) || (y1 % 400 == 0)) && (i == 2))
				{
							msum = msum + 29;
				}
						else
						{
							msum = msum + a[i];
						}
			}
			for (i = 1;i < m2;i++)
			{
				if ((((y2 % 4 == 0) && (y2 % 100 != 0)) || (y2 % 400 == 0)) && (i == 2))
				{
							msum = msum + 29;
				}
						else
						{
							msum = msum + a[i];
						}
			}
			if ((((y1 % 4 == 0) && (y1 % 100 != 0)) || (y1 % 400 == 0)) && (m1 == 2))
			{
						dsum = dsum + 29 - d1;
			}
					else
					{
						dsum = dsum + a[m1] - d1;
					}
					dsum = dsum + d2;
		}
		System.out.print(dsum + msum + ysum);
		return 0;
	}
}

