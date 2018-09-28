package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int y;
		int l_y;
		int l_y1;
		int m;
		int d;
		int t = 0;
		int w;
		int[] m_p = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] r_p = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (y > 400)
		{
			y = y - 400;
		}
		/*cout<<y<<" ";*/
		l_y1 = ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0));
		while (y > 1)
		{
			y--;
			l_y = ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0));
			if (l_y == 0)
			{
				t = t + 365;
			}
			else
			{
				t = t + 366;
			}
			/*cout<<t<<" ";*/
		}
		if (l_y1 == 0)
		{
			for (i = 0;i < m - 1;i++)
			{
				t = t + m_p[i];
			}
		}
		else
		{
			for (i = 0;i < m - 1;i++)
			{
				t = t + r_p[i];
			}
		}
		/*cout<<t<<" ";*/
		t = t + d - 1;
		/*cout<<t<<" ";*/
		w = t % 7;
		System.out.print(week[w]);
		System.out.print("\n");
		return 0;
	}
}

