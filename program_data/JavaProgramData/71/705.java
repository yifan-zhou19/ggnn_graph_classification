package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int leap;
		int j;
		int month;
		int year;
		int m1;
		int m2;
		int d = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
					d = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
			{
				leap = 1;
			}
			else
			{
				leap = 0;
			}
			if (m1 > m2)
			{
				month = m2;
				m2 = m1;
				m1 = month;
			}
			for (j = m1;j < m2;j++)
			{
				switch (j)
				{
				case 1 :
				case 3 :
				case 5 :
				case 7 :
				case 8 :
				case 10 :
				case 12 :
					d += 31;
					break;

				case 4 :
				case 6 :
				case 9 :
				case 11 :
					d += 30;
					break;

				case 2 :
					d = d + 28 + leap;
					break;
				}
			}
			if (d % 7 == 0)
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

