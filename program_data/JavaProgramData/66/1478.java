package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s = 0;
		int i;
		int q;
		int y;
		int m;
		int d;
		int[] k = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] r = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] w = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));


		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			for (i = 1;i < m;i++)
			{
				s = (s + r[i]) % 7;
			}
			for (i = 1;i < d;i++)
			{
				s = (s + 1) % 7;
			}
		}
		else
		{
			for (i = 1;i < m;i++)
			{
				s = (s + k[i]) % 7;
			}
			for (i = 1;i < d;i++)
			{
				s = (s + 1) % 7;
			}
		}

		y = y - y / 2800 * 2800;
		for (i = 0;i <= y - 1;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				s = (s + 366) % 7;
			}
			else
			{
				s = (s + 365) % 7;
			}
		}
		System.out.print(w[(s + 5) % 7]);
		System.out.print("\n");
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

