package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int leap = 0;
		int year;
		int mon1;
		int mon2;
		int day = 0;
		int[][] mon =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n;i++)
		{
			day = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			leap = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
			int m;
			m = mon1 > mon2 != 0?mon2:mon1;
			while (m < mon1 || m < mon2)
			{
				day += mon[leap][m];
				m++;
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

