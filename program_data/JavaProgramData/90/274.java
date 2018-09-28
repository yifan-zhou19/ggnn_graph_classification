package <missing>;

public class GlobalMembers
{
	public static int placeMethod(int a, int b)
	{
		int sum;
		if (a == 0)
		{
			return 1;
		}
		if (b == 1)
		{
			return 1;
		}
		if (a < b)
		{
			return placeMethod(a, b - 1);
		}
		else
		{
			return placeMethod(a - b, b) + placeMethod(a, b - 1);
		}

	}
	public static int Main()
	{
		int n;
		int a;
		int b;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = placeMethod(a, b);
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}
}

