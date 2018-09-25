package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int year;
		int m1;
		int m2;
		int leap;
		int days;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			days = 0;
			leap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
			if (m1 > m2)
			{
				int c = m1;
				m1 = m2;
				m2 = c;
			}
			for (; m1 < m2; m1++)
			{
				switch (m1)
				{
					case 2:
						days += 28 + leap;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						days += 30;
						break;
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						days += 31;
						break;
				}
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

