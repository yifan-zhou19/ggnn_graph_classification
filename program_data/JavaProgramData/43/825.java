package <missing>;

public class GlobalMembers
{
	public static int jud(int k)
	{
		int s = Math.sqrt(k);
		for (int i = 2;i <= s;i++)
		{
			if (k % i == 0)
			{
				return 0;
			}
		}
		return 1;


	}
	public static int Main()
	{
		int m;
		int t;
		int s;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 3;t <= m / 2;t++)
		{
			s = m - t;
			if (jud(s) + jud(t) == 2)
			{
				System.out.print(t);
				System.out.print(' ');
				System.out.print(s);
				System.out.print("\n");
			}

		}
		return 0;

	}
}

