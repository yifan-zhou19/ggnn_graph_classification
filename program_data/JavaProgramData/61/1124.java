package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = int;

		int n;
		int i;
		int a;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			a = f(a);

			System.out.print(a);
			System.out.print("\n");
		}

		return 0;
	}

	public static int f(int a)
	{
		if (a == 1 || a == 2)
		{
			return 1;
		}
		else
		{
			return f(a - 1) + f(a - 2);
		}
	}

}

