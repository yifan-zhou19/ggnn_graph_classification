package <missing>;

public class GlobalMembers
{
	public static int feb(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else
		{
			if (n == 2)
			{
				return 1;
			}
			else
			{
				return feb(n - 1) + feb(n - 2);
			}
		}
		return true;
	}

	public static int Main()
	{
		int m;
		int zu;
		int i;
		int[] mem = new int[10000];
		zu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < zu; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mem[i] = feb(m);
		}
		for (i = 0; i < zu; i++)
		{
			if (i < zu - 1)
			{
				System.out.print(mem[i]);
				System.out.print("\n");
			}
			else
			{
				System.out.print(mem[i]);
			}
		}
		return 0;
	}
}

