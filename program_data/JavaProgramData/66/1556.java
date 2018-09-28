package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int s = 0;
		int x;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = (y - 1) % 400 + 1;
		if (y > 1)
		{
			for (int i = 1;i < y;i++)
			{
				if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
				{
					s = s + 2;
				}
				else
				{
					s = s + 1;
				}
			}
		}
		if (m > 1)
		{
			if (y % 4 == 0 && y % 100 != 0)
			{
				a[1] = 29;
			}
			for (int i = 1;i < m;i++)
			{
				s = s + a[i - 1];
			}
		}
		s = s + d;
		switch (s % 7)
		{
		case 0:
			System.out.print("Sun.");
			System.out.print("\n");
			break;
		case 1:
			System.out.print("Mon.");
			System.out.print("\n");
			break;
		case 2:
			System.out.print("Tue.");
			System.out.print("\n");
			break;
		case 3:
			System.out.print("Wed.");
			System.out.print("\n");
			break;
		case 4:
			System.out.print("Thu.");
			System.out.print("\n");
			break;
		case 5:
			System.out.print("Fri.");
			System.out.print("\n");
			break;
		case 6:
			System.out.print("Sat.");
			System.out.print("\n");
			break;
		}
		return 0;
	}
}

