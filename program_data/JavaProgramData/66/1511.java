package <missing>;

public class GlobalMembers
{
	public static int f(int i)
	{
		int t;
		if (i % 100 == 0)
		{
				if (i % 400 == 0)
				{
				t = 1;
				}
				else
				{
				t = 0;
				}
		}
		else if (i % 4 == 0)
		{
			t = 1;
		}
		else
		{
			t = 0;
		}
			return t;
	}

	public static int Main()
	{
		int y;
		int m;
		int d;
		int n;
		int i;
		n = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y >= 2800)
		{
			y = y % 400 + 1;
			n += 5;
		}
		for (i = 1;i < y;i++)
		{
			if (f(i) == 1)
			{
			n += 2;
			}
			else
			{
			n++;
			}
		}
		if (f(y) == 1 && m > 2)
		{
		n++;
		}
		for (i = 1;i < m;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
			n += 3;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
			n += 2;
			}
		}
		n += d;
		n = n % 7;
		switch (n)
		{
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
			default:
				System.out.print("Sun.");
				System.out.print("\n");
		}
		return 0;
	}
}

