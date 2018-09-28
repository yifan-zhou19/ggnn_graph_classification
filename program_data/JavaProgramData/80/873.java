package <missing>;

public class GlobalMembers
{
	public static int leapy(int n)
	{
		if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int s = 0;
		int t;
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] month =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int[] year = {365, 366};
		if (sy == ey)
		{
			for (int i = sm;i <= em;i++)
			{
				s = s + month[leapy(sy)][i];
			}
			s = s - sd + 1 - (month[leapy(sy)][em] - ed);
		}
		else
		{
		for (int i = sm + 1;i <= 12;i++)
		{
			s = s + month[leapy(sy)][i];
		}
		s = s + month[leapy(sy)][sm] - sd + 1;
		for (int i = 1;i < em;i++)
		{
			s = s + month[leapy(ey)][i];
		}
		s = s + ed;
		if (ey - sy > 1)
		{
		for (int i = sy + 1;i <= ey - 1;i++)
		{
			s = s + year[leapy(i)];
		}
		}
		}
		System.out.print(s - 1);

		return 0;
	}
}

