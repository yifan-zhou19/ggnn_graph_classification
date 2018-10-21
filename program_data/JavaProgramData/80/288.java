package <missing>;

public class GlobalMembers
{
	// jisuanlianggeriqijiandetianshu.cpp : Defines the entry point for the console application.
	//



	public static int Main()
	{
		int[] yearr = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] yearp = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int sty = 0;
		int stm = 0;
		int str = 0;

		int eny = 0;
		int enm = 0;
		int enr = 0;

		int i = 0;
		int t = 0;
		int j = 0;

		int day = 0;
		int year = 0;
		int mon = 0;


		sty = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		stm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eny = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		enm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		enr = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i <= eny - sty;i++)
		{
			year = sty + i;

			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				if (year == sty && year != eny)
				{
					for (t = stm;t <= 12;t++)
					{
						if (t == stm)
						{
							day += yearr[t] - str;
						}
						else
						{
							day += yearr[t];
						}
					}
				}
				if (year == eny && year != sty)
				{
					for (t = 1;t <= enm;t++)
					{
						if (t == enm)
						{
							day += enr;
						}
						else
						{
							day += yearr[t];
						}
					}
				}

				if (year != eny && year != sty)
				{
					for (t = 1;t <= 12;t++)
					{
						day += yearr[t];
					}
				}
				if (year == eny && year == sty)
				{
					if (stm == enm)
					{
						day += enr - str;
					}
					else
					{
						for (t = stm;t <= enm;t++)
						{
							if (t == stm)
							{
								day += yearr[t] - str;
							}
							else if (t == enm)
							{
								day += enr;
							}
							else if (t != stm && t != enm)
							{
								day += yearr[t];
							}
						}
					}
				}
			}
			else
			{
				if (year == sty && year != eny)
				{
					for (t = stm;t <= 12;t++)
					{
						if (t == stm)
						{
							day += yearp[t] - str;
						}
						else
						{
							day += yearp[t];
						}
					}
				}
				if (year == eny && year != sty)
				{
					for (t = 1;t <= enm;t++)
					{
						if (t == enm)
						{
							day += enr;
						}
						else
						{
							day += yearp[t];
						}
					}
				}

				if (year != eny && year != sty)
				{
					for (t = 1;t <= 12;t++)
					{
						day += yearp[t];
					}
				}
				if (year == eny && year == sty)
				{
					if (stm == enm)
					{
						day += enr - str;
					}
					else
					{
						for (t = stm;t <= enm;t++)
						{
							if (t == stm)
							{
								day += yearp[t] - str;
							}
							else if (t == enm)
							{
								day += enr;
							}
							else if (t != stm && t != enm)
							{
								day += yearp[t];
							}
						}
					}
				}

			}
		}

		System.out.print(day);

		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		return 0;
	}








}

