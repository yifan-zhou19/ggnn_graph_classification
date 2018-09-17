package <missing>;

public class GlobalMembers
{
	public static int F(int a)
	{
		if (a % 2 == 0)
		{
			a = a / 2;
		}
		else
		{
			a = (a - 1) / 2;
		}
		return a;
	}

	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != b)
		{
			if (a > b)
			{
				a = F(a);
			}
			if (a < b)
			{
				b = F(b);
			}
		}
		System.out.print(a);
		return 0;
	}
}

