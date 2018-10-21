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
		int d = 0;
		int[] y = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 0};
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
				d = d + 366;
			}
			else
			{
				d = d + 365;
			}
		}
		for (i = m1;i > 1;i--)
		{
			if (i == 2 && (y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				d = d - 29;
			}
			else
			{
				d = d - y[i - 1];
			}
		}
		d = d - d1 + 1;
		for (i = 1;i < m2;i++)
		{
			if (i == 2 && (y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
			{
				d = d + 29;
			}
			else
			{
				d = d + y[i];
			}

		}
		d = d + d2 - 1;
		System.out.print(d);

		return 0;
	}







}

