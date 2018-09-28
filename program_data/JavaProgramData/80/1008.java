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
		int i;
		int j;
		int sum = 0;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = y1 ; i < y2 ; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum += 366;
			}
			else
			{
			sum += 365;
			}
		}
		for (i = 1 ; i < m1 ; i++)
		{
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum = sum - 30;
			}
			if (i == 2)
			{
				if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
				{
					sum = sum - 29;
				}
				else
				{
				sum = sum - 28;
				}
			}
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				sum = sum - 31;
			}
		}
		sum = sum - d1;
		for (i = 1 ; i < m2 ; i++)
		{
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum = sum + 30;
			}
			if (i == 2)
			{
				if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
				{
					sum = sum + 29;
				}
				else
				{
				sum = sum + 28;
				}
			}
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				sum = sum + 31;
			}
		}
		sum = sum + d2;
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

