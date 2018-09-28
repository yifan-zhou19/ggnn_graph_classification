package <missing>;

public class GlobalMembers
{
	public static int t(int u)
	{
		if (u == 1)
		{
			return 1;
		}
		else if (u == 2)
		{
			return 1;
		}
		else
		{
			return (t(u - 1) + t(u - 2));
		}
	}
	public static int Main()
	{
		int n;
		int u;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ;i++)
		{
			u = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(t(u));
			System.out.print("\n");
		}
		return 0;
	}

}

