package <missing>;

public class GlobalMembers
{
	//???


	public static int days(int m) //???????1?????1?1?????
	{
		int d = 0;
		switch (m)
		{
		case 12:
			d += 30;
		case 11:
			d += 31;
		case 10:
			d += 30;
		case 9:
			d += 31;
		case 8:
			d += 31;
		case 7:
			d += 30;
		case 6:
			d += 31;
		case 5:
			d += 30;
		case 4:
			d += 31;
		case 3:
			d += 28;
		case 2:
			d += 31;
		}
		return d;
	}
	public static int Main()
	{
		int n; //????????1???2???1???2
		int year;
		int month1;
		int month2;
		int days1;
		int days2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			days1 = days(month1);
			days2 = days(month2);
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) //?????????????????????days+1
			{
				if (month1 > 2)
				{
					days1 += 1;
				}
				if (month2 > 2)
				{
					days2 += 1;
				}
			}
			if ((days1 - days2) % 7 == 0) //?????7??
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

