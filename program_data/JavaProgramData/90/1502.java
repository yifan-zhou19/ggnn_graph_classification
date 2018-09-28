package <missing>;

public class GlobalMembers
{
	public static int arrange(int a, int l, int before)
	{
		if (l == 1)
		{
		return 1;
		}
		int sum = 0;
		for (int i = before; i <= a ; i++)
		{
			if (a - i >= i)
			{
			 sum += arrange(a - i, l - 1, i);
			}
			else
			{
				break;
			}
		}
		return sum;
	}
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < t; i++)
		{
		int n;
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(arrange(m, n, 0));
		System.out.print("\n");
		}

	}

}

