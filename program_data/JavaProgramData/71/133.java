package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int year;
		int days;
		int mon1;
		int mon2;
		int tmon1;
		int tmon2;
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			tmon1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			tmon2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon1 = tmon1 < tmon2 != 0 ? tmon1 : tmon2;
			mon2 = tmon1 > tmon2 != 0 ? tmon1 : tmon2;
			if (mon1 <= 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
			{
				days = 1;
			}
			else
			{
				days = 0;
			}
			for (; mon1 < mon2; mon1++)
			{
				days += month[mon1 - 1];
			}

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

