package <missing>;

public class GlobalMembers
{
	//???
	public static int n;
	public static int k;

	public static int f(int s,int m)
	{
		m = m * n + k;
		if (s == 1)
		{
			System.out.print(m);
			System.out.print("\n");
			return 1;

		}
		if (m % (n - 1) == 0 && f(s - 1, m / (n - 1)) != 0)
		{
			return 1;
		}
		return 0;
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 1;;i++)
		{
			if (f(n, i) != 0)
			{
				break;
			}
		}
		return 0;
	}

}

