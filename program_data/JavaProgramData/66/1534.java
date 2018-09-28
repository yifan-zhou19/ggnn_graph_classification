package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int sumd = 0;
		int[] X = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (y > 2800)
		{
			y -= 2800;
		}
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			X[1]++;
		}
		while (y > 1)
		{
			y--;
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			{
				sumd += 366;
			}
			else
			{
				sumd += 365;
			}
		}
		while (m > 1)
		{
			sumd += X[m - 2];
			m--;
		}
		sumd += d;
		sumd = sumd % 7;
		switch (sumd)
		{
			case 0:
				System.out.print("Sun.");
				break;
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
		}
		return 0;
	}
}

