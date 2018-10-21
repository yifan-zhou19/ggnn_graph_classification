package <missing>;

public class GlobalMembers
{
	public static int fact(int a, int min)
	{
		if (a < min)
		{
			return 0;
		}
		int way = 1;
		for (int i = min; i <= Math.sqrt((double)a); i++)
		{
		if (a % i == 0)
		{
			way += fact(a / i, i);
		}
		}
		return way;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			int c;
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fact(c, 2));
			System.out.print("\n");
		}
		return 0;
	}

}

