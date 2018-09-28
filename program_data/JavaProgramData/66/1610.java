package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int y;
		int m;
		int d;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int x;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = y % 400;
		if (y == 0)
		{
			y = 400;
		}
		x = (y - 1) * 365 + (y - 1) / 400 + (y - 1) / 4 - (y - 1) / 100;
		if (m == 1)
		{
			x += d;
		}
		else if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			for (i = 0;i < m - 1;i++)
			{
				x += b[i];
			}
			x += d;
		}
		else
		{
			for (i = 0;i < m - 1;i++)
			{
				x += a[i];
			}
			x += d;
		}
		switch ((x - 1) % 7)
		{
		case 0:
			System.out.print("Mon.");
			System.out.print("\n");
			break;
		case 1:
			System.out.print("Tue.");
			System.out.print("\n");
			break;
		case 2:
			System.out.print("Wen.");
			System.out.print("\n");
			break;
		case 3:
			System.out.print("Thu.");
			System.out.print("\n");
			break;
		case 4:
			System.out.print("Fri.");
			System.out.print("\n");
			break;
		case 5:
			System.out.print("Sat.");
			System.out.print("\n");
			break;
		case 6:
			System.out.print("Sun.");
			System.out.print("\n");
			break;
		}
		return 0;
	}
}

