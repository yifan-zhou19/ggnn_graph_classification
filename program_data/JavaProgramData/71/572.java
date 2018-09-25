package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int leap;
		int day;
		int year;
		int m1;
		int m2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			day = 0;
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				leap = 1;
			}
			else
			{
				leap = 0;
			}
			if (m1 > m2)
			{
				t = m2;
				m2 = m1;
				m1 = t;
			}
			for (j = m1; j < m2; j++)
			{
				switch (j)
				{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					day += 31;
					break;
				case 2:
					day += 28 + leap;
					break;
				default:
					day += 30;
					break;
				}
			}
			if (day % 7 == 0)
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

