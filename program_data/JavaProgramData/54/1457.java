package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int Div(int rest,int w)
	{
		if (w == 0)
		{
			return rest;
		}
		if (rest % (n - 1) != 0)
		{
			return -1;
		}
		else
		{
			return Div(rest + rest / (n - 1) + k, w - 1);
		}
	}
	public static int Main()
	{
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;;i++)
		{
			t = Div(i * n + k, n - 1);
			if (t != -1)
			{
				System.out.print(t);
				return 0;
			}
		}
		return 0;
	}
}

