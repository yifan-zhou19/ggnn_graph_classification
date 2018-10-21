package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int g;
		int m;
		int n;
		int method = new int(int m, int n);

		g = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (g-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(method(m, n));
			System.out.print("\n");
		}
		return 0;
	}

	public static int method(int m,int n)
	{
		if (m == 0)
		{
			return 1;
		}
		else if (m == 1)
		{
			return 1;
		}
		else if (n == 1)
		{
			return 1;
		}
		else
		{
			if (m >= n)
			{
				return method(m - n, n) + method(m, n - 1);
			}
			else
			{
				return method(m, n - 1);
			}
		}
	}

}

