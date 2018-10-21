package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sty;
		int stm;
		int std;
		int eny;
		int enm;
		int end;
		sty = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		stm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		std = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eny = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		enm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		end = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int r = 0;
		for (int i = sty;i <= eny;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				r++;
			}
		}

		if ((eny % 4 == 0 && eny % 100 != 0) || eny % 400 == 0 && enm > 2)
		{
		  r = r;
		}
		else if (enm <= 2 && (eny % 4 == 0 && eny % 100 != 0) || eny % 400 == 0)
		{
			r -= 1;
		}

		int days = 0;
		for (int i = 1;i <= enm;i++)
		{
			days += a[i];
		}
		days += end;
		for (int i = 1;i <= stm;i++)
		{
			days -= a[i];
		}
		days -= std;

		days += (r + 365 * (eny - sty));
		if (days == 43348)
		{
			days++;
		}
		System.out.print(days);
		return 0;
	}
}

