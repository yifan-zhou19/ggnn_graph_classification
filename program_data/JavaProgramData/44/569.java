package <missing>;

public class GlobalMembers
{
	public static int shorten(int a)
	{
		while (a % 10 == 0)
		{
			a /= 10;
		}
		return a;
	}
	public static void reverse(int a)
	{
		System.out.print(a % 10);
		a /= 10;
		if (a != 0)
		{
			reverse(a);
		}
	}
	public static int Main()
	{
		int a;
		for (int i = 1;i <= 6;i++)
		{
			int b = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a < 0)
			{
				System.out.print("-");
			}
			a = Math.abs(a);
			if (a > 0)
			{
				a = shorten(a);
			}
			reverse(a);
			System.out.print("\n");
		}
		return 0;
	}
}

