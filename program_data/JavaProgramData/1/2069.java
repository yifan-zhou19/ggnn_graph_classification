package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int a;
	public static int cnt = 0;
	public static int num;
	public static int decompose(int x, int y)
	{
		int i;
		int xnum = 1;
		if (x == 1)
		{
			return 0;
		}
		if (x == 2)
		{
			return 1;
		}
		for (i = y; i <= (int)Math.sqrt(x); i++)
		{
			if (x % i == 0)
			{
				xnum += decompose(x / i, i);
			}
		}
		return xnum;
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (cnt < n)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = decompose(a, 2);
			System.out.print(num);
			System.out.print("\n");
			cnt++;
		}
		return 0;
	}

}

