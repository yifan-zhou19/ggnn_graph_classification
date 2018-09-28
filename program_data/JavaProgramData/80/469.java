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
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		sum += d2 - d1;
		if (m2 >= m1)
		{
			for (int i = 0;i < 12;i++)
			{
				if ((i + 1 >= m1) && (i + 1 < m2))
				{
					sum += mon[i];
				}
			}
		}
		else
		{
			for (int i = 0;i < 12;i++)
			{
				if (i + 1 >= m2 != 0 && i + 1 < m1)
				{
					sum -= mon[i];
				}
			}
		}
		sum += (y2 - y1) * 365;
		for (int i = y1;i <= y2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum++;
			}
		}
		if (((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0)) && m1 > 2)
		{
			sum--;
		}
		if (((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0)) && m2 <= 2)
		{
			sum--;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

