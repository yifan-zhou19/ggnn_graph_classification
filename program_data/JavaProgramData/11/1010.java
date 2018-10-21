package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 100 == 0)
		{
			if (n % 400 == 0)
			{
			return 1;
			}
			else
			{
				return 0;
			}
		}
		else if (n % 4 == 0)
		{
			return 1;
		}
		else
		{
		 return 0;
		}
	}

	public static int Main()
	{
		int y;
		int m;
		int d;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int t = 0;
		int i;
		for (i = 1;i < m;i++)
		{
			if (i == 1 || i == 5 || i == 3 || i == 7 || i == 8 || i == 10)
			{
			t = t + 31;
			}
			else if (i == 2)
			{
			t = t + 28;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
			t = t + 30;
			}
		}
		t = t + d;
		if (f(y) == 1 && m > 2)
		{
		t = t + 1;
		}
		System.out.print(t);
		System.out.print("\n");
		return 0;
	}
}

