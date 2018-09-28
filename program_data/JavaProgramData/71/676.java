package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int year;
		int mon;
		int mona;
		int monb;
		int monc;
		int leap;
		int days;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
			days = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mona = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			monb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			leap = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
			if (mona < monb)
			{
			}
				else
				{
					monc = mona;
					mona = monb;
					monb = monc;
				}
				for (mon = mona; mon <= monb - 1; mon++)
				{
					switch (mon)
					{
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
					{
							days += 31;
							break;
					}
					case 4:
					case 6:
					case 9:
					case 11:
					{
							days += 30;
							break;
					}
					case 2:
					{
							days += 28 + leap;
							break;
					}
					}
				}
				//cout << "days=" << days << endl;
				if (days % 7 == 0)
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

