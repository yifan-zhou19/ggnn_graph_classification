package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int starty;
		int startm;
		int startd;
		int endy;
		int endm;
		int endd;
		int days = 0;
		int i;

		starty = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (starty != endy)
		{
		for (i = starty + 1;i < endy;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				days = days + 366;
			}
			else
			{
				days = days + 365;
			}
		}
		}

		if (!(starty == endy && startm == endm))

		{
			for (i = startm;i <= 12;i++)
			{
			if (i == 2)
			{
				if ((starty % 4 == 0 && starty % 100 != 0) || (starty % 400 == 0))
				{
					days = days + 29;
				}
				else
				{
					days = days + 28;
				}
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				days = days + 30;
			}
			else
			{
				days = days + 31;
			}
			}
		for (i = 1;i < endm;i++)
		{
			if (i == 2)
			{
				if ((endy % 4 == 0 && endy % 100 != 0) || (endy % 400 == 0))
				{
					days = days + 29;
				}
				else
				{
					days = days + 28;
				}
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				days = days + 30;
			}
			else
			{
				days = days + 31;
			}
		}

		}

		days = days - startd;
		days = days + endd;

		System.out.print(days);

		return 0;
	}
}

