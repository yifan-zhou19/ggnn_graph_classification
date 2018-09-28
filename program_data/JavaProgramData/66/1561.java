package <missing>;

public class GlobalMembers
{
	public static int check(int n)
	{
		if ((n % 4 != 0) || (n % 100 == 0 && n % 400 != 0))
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
	public static int Main()
	{

		int[] a = {3, 3, 6, 8, 11, 13, 16, 19, 21, 24, 26, 29};
		int[] b = {3, 4, 7, 9, 12, 14, 17, 20, 22, 25, 27, 30};

	int y;
	int m;
	int d;
	int i;
	int x;
	int sum = 0;
	y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (y == 1)
	{
		if (m == 1)
		{
			sum = d;
		}
		else
		{
			sum = a[m - 2] + d;

		}

	}
	if (y != 1)
	{

		x = (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
		sum = sum + 2 * x + (y - 1 - x);
		if (m == 1)
		{
			sum = sum + d;
		}
		if (m != 1)
		{
		if (check(y) == 1)
		{
			sum = sum + a[m - 2] + d;
		}
		if (check(y) == 2)
		{
				sum = sum + b[m - 2] + d;
		}

		}
	}

	if (sum % 7 == 0)
	{
		System.out.print("Sun.");
		System.out.print("\n");
	}
	if (sum % 7 == 1)
	{
		System.out.print("Mon.");
		System.out.print("\n");
	}
	if (sum % 7 == 2)
	{
		System.out.print("Tue.");
		System.out.print("\n");
	}
	if (sum % 7 == 3)
	{
		System.out.print("Wed.");
		System.out.print("\n");
	}
	if (sum % 7 == 4)
	{
		System.out.print("Thu.");
		System.out.print("\n");
	}
	if (sum % 7 == 5)
	{
		System.out.print("Fri.");
		System.out.print("\n");
	}
	if (sum % 7 == 6)
	{
		System.out.print("Sat.");
		System.out.print("\n");
	}

		return 0;
	}

}

