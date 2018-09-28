package <missing>;

public class GlobalMembers
{
	public static int run_check(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 1;
		}
		return 0;
	}

	public static int[] t = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			int y;
			int a;
			int b;
			int s = 0;
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a > b)
			{
				swap(a, b);
			}
			if (run_check(y) != 0)
			{
				t[2]++;
			}
			for (int j = a; j < b; j++)
			{
				s += t[j];
			}
			if (s % 7 != 0)
			{
				System.out.print("NO\n");
			}
			else
			{
				System.out.print("YES\n");
			}
			if (run_check(y) != 0)
			{
				t[2]--;
			}
		}

		return 0;
	}

}

