package <missing>;

public class GlobalMembers
{
	public static int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int Main()
	{
		int m;
		int d;
		int i;
		int count = 0;
		int y;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	count = count + (y - 1) + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			{
			for (i = 0;i <= m - 1;i++)
			{
				count = count + b[i];
			}
			}
		else
		{
			for (i = 0;i <= m - 1;i++)
			{
				count = count + a[i];
			}
		}
		count += d - 1;
		switch (count % 7)
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
			System.out.print("Wed.");
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

