package <missing>;

public class GlobalMembers
{
	public static int min(int x,int y)
	{
		if (x > y)
		{
			return y;
		}
		else
		{
			return x;
		}
	}
	public static int max(int x,int y)
	{
		if (x < y)
		{
			return y;
		}
		else
		{
			return x;
		}
	}
	public static int Main()
	{
		int x;
		int y;
		int a;
		int b;
		int logofa;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = min(x, y);
		b = max(x, y);
		logofa = (Math.log(a) / Math.log(2.0));
		while (b >= (Math.pow(2.0, logofa + 1)))
		{
			b = b / 2;
		}
		while (a > 0)
		{
			if (a == b)
			{
				System.out.print(a);
				break;
			}
			a = a / 2;
			b = b / 2;

		}

	}
}

