package <missing>;

public class GlobalMembers
{
	public static int days(int x, int y, int z)
	{
		int sum = 0;
		int leap = (x % 4 == 0 && x % 100 != 0) || (x % 400 == 0);
		for (int i = 1; i < y; i++)
		{
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum += 30;
			}
			else if (i == 2)
			{
				sum += (leap + 28);
			}
			else
			{
				sum += 31;
			}
		}
		sum += z;
		return sum;
	}
	public static int Main()
	{
		int x;
		int y;
		int a;
		int z;
		int b;
		int c;
		int sum = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = x; i < a; i++)
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
		sum = sum + days(a, b, c) - days(x, y, z);
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

