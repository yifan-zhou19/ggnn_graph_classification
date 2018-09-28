package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = int a;
		int i;
		int n;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(c));
		System.out.print("\n");
		}
		return 0;
	}

	public static int f(int a)
	{
		int b;
		if (a < 0)
		{
			System.out.print("error");
			b = -1;
		}
		else if (a == 1 || a == 2)
		{
			b = 1;
		}
		else
		{
			b = f(a - 1) + f(a - 2);
		}
		return b;
	}

}

