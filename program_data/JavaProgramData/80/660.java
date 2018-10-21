package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ya;
		int ma;
		int da;
		int yb;
		int mb;
		int db;
		int s = 0;
		int i;
		int[] mon1 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] mon2 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int q;
		ya = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ma = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		da = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		yb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		db = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = ya;i < yb;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				s = s + 366;
			}
			else
			{
				s = s + 365;
			}
		}
		if ((yb % 4 == 0 && yb % 100 != 0) || (yb % 400 == 0))
		{
			for (i = ma;i < mb;i++)
			{
				s = s + mon1[i];
			}
			for (i = mb;i < ma;i++)
			{
				s = s - mon1[i];
			}
		}
		else
		{
			for (i = ma;i < mb;i++)
			{
				s = s + mon2[i];
			}
			for (i = mb;i < ma;i++)
			{
				s = s - mon2[i];
			}
		}
		s = s + db - da;
		System.out.print(s);
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;

	}

}

