package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static int fenpei(int a, int b)
	{
		if (b == 0 || a < 0)
		{
			return 0;
		}
		if (a == 1 || a == 0 || b == 1)
		{
			return 1;
		}
		return fenpei(a, b - 1) + fenpei(a - b, b);
	}
	public static int Main()
	{
		int i = 0;
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i > 0)
		{
			int panzi = 0;
			int apple = 0;
			apple = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			panzi = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fenpei(apple, panzi));
			System.out.print("\n");
			i--;
		}
		return 0;
	}
}

