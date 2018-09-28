package <missing>;

public class GlobalMembers
{
	public static int min(int a, int b)
	{
		if (a < b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}

	public static int Main()
	{
		int n;
		int m;
		int s;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; ++i)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = 60;
			for (int j = 1; j <= m; ++j)
			{
				t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				t += j + j + j - 3;
				if (t <= 60)
				{
					s -= min(3, 60 - t);
				}
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}
}

