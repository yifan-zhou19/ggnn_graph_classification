package <missing>;

public class GlobalMembers
{
	public static int num = 1;
	public static int i;
	public static int factor;

	public static void f(int factor, int x)
	{
		for (; factor * factor <= x; factor++)
		{
			if (x % factor == 0)
			{
				num++;
				f(factor, x / factor);
			}
		}
	}

	public static int Main()
	{
		int a;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			f(2, a);
			System.out.print(num);
			System.out.print("\n");
			num = 1;
		}

		return 0;
	}

}

