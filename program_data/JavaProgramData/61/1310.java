package <missing>;

public class GlobalMembers
{
	public static int fei(int a)
	{
		if (a == 1 || a == 2)
		{
			return 1;
		}
		else
		{
			return fei(a - 1) + fei(a - 2);
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fei(m));
			System.out.print("\n");
		}
		return 0;
	}
}

