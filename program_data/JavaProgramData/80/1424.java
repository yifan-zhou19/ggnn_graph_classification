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
		int sum;
		int sum1 = 0;
		int sum2 = 0;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		for (i = 1;i < y1;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				sum1 = sum1 + 366;
			}
			else
			{
				sum1 = sum1 + 365;
			}
		}
		if ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0)
		{
			a[2] = 29;
		}
		if (m1 > 1)
		{
			for (i = 1;i <= m1 - 1;i++)
			{
		sum1 = sum1 + a[i];
			}
		}


			sum1 = sum1 + d1;
		a[2] = 28;
		for (i = 1;i < y2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				sum2 = sum2 + 366;
			}
			else
			{
				sum2 = sum2 + 365;
			}
		}
		if ((y2 % 4 == 0 && y2 % 100 != 0) || y2 % 400 == 0)
		{
			a[2] = 29;
		}
		if (m2 > 1)
		{
		for (i = 1;i <= m2 - 1;i++)
		{
			sum2 = sum2 + a[i];
		}
		}
		sum2 = sum2 + d2;
		sum = sum2 - sum1;
		System.out.print(sum);
		return 0;
	}
}

