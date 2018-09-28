package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int day = 0;
		int n;
		int y;
		int m;
		int d;
		int i;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))
		{
			month[2] = 29;
		}
		else
		{
			month[2] = 28;
		}
		for (i = 1; i <= 400; i++)
		{
			if (i % 400 == 0 || (i % 100 != 0 && i % 4 == 0))
			{
				day += 366;
			}
			else
			{
				day += 365;
			}
		}
		day = day % 7;
		k = (y - 1) / 400;
		day = day * k;
		y = (y - 1) % 400;
		for (i = 1; i <= y; i++)
		{
			if (i % 400 == 0 || (i % 100 != 0 && i % 4 == 0))
			{
				day += 366;
			}
			else
			{
				day += 365;
			}
		}

		for (i = 1; i < m; i++)
		{
			day += month[i];
		}
		day += d;

		n = day % 7;
		switch (n)
		{
			case 1:
				System.out.print("Mon.");
				break;
			case 2:
				System.out.print("Tue.");
				break;
			case 3:
				System.out.print("Wed.");
				break;
			case 4:
				System.out.print("Thu.");
				break;
			case 5:
				System.out.print("Fri.");
				break;
			case 6:
				System.out.print("Sat.");
				break;
			case 0:
				System.out.print("Sun.");
				break;
		}


		return 0;
	}


}

