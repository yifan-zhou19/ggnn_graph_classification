package <missing>;

public class GlobalMembers
{
	public static int Apple(int a, int p)
	{
		int sum = 0;
		if (a <= 1 || p == 1)
		{
			return 1;
		}
		if (a < p)
		{
			return Apple(a, a);
		}
		for (int i = 1; i <= p; i++)
		{
			sum += Apple(a - i, i);
		}
		return sum;
	}
	public static int Main()
	{
		int t;
		int a;
		int p;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < t; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(Apple(a, p));
			System.out.print("\n");
		}
		return 0;
	}
}

