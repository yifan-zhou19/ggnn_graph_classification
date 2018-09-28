package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] year = new int[3001];
		int deta = 0;
		int year1;
		int year2;
		int mon1;
		int mon2;
		int day1;
		int day2;
		int i;
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 1;i <= 3001;i++)
		{
			year[i] = 365;
		}
		for (i = 1;i <= 3001;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
			year[i] = 366;
			}
		}

		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (year2 % 4 == 0)
		{
			deta = 1;
		}

		if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))
		{
			mon[2] = 28;
		}


		for (i = year1;i < year2;i++)
		{
			deta += year[i];
		}

		if (mon1 > mon2)
		{
			for (i = mon2;i < mon1;i++)
			{
				deta -= mon[i];
			}
		}

		if (mon2 > mon1)
		{
			for (i = mon1;i < mon2;i++)
			{
				deta += mon[i];
			}
		}

		deta = deta + day2 - day1;



		System.out.print(deta);
		System.out.print("\n");



		return 0;



	}





}

