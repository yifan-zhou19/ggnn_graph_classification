package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int res = 0;
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		while (sy != ey || sm != em || sd != ed)
		{
			if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
			{
				mon[2] = 29;
			}
			else
			{
				mon[2] = 28;
			}
			sd++;
			if (sd > mon[sm])
			{
				sd = 1;
				sm++;
			}
			if (sm > 12)
			{
				sm = 1;
				sy++;
			}
			res++;
		}
		System.out.print(res);
		System.out.print("\n");
		return 0;
	}
}

