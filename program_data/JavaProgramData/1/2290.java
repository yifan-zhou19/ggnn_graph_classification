package <missing>;

public class GlobalMembers
{
	//????

	public static int f(int x,int min)
	{
		if (x < min)
		{
			return 0;
		}
		int r = 1;
		for (int i = min;i < x / 2;i++)
		{
			if (x % i == 0)
			{
				r += f(x / i, i);
			}
		}
		return r;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			int x;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(x, 2));
			System.out.print("\n");
		}
	}

}

